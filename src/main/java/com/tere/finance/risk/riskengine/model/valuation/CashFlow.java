package com.tere.finance.risk.riskengine.model.valuation;

import org.joda.time.LocalDate;

public class CashFlow 
{

	private double value;
	private LocalDate date;

	public CashFlow(double value, LocalDate date)
	{
		this.value = value;
		this.date = date;
	}

	public double getValue()
	{
		return value;
	}

	public LocalDate getDate()
	{
		return date;
	}
}
