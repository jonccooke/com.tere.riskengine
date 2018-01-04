package com.tere.finance.risk.riskengine.model.valuation;

import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;


public class DiscountCurve extends Curve
{

	public DiscountCurve(Curve baseCurve, String curveName, HolidayCalendar calendar)
	{
		super(curveName, baseCurve.getEffectiveDate(), baseCurve.getCurrency(), baseCurve
				.getBadDayConvention(), baseCurve.getDayConvention(), baseCurve
				.getSnaptime(), baseCurve.getSpotdate(), calendar);
		double value;
		double dayCount = 1.0/360.0;
		for (CurvePoint curvePoint : baseCurve.getPoints())
		{
			CurvePoint newCurvePoint = new CurvePoint();
			newCurvePoint.setDate(curvePoint.getDate());
			newCurvePoint.setTenor(curvePoint.getTenor());
			value = 1.0 / (1.0 + curvePoint.getPoint() * dayCount);
			newCurvePoint.setPoint(value);
			setCurvePoint(newCurvePoint);
		}
	}

}
