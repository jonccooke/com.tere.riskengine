package com.tere.finance.risk.riskengine.model.instrument.fixedincome;

import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.instrument.IborIndex;
import com.tere.finance.risk.riskengine.model.referencedata.Frequency;

public class IborInterestRateSwap extends InterestRateSwap
{

	private double fixedRate;
	private double floatingSpread;
	private IborIndex index;

	public IborInterestRateSwap(double fixedRate, double floatingSpread,IborIndex index,
			long notional, LocalDate issueDate, LocalDate maturityDate,
			Frequency couponFrequency)
	{
		super(notional, issueDate, maturityDate, couponFrequency);
		this.fixedRate = fixedRate;
		this.index = index;
		this.floatingSpread =floatingSpread;
	}


	public double getFixedRate()
	{
		return fixedRate;
	}

	public IborIndex getIndex()
	{
		return index;
	}


	@Override
	public String toString()
	{
		return super.toString() + ", \"fixedRate\":\"" + fixedRate
				+ "\", \"floatingSpread\":\"" + floatingSpread + "\", \"index\":" + index + "}";
	}


	public double getFloatingSpread()
	{
		return 0;
	}

}
