package com.tere.finance.risk.riskengine.model.valuation;

import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.valuation.CurveException;

public abstract class CurveInterpolator
{

	public abstract void buildCurve();

	public abstract double getPoint(LocalDate date) throws CurveException;

}