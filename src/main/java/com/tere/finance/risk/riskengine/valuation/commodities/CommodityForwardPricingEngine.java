package com.tere.finance.risk.riskengine.valuation.commodities;

import java.util.Date;

import org.joda.time.Days;
import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.instrument.commodity.CommodityForward;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.model.valuation.CurveInterpolator;
import com.tere.finance.risk.riskengine.valuation.PricingException;
import com.tere.finance.risk.riskengine.valuation.ValuationEngine;
import com.tere.finance.risk.riskengine.valuation.ValuationException;

public class CommodityForwardPricingEngine extends
		ValuationEngine<CommodityForward>
{

	private CurveInterpolator riskFreeCurve;

	public CommodityForwardPricingEngine(CommodityForward instrument,
			HolidayCalendar calendar,
			DayCountConventionType dayCountConventionType,
			CurveInterpolator riskFreeCurve)
	{
		super(instrument, calendar, dayCountConventionType);
		this.riskFreeCurve = riskFreeCurve;
	}

	/**
	 * 
	 If the spot price of gold is Spot and the forward price for a contract
	 * deliverable in T years is F, then Price = Spot (1+r ) Years where r is
	 * the 1-year (domestic currency) risk-free rate of interest. In our
	 * examples, S = 1400, T = 1, and r =0.05 so that F = 1400(1+0.05) = 1470
	 */
	@Override
	public double calculate(
			ValueType valueType, Date valuationDate)
			throws ValuationException
	{
		switch (valueType)
		{
		case PV:

			double spotPrice = getInstrument().getUnderlying().getPrice();
			// storagePrice as %'age
			double storagePrice = getInstrument().getStoragePrice();
			LocalDate now = LocalDate.fromDateFields(valuationDate);
			LocalDate expiryDate = getInstrument().getExpiryDate();
			double yearsFraction = Days.daysBetween(now, expiryDate).getDays() / 365.0;
			double riskFreeRate = riskFreeCurve.getPoint(expiryDate);
			double pv = spotPrice
					* (Math.pow(1 + riskFreeRate, yearsFraction) / Math.pow(
							1 + storagePrice, yearsFraction));
			return pv;
		}

		throw new PricingException(valueType.toString() + " not supported");
	}

//	@Override
//	public void calculateCashFlows() throws ValuationException
//	{
//		// TODO Auto-generated method stub
//
//	}

}
