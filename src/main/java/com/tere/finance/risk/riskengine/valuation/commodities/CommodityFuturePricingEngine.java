package com.tere.finance.risk.riskengine.valuation.commodities;

import java.util.Date;

import com.tere.finance.risk.riskengine.model.instrument.commodity.CommodityFuture;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.valuation.ValuationEngine;
import com.tere.finance.risk.riskengine.valuation.ValuationException;

public class CommodityFuturePricingEngine extends ValuationEngine<CommodityFuture>
{
	
	

	public CommodityFuturePricingEngine(CommodityFuture instrument,
			HolidayCalendar calendar, DayCountConventionType dayCountConventionType)
	{
		super(instrument, calendar, dayCountConventionType);
	}
/**
			S = spot price of the commodity
			F = futures price at parity
			r = continous risk free rate used to calculate the borrowing cost
			y = storage cost for the commodity
			q = dividends or revenues accruing to the holder of the spot position until delivery
			u = convenience yield refering to cost due to not having the asset
			T = time from today until expiry of the futures contract

			Formula:

			F = S * exp( (r + y - q - u) * T)
**/
	@Override
	public double calculate(ValueType valueType, Date valuationDate) throws ValuationException
	{
//		double underlyingSpotPrice = getInstrument().getReferencePrice();
//		double futuresPrice = getInstrument().get;
//		double underlyingSpotPrice = getInstrument().getReferencePrice();
//		
		return 0;
	}

//	@Override
//	public void calculateCashFlows() throws ValuationException
//	{
//		// TODO Auto-generated method stub
//
//	}

}
