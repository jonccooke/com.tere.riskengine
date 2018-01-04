package com.tere.finance.risk.riskengine.marketdata.providers.yahoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

import org.joda.time.DateTime;

import com.tere.finance.risk.riskengine.marketdata.MarketDataListener;
import com.tere.finance.risk.riskengine.marketdata.MarketDataProvider;
import com.tere.finance.risk.riskengine.marketdata.providers.NotConnectedException;
import com.tere.finance.risk.riskengine.model.instrument.Index;
import com.tere.finance.risk.riskengine.model.instrument.Instrument;
import com.tere.finance.risk.riskengine.model.valuation.Curve;
import com.tere.finance.risk.riskengine.model.valuation.Quote;

/*
 * Name	Description	Tag
 AfterHoursChangeRealtime	After Hours Change (Realtime)	c8
 AnnualizedGain	Annualized Gain	g3
 Ask	Ask	a0
 AskRealtime	Ask (Realtime)	b2
 AskSize	Ask Size	a5
 AverageDailyVolume	Average Daily Volume	a2
 Bid	Bid	b0
 BidRealtime	Bid (Realtime)	b3
 BidSize	Bid Size	b6
 BookValuePerShare	Book Value Per Share	b4
 Change	Change	c1
 Change_ChangeInPercent	Change Change In Percent	c0
 ChangeFromFiftydayMovingAverage	Change From Fiftyday Moving Average	m7
 ChangeFromTwoHundreddayMovingAverage	Change From Two Hundredday Moving Average	m5
 ChangeFromYearHigh	Change From Year High	k4
 ChangeFromYearLow	Change From Year Low	j5
 ChangeInPercent	Change In Percent	p2
 ChangeInPercentRealtime	Change In Percent (Realtime)	k2
 ChangeRealtime	Change (Realtime)	c6
 Commission	Commission	c3
 Currency	Currency	c4
 DaysHigh	Days High	h0
 DaysLow	Days Low	g0
 DaysRange	Days Range	m0
 DaysRangeRealtime	Days Range (Realtime)	m2
 DaysValueChange	Days Value Change	w1
 DaysValueChangeRealtime	Days Value Change (Realtime)	w4
 DividendPayDate	Dividend Pay Date	r1
 TrailingAnnualDividendYield	Trailing Annual Dividend Yield	d0
 TrailingAnnualDividendYieldInPercent	Trailing Annual Dividend Yield In Percent	y0
 DilutedEPS	Diluted E P S	e0
 EBITDA	E B I T D A	j4
 EPSEstimateCurrentYear	E P S Estimate Current Year	e7
 EPSEstimateNextQuarter	E P S Estimate Next Quarter	e9
 EPSEstimateNextYear	E P S Estimate Next Year	e8
 ExDividendDate	Ex Dividend Date	q0
 FiftydayMovingAverage	Fiftyday Moving Average	m3
 SharesFloat	Shares Float	f6
 HighLimit	High Limit	l2
 HoldingsGain	Holdings Gain	g4
 HoldingsGainPercent	Holdings Gain Percent	g1
 HoldingsGainPercentRealtime	Holdings Gain Percent (Realtime)	g5
 HoldingsGainRealtime	Holdings Gain (Realtime)	g6
 HoldingsValue	Holdings Value	v1
 HoldingsValueRealtime	Holdings Value (Realtime)	v7
 LastTradeDate	Last Trade Date	d1
 LastTradePriceOnly	Last Trade Price Only	l1
 LastTradeRealtimeWithTime	Last Trade (Realtime) With Time	k1
 LastTradeSize	Last Trade Size	k3
 LastTradeTime	Last Trade Time	t1
 LastTradeWithTime	Last Trade With Time	l0
 LowLimit	Low Limit	l3
 MarketCapitalization	Market Capitalization	j1
 MarketCapRealtime	Market Cap (Realtime)	j3
 MoreInfo	More Info	i0
 Name	Name	n0
 Notes	Notes	n4
 OneyrTargetPrice	Oneyr Target Price	t8
 Open	Open	o0
 OrderBookRealtime	Order Book (Realtime)	i5
 PEGRatio	P E G Ratio	r5
 PERatio	P E Ratio	r0
 PERatioRealtime	P E Ratio (Realtime)	r2
 PercentChangeFromFiftydayMovingAverage	Percent Change From Fiftyday Moving Average	m8
 PercentChangeFromTwoHundreddayMovingAverage	Percent Change From Two Hundredday Moving Average	m6
 ChangeInPercentFromYearHigh	Change In Percent From Year High	k5
 PercentChangeFromYearLow	Percent Change From Year Low	j6
 PreviousClose	Previous Close	p0
 PriceBook	Price Book	p6
 PriceEPSEstimateCurrentYear	Price E P S Estimate Current Year	r6
 PriceEPSEstimateNextYear	Price E P S Estimate Next Year	r7
 PricePaid	Price Paid	p1
 PriceSales	Price Sales	p5
 Revenue	Revenue	s6
 SharesOwned	Shares Owned	s1
 SharesOutstanding	Shares Outstanding	j2
 ShortRatio	Short Ratio	s7
 StockExchange	Stock Exchange	x0
 Symbol	Symbol	s0
 TickerTrend	Ticker Trend	t7
 TradeDate	Trade Date	d2
 TradeLinks	Trade Links	t6
 TradeLinksAdditional	Trade Links Additional	f0
 TwoHundreddayMovingAverage	Two Hundredday Moving Average	m4
 Volume	Volume	v0
 YearHigh	Year High	k0
 YearLow	Year Low	j0
 YearRange	Year Range	w0 
 */
// http://download.finance.yahoo.com/d/quotes.csv?s=GOOG&f=d1d2n0s0l1o0h0g0p0v0&e=.csv
public class YahooProvider implements MarketDataProvider
{
	private static String quoteBaseUrlStr = "http://download.finance.yahoo.com/d/quotes.csv?";
	private static String historicalBaseUrlStr = "http://ichart.yahoo.com/table.csv";
	private static Map<String, Collection<MarketDataListener>> listeners = new ConcurrentHashMap<String, Collection<MarketDataListener>>();
	private long updateInterval = 100;
	private YahooMarketDataThread marketDataThread;
	private DateFormat dateFormat =  new SimpleDateFormat("MM/dd/yyyy");
	
	protected String createHistoricalUrlString(String code, Date startDate,
			Date endDate)
	{
		StringBuffer stringBuffer = new StringBuffer(historicalBaseUrlStr);
		stringBuffer.append("?s=");
		stringBuffer.append(code);
		Calendar startCal = Calendar.getInstance();
		startCal.setTime(startDate);
		Calendar endCal = Calendar.getInstance();
		endCal.setTime(endDate);
		stringBuffer.append("&a=");
		stringBuffer.append(startCal.get(Calendar.MONTH));
		stringBuffer.append("&b=");
		stringBuffer.append(startCal.get(Calendar.DAY_OF_MONTH));
		stringBuffer.append("&c=");
		stringBuffer.append(startCal.get(Calendar.YEAR));
		try
		{
			stringBuffer.append(URLEncoder.encode(" ", "UTF-8"));
		}
		catch (UnsupportedEncodingException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stringBuffer.append("&d=");
		stringBuffer.append(endCal.get(Calendar.MONTH));
		stringBuffer.append("&e=");
		stringBuffer.append(endCal.get(Calendar.DAY_OF_MONTH));
		stringBuffer.append("&f=");
		stringBuffer.append(endCal.get(Calendar.YEAR));

		return stringBuffer.toString();
	}

	/*
	 * LastTradeDate Last Trade Date d1 TradeDate Trade Date d2 Name Name n0
	 * Symbol Symbol s0 LastTradePriceOnly Last Trade Price Only l1 Open Open o0
	 * DaysHigh Days High h0 DaysLow Days Low g0 PreviousClose Previous Close p0
	 * Volume Volume v0
	 */

	protected Double getDouble(String value)
	{
		if ((null == value) || (0 == value.length()) || value.equals("-"))
		{
			return null;
		}
		return Double.valueOf(value);
	}

	protected Long getLong(String value)
	{
		if ((null == value) || (0 == value.length()) || value.equals("-"))
		{
			return null;
		}
		return Long.valueOf(value);
	}

	protected Date getDate(String value) throws ParseException
	{
		if ((null == value) || (0 == value.length()) || value.equals("-"))
		{
			return null;
		}

		return dateFormat.parse(value);
	}

	protected String createQuoteUrlString(String code)
	{
		StringBuffer stringBuffer = new StringBuffer(quoteBaseUrlStr);
		stringBuffer.append("s=");
		stringBuffer.append(code);
		stringBuffer.append("&f=d1d2n0s0l1o0h0g0p0v0&e=.csv");
		return stringBuffer.toString();
	}

	@Override
	public void connect(Properties properties) throws Exception
	{
		marketDataThread = new YahooMarketDataThread(updateInterval, listeners);
	}

	@Override
	public void registerListener(String code,
			MarketDataListener marketDataListener) throws Exception
	{
		Collection<MarketDataListener> dataListeners = listeners.get(code);

		if (null == dataListeners)
		{
			dataListeners = new java.util.Vector<MarketDataListener>();
			listeners.put(code, dataListeners);
		}

		dataListeners.add(marketDataListener);

	}

	@Override
	public void close() throws Exception
	{

	}

	@Override
	public void registerQuote(Instrument instrument, String code)
			throws Exception
	{
		if (!isConnected())
		{
			throw new NotConnectedException();
		}
		marketDataThread.registerQuote(code);
	}

	@Override
	public void unRegisterQuote(String code) throws Exception
	{
		if (!isConnected())
		{
			throw new NotConnectedException();
		}
		marketDataThread.unRegisterQuote(code);

	}

	@Override
	public void start() throws Exception
	{
		if (!isConnected())
		{
			throw new NotConnectedException();
		}
		marketDataThread.start();
	}

	@Override
	public void stop() throws Exception
	{
		if (!isConnected())
		{
			throw new NotConnectedException();
		}
		if (null != marketDataThread)
		{
			marketDataThread.setRunning(false);
			try
			{
				marketDataThread.join();
			}
			catch (InterruptedException e)
			{
				throw new Exception(e);
			}
		}
	}

	public boolean isConnected() throws Exception
	{
		return null != marketDataThread;
	}

	@Override
	public Collection<Quote> getHistoricalQuotes(Instrument instrument,
			String code, DateTime startDate, DateTime endDate) throws Exception
	{
		URL url = null;
		URLConnection urlConnection = null;
		Collection<Quote> quotes = new Vector<Quote>();
		try
		{
			String urlString = createHistoricalUrlString(code,
					startDate.toDate(), endDate.toDate());
			url = new URL(urlString);
			urlConnection = url.openConnection();
			urlConnection.connect();
			BufferedReader reader = null;
			reader = new BufferedReader(new InputStreamReader(
					urlConnection.getInputStream()));
			String inputLine;
			boolean first = true;
			// Date,Open,High,Low,Close,Volume,Adj Close
			while ((inputLine = reader.readLine()) != null)
			{
				if (first)
				{
					first = false;
					continue;
				}
				String[] yahooStockInfo = inputLine.replaceAll("\"", "").split(
						",");
				int pos = 0;
				Quote quote = new Quote();
				quote.setCode(code);

				quote.setTradeDate(getDate(yahooStockInfo[pos++]));

				quote.setLastUpdate(getDate(yahooStockInfo[pos++]));

				quote.setPrice(getDouble(yahooStockInfo[pos++]));
				quote.setOpen(getDouble(yahooStockInfo[pos++]));
				quote.setHigh(getDouble(yahooStockInfo[pos++]));
				quote.setLow(getDouble(yahooStockInfo[pos++]));
				quote.setClose(getDouble(yahooStockInfo[pos++]));
				quote.setVolume(getLong(yahooStockInfo[pos++]));
				quotes.add(quote);
			}

			return quotes;
		}
		catch (MalformedURLException e)
		{
			throw new Exception(e);
		}
		catch (IOException e)
		{
			throw new Exception(e);
		}
		catch (ParseException e)
		{
			throw new Exception(e);
		}
		finally
		{
			if (null != urlConnection)
			{
				try
				{
					urlConnection.getInputStream().close();
				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Quote getQuote(Instrument instrument, String code) throws Exception
	{
		URL url = null;
		URLConnection urlConnection = null;
		Quote quote = null;
		try
		{
			String urlString = createQuoteUrlString(code);
			url = new URL(urlString);
			urlConnection = url.openConnection();
			urlConnection.connect();
			BufferedReader reader = null;
			reader = new BufferedReader(new InputStreamReader(
					urlConnection.getInputStream()));
			String inputLine;
			// Date,Open,High,Low,Close,Volume,Adj Close
			if ((inputLine = reader.readLine()) != null)
			{
				String[] yahooStockInfo = inputLine.replaceAll("\"", "").split(
						",");
				int pos = 0;
				quote = new Quote();
				quote.setCode(code);
				quote.setTradeDate(getDate(yahooStockInfo[pos++]));

				quote.setLastUpdate(getDate(yahooStockInfo[pos++]));
				pos += 2;
				// quote.set(new Double(yahooStockInfo[pos++]));

				quote.setPrice(getDouble(yahooStockInfo[pos++]));
				quote.setOpen(getDouble(yahooStockInfo[pos++]));
				quote.setHigh(getDouble(yahooStockInfo[pos++]));
				quote.setLow(getDouble(yahooStockInfo[pos++]));
				quote.setClose(getDouble(yahooStockInfo[pos++]));
				quote.setVolume(getLong(yahooStockInfo[pos++]));
			}

			return quote;
		}
		catch (MalformedURLException e)
		{
			throw new Exception(e);
		}
		catch (IOException e)
		{
			throw new Exception(e);
		}
		catch (ParseException e)
		{
			throw new Exception(e);
		}
		finally
		{
			if (null != urlConnection)
			{
				try
				{
					urlConnection.getInputStream().close();
				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Index getIndex(String code, DateTime dateTime) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curve getCurve(String code, DateTime dateTime) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

}
