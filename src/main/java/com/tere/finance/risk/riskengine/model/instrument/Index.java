package com.tere.finance.risk.riskengine.model.instrument;

import java.util.Currency;
import java.util.Date;

import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;

public class Index extends Instrument
{
	private Date effectiveDate;
	private Currency currency;
	private DayCountConventionType conventionType;
	
	public Date getEffectiveDate()
	{
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate)
	{
		this.effectiveDate = effectiveDate;
	}

	public Currency getCurrency()
	{
		return currency;
	}

	public void setCurrency(Currency currency)
	{
		this.currency = currency;
	}

	public DayCountConventionType getConventionType()
	{
		return conventionType;
	}

	public void setConventionType(DayCountConventionType conventionType)
	{
		this.conventionType = conventionType;
	}

}
