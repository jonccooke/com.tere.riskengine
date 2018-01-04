package com.tere.finance.risk.riskengine.valuation.fixedincome;

import java.util.Date;

import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.instrument.fixedincome.IborInterestRateSwap;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.Frequency;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.model.valuation.CashFlow;
import com.tere.finance.risk.riskengine.model.valuation.CurveInterpolator;
import com.tere.finance.risk.riskengine.valuation.ValuationEngine;
import com.tere.finance.risk.riskengine.valuation.ValuationException;

public class InterestRateSwapPricingEngine extends
		ValuationEngine<IborInterestRateSwap>
{

	private CurveInterpolator discountCurveInterpolator;
	private CurveInterpolator yeildCurveInterpolator;
	
	public InterestRateSwapPricingEngine(IborInterestRateSwap interestRateSwap , HolidayCalendar calendar, DayCountConventionType dayCountConventionType, CurveInterpolator discountCurveInterpolator, CurveInterpolator yeildCurveInterpolator)
	{
		super(interestRateSwap, calendar, dayCountConventionType);
		this.discountCurveInterpolator = discountCurveInterpolator;
		this.yeildCurveInterpolator = yeildCurveInterpolator;
	}

	@Override
	public double calculate(ValueType valueType, Date valuationDate) throws ValuationException
	{
		calculateCashFlows(valuationDate);
		
		double pv = 0.0d;
		
		for (CashFlow cashFlow : getInstrument().getFixedLeg())
		{
			pv+=cashFlow.getValue();
		}
		for (CashFlow cashFlow : getInstrument().getFloatingLeg())
		{
			pv-=cashFlow.getValue();
		}
		return pv;
	}

	protected void calculateCashFlows(Date valuationDate) throws ValuationException
	{
		int term = getInstrument().getMaturityDate().getYear()
				- (LocalDate.fromDateFields(valuationDate).getYear());

		int numberOfCoupons = getInstrument().getCouponFrequency().getMultipler()
				* term;
		double couponPayment;
		double notional = getInstrument().getNotional();
		double fixedRate = getInstrument().getFixedRate();
//		IborIndex floatingRate = getInstrument()getFloatingRate();
		Frequency frequency = getInstrument().getCouponFrequency();
		double frequencyMultipler = 356.0 / frequency.getMultipler();
		double floatingSpread = getInstrument().getFloatingSpread(); 
///		int daysInFrequencyPeriod = frequencyMultipler *  
		LocalDate currentDate = getInstrument().getIssueDate();
		CashFlow cashFlow = null;
		
		// Cash Flow/[(1+YTM/Coupon Frequency)^Period]
		int paymentLoop = 0;
		getInstrument().getFixedLeg().clear();
		getInstrument().getFloatingLeg().clear();

		currentDate = LocalDate.now();
		double discountFactor;
		double floatingRate;
		double accrualValue = 1.0; // need to add

		// Fixed leg
		for (paymentLoop=0; paymentLoop < numberOfCoupons; paymentLoop++)
		{
			discountFactor = 1 + (1 - discountCurveInterpolator.getPoint(currentDate)) /  frequency.getMultipler();

			currentDate = getCalendar().nextTradingDay(currentDate);

			couponPayment = notional * (fixedRate / frequency.getMultipler()) * discountFactor * accrualValue; // missing accrual factor
			
			cashFlow = new CashFlow(couponPayment, currentDate);
			getInstrument().getFixedLeg().add(cashFlow);

			currentDate = currentDate.plusDays((int) frequencyMultipler);

		}

		currentDate = LocalDate.now();
		// Floating rate
		for (paymentLoop=0; paymentLoop < numberOfCoupons; paymentLoop++)
		{
			discountFactor = 1 + (1 - discountCurveInterpolator.getPoint(currentDate)) /  frequency.getMultipler();
			floatingRate = yeildCurveInterpolator.getPoint(currentDate);
			
			currentDate = getCalendar().nextTradingDay(currentDate);

			couponPayment = notional * ((floatingRate + floatingSpread) / frequency.getMultipler()) * discountFactor * accrualValue; // missing accrual factor
			
			cashFlow = new CashFlow(couponPayment, currentDate);
			getInstrument().getFloatingLeg().add(cashFlow);

			currentDate = currentDate.plusDays((int) frequencyMultipler);

		}


//		currentDate = LocalDate.now();
//		couponPayment = notional
//				* curveInterpolator.getPoint(currentDate)
//				* (DateUtils.getDaysDifference(getInstrument()getIssueDate()
//						.toDate(), currentDate.toDate())) / frequencyMultipler;
//		cashFlow = new CashFlow(couponPayment, currentDate);
//		getInstrument()getFixedLeg().add(cashFlow);
//
//		for (; paymentLoop < numberOfCoupons; paymentLoop++)
//		{
//			currentDate = calendar.nextTradingDay(currentDate
//					.plusDays((int) frequencyMultipler));
//			couponPayment = notional * fixedRate;
//			cashFlow = new CashFlow(couponPayment, currentDate);
//			getInstrument()getFixedLeg().add(cashFlow);
//		}
	
	}

}
