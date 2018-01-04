package com.tere.finance.risk.riskengine.valuation.fixedincome;

import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.Months;

import com.tere.finance.risk.riskengine.model.instrument.fixedincome.ForwardRateAgreement;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.model.valuation.CurveInterpolator;
import com.tere.finance.risk.riskengine.valuation.PricingException;
import com.tere.finance.risk.riskengine.valuation.ValuationEngine;
import com.tere.finance.risk.riskengine.valuation.ValuationException;

public class ForwardRateAgreementPricingEngine extends
		ValuationEngine<ForwardRateAgreement>
{

	private CurveInterpolator zeroCurveInterpolator;

	public ForwardRateAgreementPricingEngine(ForwardRateAgreement instrument,
			HolidayCalendar calendar,
			DayCountConventionType dayCountConventionType,
			CurveInterpolator zeroCurveInterpolator)
	{
		super(instrument, calendar, dayCountConventionType);
		this.zeroCurveInterpolator = zeroCurveInterpolator;
	}

	@Override
	public double calculate(ValueType valueType, Date valuationDate) throws ValuationException
	{
		switch (valueType)
		{
		case PV:

			double spotPrice = getInstrument().getSpotPrice();
			double deliveryPrice = getInstrument().getDeliveryPrice();
			LocalDate maturityDate = getInstrument().getMaturityDate();
			// LocalDate issueDate = getInstrument().getIssueDate();
			// IborIndex index = getInstrument().getIborIndex();
			LocalDate now = LocalDate.fromDateFields(valuationDate);
			double timeToMaturity = Months.monthsBetween(now, maturityDate)
					.getMonths() / 12.0;
			double riskFreeRate = zeroCurveInterpolator.getPoint(maturityDate);
			double pv = spotPrice - deliveryPrice
					* Math.exp(-riskFreeRate * timeToMaturity);
			return pv;
		}

		throw new PricingException(valueType.toString() + " not supported");
	}
//
//	@Override
//	public void calculateCashFlows() throws ValuationException
//	{
//		// TODO Auto-generated method stub
//
//	}

}
