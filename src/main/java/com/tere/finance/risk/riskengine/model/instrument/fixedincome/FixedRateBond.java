package com.tere.finance.risk.riskengine.model.instrument.fixedincome;

import java.util.Currency;

import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.instrument.Instrument;
import com.tere.finance.risk.riskengine.model.instrument.Leg;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.Frequency;

public class FixedRateBond extends Instrument
{
	private LocalDate maturityDate;
	private LocalDate issueDate;
	private Leg leg;
	private double faceAmount;
	private double yeildToMaturity;
	private double couponRate;
	private Currency currency;
	private Frequency couponFrequency;
	private DayCountConventionType dayCountconventionType;
	
	public FixedRateBond(LocalDate maturityDate, LocalDate issueDate, double faceAmount,
			double yeildToMaturity, double couponRate, Currency currency, Frequency couponFrequency, DayCountConventionType dayCountconventionType)
	{
		this.maturityDate = maturityDate;
		this.issueDate = issueDate;
		this.faceAmount = faceAmount;
		this.couponRate = couponRate;
		this.currency = currency;
		this.couponFrequency = couponFrequency;
		this.yeildToMaturity = yeildToMaturity;
		this.dayCountconventionType = dayCountconventionType;
	}

	public LocalDate getMaturityDate()
	{
		return maturityDate;
	}

	public LocalDate getIssueDate()
	{
		return issueDate;
	}

	public Leg getLeg()
	{
		return leg;
	}

	public double getFaceAmount()
	{
		return faceAmount;
	}

	public double getCouponRate()
	{
		return couponRate;
	}

	public Currency getCurrency()
	{
		return currency;
	}

	public Frequency getCouponFrequency()
	{
		return couponFrequency;
	}

	public double getYeildToMaturity()
	{
		return yeildToMaturity;
	}

	public void setLeg(Leg leg)
	{
		this.leg = leg;
	}

	public DayCountConventionType getDayCountConventionType()
	{
		return dayCountconventionType;
	}

}
