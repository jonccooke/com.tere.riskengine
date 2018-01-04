package com.tere.finance.risk.riskengine.model.instrument.equities;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.instrument.Instrument;

public class Equity extends Instrument
{
	//S=Todays stock price
	private double price;
	//rho=Annual volatility of stock
	private double volatility;
	//y=Percentage of stock value paid annually in dividends
	private double dividend;

	public Equity(Long instrumentId, String instrumentName, Boolean securitised)
			throws ConstraintVoliationException
	{
		super(instrumentId, instrumentName, securitised);
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public double getVolatility()
	{
		return volatility;
	}

	public void setVolatility(double volatility)
	{
		this.volatility = volatility;
	}

	public double getDividend()
	{
		return dividend;
	}

	public void setDividend(double dividend)
	{
		this.dividend = dividend;
	}

}
