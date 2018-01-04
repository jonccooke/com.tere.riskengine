package com.tere.finance.risk.riskengine.marketdata.providers.yahoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;

import com.tere.finance.risk.riskengine.marketdata.MarketDataListener;
import com.tere.finance.risk.riskengine.model.valuation.Quote;


public class YahooMarketDataThread extends Thread
{
	private static String baseUrlStr = "http://finance.yahoo.com/d/quotes.csv";
	private static String attributesStr = "&f=sl1c1vd1t1ohgd&e=.csv";

	private boolean running = false;
	private URL url;
	private URLConnection urlConnection;
	private long updateInterval;
	private Map<String, Collection<MarketDataListener>> listeners;
	private static Collection<String> quotes = Collections
			.synchronizedCollection(new Vector<String>());

	public YahooMarketDataThread(long updateInterval,
			Map<String, Collection<MarketDataListener>> listeners)
	{
		super();
		this.updateInterval = updateInterval;
		this.listeners = listeners;
	}

	protected String createUrlString()
	{
		StringBuffer stringBuffer = new StringBuffer(baseUrlStr);
		if (0 != quotes.size())
		{
			stringBuffer.append("?s=");
		}
		boolean first = true;
		for (String quoteStr : quotes)
		{
			if (!first)
			{
				stringBuffer.append('+');
			}
			else
			{
				first = false;
			}
			stringBuffer.append(quoteStr);
		}
		stringBuffer.append(attributesStr);
		return stringBuffer.toString();
	}

	protected void connect() throws Exception
	{
		String urlString = createUrlString();

		try
		{
			url = new URL(urlString);
			urlConnection = url.openConnection();

			urlConnection.connect();

		}
		catch (MalformedURLException e)
		{
			throw new Exception(e);
		}
		catch (IOException e)
		{
			throw new Exception(e);
		}

	}

	protected void callUrl() throws Exception, IOException
	{
		BufferedReader reader = null;
		try
		{
			reader = new BufferedReader(new InputStreamReader(
					urlConnection.getInputStream()));
			/*
			 * Fetch CSV data from Yahoo. The format codes (f=) are:
			 * s=symbol, l1 = last, c1 = change, d1 = trade day, t1 = trade time, o = open, h = high, g = low, v = volume
			 * "XOM", 88.30, -0.31, 1733065, "2/11/2013", "10:32am", 88.39, 88.49, 87.97, 2.28]
			 */
			String inputLine;
			while ((inputLine = reader.readLine()) != null)
			{
				String[] yahooStockInfo = inputLine.replaceAll("\"", "").split(",");
				int pos=0;
				Quote quote = new Quote();
				quote.setCode(yahooStockInfo[pos++]);
				quote.setPrice(new Double(yahooStockInfo[pos++]));
//				quote.setChange(new BigDecimal(yahooStockInfo[pos++]));
//				quote.setVolume(new Long(yahooStockInfo[pos++]));
//				try
//				{
//					quote.setTradeDate(new SimpleDateFormat("dd/MM/yyyy").parse(yahooStockInfo[pos++]));
//					quote.setTradeTime(new SimpleDateFormat("hh:mm").parse(yahooStockInfo[pos++]));
//				}
//				catch (ParseException e)
//				{
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				quote.setOpen(new BigDecimal(yahooStockInfo[pos++]));
//				quote.setHigh(new BigDecimal(yahooStockInfo[pos++]));
//				quote.setLow(new BigDecimal(yahooStockInfo[pos++]));
//				quote.setClose(new BigDecimal(yahooStockInfo[pos++]));

				Collection<MarketDataListener> listenerCollection = listeners.get(quote.getCode());
				
				if (null != listenerCollection)
				{
					for (MarketDataListener listener : listenerCollection)
					{
						listener.onQuote(quote);
					}
				}
			}
		}
		finally
		{
			if (reader != null)
				reader.close();
		}
	}

	@Override
	public void run()
	{
		running = true;
		while (isRunning())
		{

			try
			{
				connect();
				callUrl();
				Thread.sleep(updateInterval);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

	}

	public synchronized boolean isRunning()
	{
		return running;
	}

	public synchronized void setRunning(boolean running)
	{
		this.running = running;
	}

	public void registerQuote(String code) throws Exception
	{
		if (!quotes.contains(code))
		{
			quotes.add(code);
		}
	}

	public void unRegisterQuote(String code) throws Exception
	{
		if (!quotes.contains(code))
		{
			quotes.remove(code);
		}

	}

}
