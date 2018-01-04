package com.tere.finance.risk.riskengine.marketdata;

import java.util.Collection;
import java.util.Date;
import java.util.Properties;

import org.joda.time.DateTime;

import com.tere.finance.risk.riskengine.model.instrument.Index;
import com.tere.finance.risk.riskengine.model.instrument.Instrument;
import com.tere.finance.risk.riskengine.model.valuation.Curve;
import com.tere.finance.risk.riskengine.model.valuation.Quote;

public interface MarketDataProvider
{

	public void connect(Properties properties) throws Exception;

	public boolean isConnected() throws Exception;

	public void start() throws Exception;

	public void stop() throws Exception;

	public Quote getQuote(Instrument instrument, String code) throws Exception;

	public Collection<Quote> getHistoricalQuotes(Instrument instrument,
			String code, DateTime startDate, DateTime endDate) throws Exception;

	public void registerQuote(Instrument instrument, String code)
			throws Exception;

	public void unRegisterQuote(String code) throws Exception;

	public void registerListener(String code,
			MarketDataListener marketDataListener) throws Exception;

	public void close() throws Exception;

	public Index getIndex(String code, DateTime dateTime) throws Exception;

	public Curve getCurve(String code, DateTime dateTime) throws Exception;

}
