package com.tere.finance.risk.riskengine.valuation.fixedincome;

import java.util.Date;

import org.joda.time.Days;
import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.instrument.Leg;
import com.tere.finance.risk.riskengine.model.instrument.fixedincome.FixedRateBond;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.Frequency;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.model.valuation.CashFlow;
import com.tere.finance.risk.riskengine.valuation.PricingException;
import com.tere.finance.risk.riskengine.valuation.ValuationEngine;

public class BondPricingEngine extends ValuationEngine<FixedRateBond>
{

	public BondPricingEngine(FixedRateBond instrument, HolidayCalendar calendar, DayCountConventionType dayCountConventionType)
	{
		super(instrument, calendar, dayCountConventionType);
	}
/**
	Formula for Calculating Accrued Interest (Actual/Actual Day-Count Basis)
	Accrued Interest	=	 Interest Payment	×	Number of Days since Last Payment
													---------------------------------
													Number of Days between Payments
	**/
	
	protected double calculateAccruedInterest()
	{
		double accruedInterest = 0.0d;
		LocalDate now = LocalDate.now();
		int daysPerCoupon = (int)365.0 / getInstrument().getCouponFrequency().getMultipler();
		int daysSinceIssue = Days.daysBetween(getInstrument().getIssueDate(), now).getDays();
		int daysSinceCoupon = daysSinceIssue % daysPerCoupon;
		double couponFraction = (double)daysSinceCoupon / daysPerCoupon;
		accruedInterest = getInstrument().getFaceAmount() * getInstrument().getCouponRate() * couponFraction;
		return accruedInterest;
	}

	protected double calculateAccruedInterest(Date valuationDate)
	{
		double accruedInterest = 0.0d;
		LocalDate now = LocalDate.fromDateFields(valuationDate);
		int daysPerCoupon = (int)365.0 / getInstrument().getCouponFrequency().getMultipler();
		int daysSinceIssue = Days.daysBetween(getInstrument().getIssueDate(), now).getDays();
		int daysSinceCoupon = daysSinceIssue % daysPerCoupon;
		double couponFraction = (double)daysSinceCoupon / daysPerCoupon;
		accruedInterest = getInstrument().getFaceAmount() * getInstrument().getCouponRate() * couponFraction;
		return accruedInterest;
	}

	protected void calculateCashFlows() throws PricingException
	{
		Leg leg = new Leg();
		int term = getInstrument().getMaturityDate().getYear() - (getInstrument().getIssueDate().getYear());
		int numberOfCoupons = getInstrument().getCouponFrequency().getMultipler() * term;
		double couponPayment;
		double faceValue = getInstrument().getFaceAmount();
		double cashFlowPayment = 0.0;
		double couponRate = getInstrument().getCouponRate();
		double yeild = getInstrument().getYeildToMaturity();
//		double accuredInterest = calculateAccruedInterest();
		Frequency frequency = getInstrument().getCouponFrequency();
		int frequencyMultipler = frequency.getMultipler();
		LocalDate currentDate = getInstrument().getIssueDate();
		CashFlow cashFlow = null;
		// Cash Flow/[(1+YTM/Coupon Frequency)^Period]
		int paymentLoop=0;
		for (;paymentLoop<numberOfCoupons;paymentLoop++)
		{
			currentDate = getCalendar().nextTradingDay(currentDate.plusDays(Math.abs(365 / frequencyMultipler)));
			cashFlowPayment = (couponRate / frequencyMultipler) * faceValue; 
			couponPayment = Math.pow(1+ (yeild/frequencyMultipler), paymentLoop + 1); 
			couponPayment= cashFlowPayment / couponPayment;
//			couponPayment = faceValue * couponRate / Math.pow( 1 + (yeild / frequencyMultipler),  paymentLoop);
			cashFlow = new CashFlow(couponPayment, currentDate);
			leg.add(cashFlow);
		}
		// Add final
		couponPayment = Math.pow(1+ (yeild/frequencyMultipler), paymentLoop + 1); 
		couponPayment= faceValue / couponPayment;
//		couponPayment = faceValue * couponRate / Math.pow( 1 + (yeild / frequencyMultipler),  paymentLoop);
		cashFlow = new CashFlow(couponPayment, currentDate);
		leg.add(cashFlow);
//		currentDate = getCalendar().nextTradingDay(currentDate.plusDays(Math.abs(356 / frequencyMultipler)));
//		couponPayment = yeild / frequencyMultipler//(faceValue + couponRate * faceValue) / Math.pow( 1 + (yeild / frequencyMultipler),  paymentLoop);
//		cashFlow = new CashFlow(couponPayment, currentDate);
//		leg.add(cashFlow);
		
		getInstrument().setLeg(leg);
	}

	protected void calculateCashFlows(Date valuationDate) throws PricingException
	{
		Leg leg = new Leg();
		LocalDate currentDate = LocalDate.fromDateFields(valuationDate);
		int term = getInstrument().getMaturityDate().getYear() - (currentDate.getYear());
		int numberOfCoupons = getInstrument().getCouponFrequency().getMultipler() * term;
		double couponPayment;
		double faceValue = getInstrument().getFaceAmount();
		double cashFlowPayment = 0.0;
		double couponRate = getInstrument().getCouponRate();
		double yeild = getInstrument().getYeildToMaturity();
//		double accuredInterest = calculateAccruedInterest();
		Frequency frequency = getInstrument().getCouponFrequency();
		int frequencyMultipler = frequency.getMultipler();
		CashFlow cashFlow = null;
		// Cash Flow/[(1+YTM/Coupon Frequency)^Period]
		int paymentLoop=0;
		for (;paymentLoop<numberOfCoupons;paymentLoop++)
		{
			currentDate = getCalendar().nextTradingDay(currentDate.plusDays(Math.abs(365 / frequencyMultipler)));
			cashFlowPayment = (couponRate / frequencyMultipler) * faceValue; 
			couponPayment = Math.pow(1+ (yeild/frequencyMultipler), paymentLoop + 1); 
			couponPayment= cashFlowPayment / couponPayment;
//			couponPayment = faceValue * couponRate / Math.pow( 1 + (yeild / frequencyMultipler),  paymentLoop);
			cashFlow = new CashFlow(couponPayment, currentDate);
			leg.add(cashFlow);
		}
		// Add final
		couponPayment = Math.pow(1+ (yeild/frequencyMultipler), paymentLoop + 1); 
		couponPayment= faceValue / couponPayment;
//		couponPayment = faceValue * couponRate / Math.pow( 1 + (yeild / frequencyMultipler),  paymentLoop);
		cashFlow = new CashFlow(couponPayment, currentDate);
		leg.add(cashFlow);
//		currentDate = getCalendar().nextTradingDay(currentDate.plusDays(Math.abs(356 / frequencyMultipler)));
//		couponPayment = yeild / frequencyMultipler//(faceValue + couponRate * faceValue) / Math.pow( 1 + (yeild / frequencyMultipler),  paymentLoop);
//		cashFlow = new CashFlow(couponPayment, currentDate);
//		leg.add(cashFlow);
		
		getInstrument().setLeg(leg);
	}

	@Override
	public double calculate(ValueType valueType, Date valuationDate) throws PricingException
	{
//		calculateCashFlows();
		
		switch (valueType)
		{
		case PV:
			calculateCashFlows(valuationDate);
			double pv = 0.0d;
			for (CashFlow cashFlow :  getInstrument().getLeg())
			{
				pv += cashFlow .getValue();
			}
			return pv;
		}
		
		throw new PricingException(valueType.toString() + " not supported");
	}

}
