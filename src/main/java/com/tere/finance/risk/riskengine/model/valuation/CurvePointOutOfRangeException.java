package com.tere.finance.risk.riskengine.model.valuation;

import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.valuation.CurveException;

public class CurvePointOutOfRangeException extends CurveException
{

	public CurvePointOutOfRangeException(LocalDate askedDate, LocalDate firstDate)
	{
		super(String.format("Asked date %s, first date %s", askedDate, firstDate));
	}

}
