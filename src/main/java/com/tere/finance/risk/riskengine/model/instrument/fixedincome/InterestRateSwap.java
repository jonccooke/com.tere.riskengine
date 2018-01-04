package com.tere.finance.risk.riskengine.model.instrument.fixedincome;

import org.joda.time.LocalDate;
import org.joda.time.Years;

import com.tere.finance.risk.riskengine.model.instrument.Instrument;
import com.tere.finance.risk.riskengine.model.instrument.Leg;
import com.tere.finance.risk.riskengine.model.referencedata.Frequency;

public class InterestRateSwap extends Instrument
{

	private long notional;
	private LocalDate issueDate;
	private LocalDate maturityDate;
	private Leg fixedLeg = new Leg();
	private Leg floatingLeg = new Leg();
	private Frequency couponFrequency;

	public InterestRateSwap(
			long notional, LocalDate issueDate, LocalDate maturityDate,
			Frequency couponFrequency)
	{
		super();
		this.notional = notional;
		this.issueDate = issueDate;
		this.maturityDate = maturityDate;
		this.couponFrequency = couponFrequency;
	}

	public Leg getFixedLeg()
	{
		return fixedLeg;
	}

	public Leg getFloatingLeg()
	{
		return floatingLeg;
	}

	public Frequency getCouponFrequency()
	{
		return couponFrequency;
	}

	public long getNotional()
	{
		return notional;
	}

	public LocalDate getIssueDate()
	{
		return issueDate;
	}

	public LocalDate getMaturityDate()
	{
		return maturityDate;
	}

	@Override
	public String toString()
	{
		return super.toString() + " [notional=" + notional +", term(days)=" + Years.yearsBetween(issueDate, maturityDate);
	
	}

}
