package com.tere.finance.risk.riskengine.model.valuation;

import java.util.Date;


public class YieldCurveDataPoint
{

	private CurvePoint gridPoint;
	private Date maturityDate;
	private double accuralFactor;
	private double zeroYield;
	private double discountFactor;

	public CurvePoint getGridPoint()
	{
		return gridPoint;
	}

	public void setGridPoint(CurvePoint gridPoint)
	{
		this.gridPoint = gridPoint;
	}

	public Date getMaturityDate()
	{
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate)
	{
		this.maturityDate = maturityDate;
	}

	public double getAccuralFactor()
	{
		return accuralFactor;
	}

	public void setAccuralFactor(double accuralFactor)
	{
		this.accuralFactor = accuralFactor;
	}

	public double getZeroYield()
	{
		return zeroYield;
	}

	public void setZeroYield(double zeroYield)
	{
		this.zeroYield = zeroYield;
	}

	public double getDiscountFactor()
	{
		return discountFactor;
	}

	public void setDiscountFactor(double discountFactor)
	{
		this.discountFactor = discountFactor;
	}

}
