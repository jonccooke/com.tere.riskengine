package com.tere.finance.risk.riskengine.model.instrument.commodity;

import java.util.Currency;

import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.instrument.Instrument;

public class CommodityForward extends Instrument
{
	/**
	 * Time (in years as a double) until the date-time at which the future
	 * expires
	 */
	private LocalDate expiryDate;
	/** Identifier of the underlying commodity */
	private Commodity underlying;
	private double strike;
	private Currency currency;
	private double storagePrice;
	private SettlementType settlementType;
	
	public CommodityForward(LocalDate expiryDate, Commodity underlying,
			double strike, Currency currency, double storagePrice,
			SettlementType settlementType)
	{
		super();
		this.expiryDate = expiryDate;
		this.underlying = underlying;
		this.strike = strike;
		this.currency = currency;
		this.storagePrice = storagePrice;
		this.settlementType = settlementType;
	}

	public LocalDate getExpiryDate()
	{
		return expiryDate;
	}

	public Commodity getUnderlying()
	{
		return underlying;
	}

	public double getStrike()
	{
		return strike;
	}

	public Currency getCurrency()
	{
		return currency;
	}

	public double getStoragePrice()
	{
		return storagePrice;
	}

	public SettlementType getSettlementType()
	{
		return settlementType;
	}

}
