package com.tere.finance.risk.riskengine.marketdata.providers.Markit;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.tere.finance.risk.riskengine.marketdata.MarketDataListener;
import com.tere.finance.risk.riskengine.marketdata.MarketDataProvider;
import com.tere.finance.risk.riskengine.marketdata.providers.NotConnectedException;
import com.tere.finance.risk.riskengine.model.instrument.Index;
import com.tere.finance.risk.riskengine.model.instrument.Instrument;
import com.tere.finance.risk.riskengine.model.referencedata.Country;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.model.referencedata.Tenor;
import com.tere.finance.risk.riskengine.model.valuation.Curve;
import com.tere.finance.risk.riskengine.model.valuation.CurvePoint;
import com.tere.finance.risk.riskengine.model.valuation.Quote;
import com.tere.logging.LogManager;
import com.tere.logging.Logger;

public class MarkitProvider implements MarketDataProvider
{
	 Logger log = LogManager.getLogger(MarkitProvider.class);
	
	private String baseUrlStr = "https://www.markit.com/news/InterestRates_";

	private DocumentBuilderFactory factory = null;
	private DocumentBuilder builder = null;
	private XPathFactory xPathfactory = null;

	private boolean connected;

	protected String createUrlString(String currency, DateTime rateDate)
	{
		StringBuffer stringBuffer = new StringBuffer(baseUrlStr);
		stringBuffer.append(currency.toUpperCase());
		stringBuffer.append("_");
		Calendar dateCal = Calendar.getInstance();
		dateCal.setTime(rateDate.toDate());
		stringBuffer.append(dateCal.get(Calendar.YEAR));
		stringBuffer.append(String.format("%02d",
				dateCal.get(Calendar.MONTH) + 1));
		stringBuffer.append(String.format("%02d",
				dateCal.get(Calendar.DAY_OF_MONTH)));
		stringBuffer.append(".zip");
		return stringBuffer.toString();
	}

	@Override
	public void connect(Properties properties) throws Exception
	{
		factory = DocumentBuilderFactory.newInstance();
		builder = factory.newDocumentBuilder();
		xPathfactory = XPathFactory.newInstance();
		connected = true;
	}

	@Override
	public boolean isConnected() throws Exception
	{
		return connected;
	}

	public void checkConnected() throws Exception
	{
		if (!isConnected())
			throw new NotConnectedException();
	}

	@Override
	public void start() throws Exception
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() throws Exception
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Quote> getHistoricalQuotes(Instrument instrument,
			String code, DateTime startDate, DateTime endDate) throws Exception
	{
		checkConnected();
		return null;
		// URL url = null;
		// URLConnection urlConnection = null;
		// Collection<Quote> quotes = new Vector<Quote>();
		// try
		// {
		// String urlString = createUrlString(code, startDate, endDate);
		// url = new URL(urlString);
		// urlConnection = url.openConnection();
		// urlConnection.connect();
		// BufferedReader reader = null;
		// reader = new BufferedReader(new InputStreamReader(
		// urlConnection.getInputStream()));
		// String inputLine;
		// boolean first = true;
		// // DateTime,Open,High,Low,Close,Volume,Adj Close
		// while ((inputLine = reader.readLine()) != null)
		// {
		// if (first)
		// {
		// first = false;
		// continue;
		// }
		// String[] yahooStockInfo = inputLine.replaceAll("\"", "").split(
		// ",");
		// int pos = 0;
		// Quote quote = new Quote();
		// quote.setCode(code);
		// quote.setTradeDate(new SimpleDateFormat("yyyy-MM-dd")
		// .parse(yahooStockInfo[pos++]));
		// quote.setOpen(new Double(yahooStockInfo[pos++]));
		// quote.setHigh(new Double(yahooStockInfo[pos++]));
		// quote.setLow(new Double(yahooStockInfo[pos++]));
		// quote.setClose(new Double(yahooStockInfo[pos++]));
		// quote.setVolume(new Long(yahooStockInfo[pos++]));
		// quotes.add(quote);
		// }
		//
		// return quotes;
		// }
		// catch (MalformedURLException e)
		// {
		// throw new Exception(e);
		// }
		// catch (IOException e)
		// {
		// throw new Exception(e);
		// }
		// catch (ParseException e)
		// {
		// throw new Exception(e);
		// }
		// finally
		// {
		// if (null != urlConnection)
		// {
		// try
		// {
		// urlConnection.getInputStream().close();
		// }
		// catch (IOException e)
		// {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// }
	}

	@Override
	public void registerQuote(Instrument instrument, String code)
			throws Exception
	{
		checkConnected();

	}

	@Override
	public void unRegisterQuote(String code) throws Exception
	{
		checkConnected();

	}

	@Override
	public void registerListener(String code,
			MarketDataListener marketDataListener) throws Exception
	{
		checkConnected();

	}

	@Override
	public void close() throws Exception
	{
		checkConnected();

	}

	protected NodeList getXPath(String xPathString, Document doc)
			throws XPathExpressionException
	{
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile(xPathString);
		NodeList list = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
		return list;
	}

	protected Node getXPath(String xPathString, Node node)
			throws XPathExpressionException
	{
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile(xPathString);
		Node newNode = (Node) expr.evaluate(node, XPathConstants.NODE);
		return newNode;
	}

	protected String getNodeValue(String xPathString, Document doc)
			throws XPathExpressionException, ParseException
	{
		NodeList list = getXPath(xPathString, doc);
		Node node = null;
		int length = list.getLength();
		for (int nodeLoop = 0; nodeLoop < length; nodeLoop++)
		{
			node = list.item(nodeLoop);
			if (node.getNodeType() == Node.TEXT_NODE)
			{
				String value = node.getNodeValue();
				return value;
			}
		}
		return null;
	}

	protected String getNodeValue(String xPathString, Node node)
			throws XPathExpressionException, ParseException
	{
		Node childNode = getXPath(xPathString, node);
		// int length = list.getLength();
		// short type;
		// for (int nodeLoop = 0; nodeLoop < length; nodeLoop++)
		// {
		// childNode = list.item(nodeLoop);
		// type = node.getNodeType();
		// if (type == Node.TEXT_NODE)
		// {
		String value = childNode.getNodeValue();
		return value;
		// }
		// }
		// return null;
	}

	protected NodeList getNodeList(String xPathString, Document doc)
			throws XPathExpressionException, ParseException
	{
		NodeList list = getXPath(xPathString, doc);
		Node node = null;
		int length = list.getLength();
		for (int nodeLoop = 0; nodeLoop < length; nodeLoop++)
		{
			node = list.item(nodeLoop);
			if (node.getNodeType() == Node.ELEMENT_NODE)
			{
				String value = node.getNodeValue();
				value = null;
				// return value;
			}
		}
		return null;
	}

	protected LocalDate getDate(String xPathString, Document doc)
			throws XPathExpressionException, ParseException
	{
		String value = getNodeValue(xPathString, doc);
		LocalDate date = LocalDate.parse(value);
		return date;
	}

	protected DateTime getDateTime(String xPathString, Document doc)
			throws XPathExpressionException, ParseException
	{
		String value = getNodeValue(xPathString, doc);
		DateTime dateTime = DateTime.parse(value);
		return dateTime;
	}

	protected Currency getCurrency(String xPathString, Document doc)
			throws XPathExpressionException, ParseException
	{
		String value = getNodeValue(xPathString, doc);
		Currency currency = Currency.getInstance(value.toUpperCase());
		return currency;
	}

	protected DayCountConventionType getDayCountConvention(String xPathString,
			Document doc) throws XPathExpressionException, ParseException
	{
		DayCountConventionType dayConvention = DayCountConventionType.DC_Actual_365;
		String dayCountConventionTypeStr = getNodeValue(
				"/interestRateCurve/deposits/daycountconvention/text()", doc);
		if ("ACT/365".equals(dayCountConventionTypeStr))
		{
			dayConvention = DayCountConventionType.DC_Actual_365;
		}
		else if ("ACT/360".equals(dayCountConventionTypeStr))
		{
			dayConvention = DayCountConventionType.DC_Actual_360;
		}

		return dayConvention;
	}

	protected Curve buildCurve(String curveName, InputStream inputStream) throws Exception
	{
		Curve curve = null;

		Document doc = builder.parse(inputStream);

		LocalDate effectiveDate = getDate(
				"/interestRateCurve/effectiveasof/text()", doc);
		Currency currency = getCurrency("/interestRateCurve/currency/text()",
				doc);
		DayCountConventionType badDayConvention = getDayCountConvention(
				"/interestRateCurve/baddayconvention/text()", doc);

		DayCountConventionType dayConvention = getDayCountConvention(
				"/interestRateCurve/deposits/daycountconvention/text()", doc);

		DateTime snaptime = getDateTime(
				"/interestRateCurve/deposits/snaptime/text()", doc);
		LocalDate spotdate = getDate(
				"/interestRateCurve/deposits/spotdate/text()", doc);

		curve = new Curve(curveName, effectiveDate, currency, badDayConvention,
				dayConvention, snaptime, spotdate, new HolidayCalendar("UK", new Country(0,
						"United Kingdom", "GB", "GBR", "826")));

		NodeList nodeList = getXPath("/interestRateCurve/deposits/curvepoint",
				doc);

		int length = nodeList.getLength();
		Node node = null;
		for (int nodeLoop = 0; nodeLoop < length; nodeLoop++)
		{
			node = nodeList.item(nodeLoop);
			// if (node.getNodeType() == Node.ELEMENT_NODE)
			{
				CurvePoint curvePoint = new CurvePoint();
				String value = null;
				value = getNodeValue("./tenor/text()", node);
				curvePoint.setTenor(Tenor.valueOf("P" + value));
				value = getNodeValue("maturitydate/text()", node);
				curvePoint.setDate(LocalDate.parse(value));
				value = getNodeValue("parrate/text()", node);
				curvePoint.setPoint(Double.parseDouble(value));
				curve.setCurvePoint(curvePoint);
				// return value;
			}
		}

		nodeList = getXPath("/interestRateCurve/swaps/curvepoint", doc);

		length = nodeList.getLength();
		node = null;
		for (int nodeLoop = 0; nodeLoop < length; nodeLoop++)
		{
			node = nodeList.item(nodeLoop);
			// if (node.getNodeType() == Node.ELEMENT_NODE)
			{
				CurvePoint curvePoint = new CurvePoint();
				String value = null;
				value = getNodeValue("./tenor/text()", node);
				curvePoint.setTenor(Tenor.valueOf("P" + value));
				value = getNodeValue("maturitydate/text()", node);
				curvePoint.setDate(LocalDate.parse(value));
				value = getNodeValue("parrate/text()", node);
				curvePoint.setPoint(Double.parseDouble(value));
				log.info("point:%s", curvePoint);
				curve.setCurvePoint(curvePoint);
				// return value;
			}
		}

		return curve;
	}

	// protected Quote getQuoteForDate(Instrument instrument, String code,
	// DateTime date) throws Exception
	// {
	// }

	@Override
	public Quote getQuote(Instrument instrument, String code) throws Exception
	{
		return null;
		// return getQuoteForDate(instrument, code, Calendar.getInstance()
		// .getTime());
		// checkConnected();
		// String urlString = createUrlString(code, Calendar.getInstance()
		// .getTime());
		// URL url = null;
		// URLConnection urlConnection = null;
		// Collection<Quote> quotes = new Vector<Quote>();
		// try
		// {
		// url = new URL(urlString);
		// urlConnection = url.openConnection();
		// urlConnection.connect();
		// ZipInputStream inputStream = new ZipInputStream(
		// urlConnection.getInputStream());
		//
		// // now iterate through each item in the stream. The get next
		// // entry call will return a ZipEntry for each file in the
		// // stream
		// ZipEntry entry;
		// byte[] buffer = new byte[2048];
		// int read = -1;
		// StringBuffer stringBuffer = new StringBuffer();
		// while ((entry = inputStream.getNextEntry()) != null)
		// {
		// if (entry.getName().startsWith("InterestRates"))
		// {
		// while (-1 != (read = inputStream.read()))
		// {
		// stringBuffer.append((char)read);
		// }
		// }
		//
		// }
		// return null;
		// }
		// catch (MalformedURLException e)
		// {
		// throw new Exception(e);
		// }
		// catch (IOException e)
		// {
		// throw new Exception(e);
		// }
		// finally
		// {
		// if (null != urlConnection)
		// {
		// try
		// {
		// urlConnection.getInputStream().close();
		// }
		// catch (IOException e)
		// {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// }
	}

	@Override
	public Curve getCurve(String code, DateTime date) throws Exception
	{
		checkConnected();
		String urlString = createUrlString(code, date);
		URL url = null;
		URLConnection urlConnection = null;
		ZipInputStream inputStream = null;

		try
		{
			url = new URL(urlString);
			urlConnection = url.openConnection();
			urlConnection.connect();
			inputStream = new ZipInputStream(urlConnection.getInputStream());

			// now iterate through each item in the stream. The get next
			// entry call will return a ZipEntry for each file in the
			// stream
			ZipEntry entry = null;
			Curve curve = null;
			while ((entry = inputStream.getNextEntry()) != null)
			{

				if (entry.getName().startsWith("InterestRates"))
				{
//					curve = getCurve(inputStream);
					return curve;
				}

			}
			return null;
		}
		catch (MalformedURLException e)
		{
			throw new Exception(e);
		}
		catch (IOException e)
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
			if (null != inputStream)
			{
				inputStream.close();
			}
		}

	}

	@Override
	public Index getIndex(String code, DateTime dateTime) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

}
