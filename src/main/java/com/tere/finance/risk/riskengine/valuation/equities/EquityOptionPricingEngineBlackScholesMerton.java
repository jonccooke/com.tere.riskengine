package com.tere.finance.risk.riskengine.valuation.equities;

import java.util.Date;

import com.tere.finance.risk.riskengine.model.instrument.Exercise;
import com.tere.finance.risk.riskengine.model.instrument.Option;
import com.tere.finance.risk.riskengine.model.instrument.equities.Equity;
import com.tere.finance.risk.riskengine.model.instrument.equities.EquityOption;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.valuation.ValuationEngine;
import com.tere.finance.risk.riskengine.valuation.PricingException;
import com.tere.finance.risk.riskengine.valuation.StatisticsUtils;

public class EquityOptionPricingEngineBlackScholesMerton extends
		ValuationEngine<EquityOption>
{
	/**
	 * d1 0.1500 N(d1) 0.5596 d2 -0.1500 N(d2) 0.4404 Call Price $1.192
	 * 
	 * Stock (S) $10.00 Strike (K) $10.00 Volatity 30.0% Variance 9.00% Riskfree
	 * rate (r) 0.00% Term (T) 1.00 Div Yield 0.00%
	 */
	public EquityOptionPricingEngineBlackScholesMerton(EquityOption instrument,
			HolidayCalendar calendar,
			DayCountConventionType dayCountConventionType)
	{
		super(instrument, calendar, dayCountConventionType);
	}

	@Override
	public double calculate(
			ValueType valueType, Date valuationDate)
			throws PricingException
	{
		switch (valueType)
		{
		case PV:
			Equity equity = getInstrument().getEquity();

			double sigma = getInstrument().getImpliedVolatility();
			double variance = sigma*sigma;
			double stock = equity.getPrice();
			double strike = getInstrument().getExercisePrice();
			double dividend = equity.getDividend();
			double riskFree = getInstrument().getRiskFreeRate();
			double price = 0;
			int term = getInstrument().getTerm();

			if (getInstrument().getExercise().equals(Exercise.European))
			{
				if (getInstrument().getType().equals(Option.Type.Call))
				{
					double d1 = (Math.log(stock / strike) + (riskFree
							- dividend + (variance / 2))
							* term)
							/ (sigma * Math.sqrt(term));
					double n1 = StatisticsUtils
							.cumulativeStandardNormalDistribution(d1);
					double d2 = d1 - sigma * Math.sqrt(term);
					double n2 = StatisticsUtils
							.cumulativeStandardNormalDistribution(d2);
					price = (Math.exp((0 - dividend) * term) * stock * n1)
							- strike * (Math.exp((-riskFree) * term)) * n2;
				}
				else
				{
					double d1 = -(Math.log(stock / strike) + (riskFree
							- dividend + (variance / 2))
							* term)
							/ (sigma * Math.sqrt(term));
					double n1 = StatisticsUtils
							.cumulativeStandardNormalDistribution(d1);
					double d2 = -d1 - sigma * Math.sqrt(term);
					double n2 = StatisticsUtils
							.cumulativeStandardNormalDistribution(d2);
					price = strike * Math.exp(-riskFree * term) * n2 - stock
							* n1;
				}
			}
			return price;
		}

		throw new PricingException(valueType.toString() + " not supported");
	}

//	@Override
//	public void calculateCashFlows() throws PricingException
//	{
//		// TODO Auto-generated method stub
//
//	}

}
