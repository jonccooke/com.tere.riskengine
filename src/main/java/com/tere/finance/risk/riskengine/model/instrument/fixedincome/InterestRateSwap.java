package com.tere.finance.risk.riskengine.model.instrument.fixedincome;

import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.instrument.Instrument;
import com.tere.finance.risk.riskengine.model.instrument.Leg;
import com.tere.finance.risk.riskengine.model.referencedata.Frequency;

public class InterestRateSwap extends Instrument
{

	private long notional;
	private LocalDate issueDate;
	private LocalDate maturityDate;
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
		return super.toString() + ",\"notional\":\"" + notional + "\", \"issueDate\":\""
				+ issueDate + "\", \"maturityDate\":\"" + maturityDate + "\", \"couponFrequency\":\"" + couponFrequency + "\"";
	}


}
