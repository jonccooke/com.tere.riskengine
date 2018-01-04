package com.tere.finance.risk.riskengine.marketdata;

import com.tere.finance.risk.riskengine.model.valuation.Quote;

public interface MarketDataListener
{
	public void onQuote(Quote quote);
}
