package com.tere.finance.risk.riskengine.model.valuation;

import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.referencedata.Tenor;

public class CurvePoint
{
	private Tenor tenor = null;
	private LocalDate date = null;
	private double point;

	public CurvePoint(LocalDate date, double point)
	{
		this.date = date;
		this.point = point;
	}

	public CurvePoint(Tenor tenor, LocalDate date, double point)
	{
		this.tenor = tenor;
		this.date = date;
		this.point = point;
	}

	public CurvePoint()
	{
		// TODO Auto-generated constructor stub
	}

	public Tenor getTenor()
	{
		return tenor;
	}

	public void setTenor(Tenor tenor)
	{
		this.tenor = tenor;
	}

	public LocalDate getDate()
	{
		return date;
	}

	public void setDate(LocalDate date)
	{
		this.date = date;
	}

	public double getPoint()
	{
		return point;
	}

	public void setPoint(double point)
	{
		this.point = point;
	}

	@Override
	public String toString()
	{
		return "CurvePoint [tenor=" + tenor + ", date=" + date + ", point="
				+ point + "]";
	}

}
