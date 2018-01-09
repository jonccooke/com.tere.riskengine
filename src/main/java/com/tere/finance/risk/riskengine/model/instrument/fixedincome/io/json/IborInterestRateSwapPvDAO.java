package com.tere.finance.risk.riskengine.model.instrument.fixedincome.io.json;

import org.joda.time.DateTime;

import com.tere.finance.risk.riskengine.model.instrument.IborIndex;
import com.tere.finance.risk.riskengine.model.instrument.fixedincome.IborInterestRateSwap;
import com.tere.finance.risk.riskengine.model.valuation.Curve;

public class IborInterestRateSwapPvDAO
{

	private DateTime valuationDate = null;
	private IborIndex iborIndex = null;
	private Curve yeildCurve = null;
	private IborInterestRateSwap iborInterestRateSwap = null;


	public IborInterestRateSwapPvDAO(DateTime valuationDate,
			IborIndex iborIndex, Curve yeildCurve,
			IborInterestRateSwap iborInterestRateSwap)
	{
		this.valuationDate = valuationDate;
		this.iborIndex = iborIndex;
		this.yeildCurve = yeildCurve;
		this.iborInterestRateSwap = iborInterestRateSwap;
	}

	public DateTime getValuationDate()
	{
		return valuationDate;
	}

	public IborIndex getIborIndex()
	{
		return iborIndex;
	}

	public Curve getYeildCurve()
	{
		return yeildCurve;
	}

	public IborInterestRateSwap getIborInterestRateSwap()
	{
		return iborInterestRateSwap;
	}

}
