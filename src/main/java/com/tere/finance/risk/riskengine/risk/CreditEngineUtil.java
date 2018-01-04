package com.tere.finance.risk.riskengine.risk;

import java.util.Arrays;

import org.apache.commons.math3.stat.descriptive.rank.Percentile;

public class CreditEngineUtil
{

	public static double calcPD(double creditScore /* 0 - 100 */)
	{
		return -10 * 1 / (1 + Math.log(-creditScore)) + 10;
	}

	/* Expected exposure is the expected (average) credit exposure conditional on positive market values */
	public static double expectedExposure(double[] values)
	{
		double sum = 0.0d;
		long count =0;
		for (double val : values)
		{
			if (val >0d)
			{
				sum += val;
				count++;
			}
		}
		if(count >0)
		{
			return sum/count;
		}
		return 0.0d;
	}

	public static double potentialFutureExposure(double[] values, double confidenceLevel)
	{
		double sum = 0.0d;
		int count =0;
		double[] filteredValues = new double[values.length];
				
		for (double val : values)
		{
			if (val >0d)
			{
				filteredValues[count++] = val;
				count++;
			}
		}
		if(count >0)
		{
			Arrays.sort(filteredValues);
			return new Percentile(confidenceLevel).evaluate(filteredValues);
		}
		return 0;
	}

	public static double maxPotentialFutureExposure(double[] eeValuesByDate)
	{
		 int indexOfMax = 0;
	    for (int eeLoop=1; eeLoop < eeValuesByDate.length; eeLoop++) 
	    {
	        if (eeValuesByDate[eeLoop] > eeValuesByDate[indexOfMax])
	        {
	            indexOfMax = eeLoop;
	        }
	    }
	    return indexOfMax;
	}

	public static double expectedPositiveExposure(double[] eeValuesByDate, double[] timeIntervals)
	{
		 int indexOfMax = 0;
		 double runningTotal = 0.0d;
		 double timeIntervalSum = 0.0d;
		 
	    for (int eeLoop=0; eeLoop < eeValuesByDate.length-1; eeLoop++) 
	    {
	    	runningTotal += eeValuesByDate[eeLoop] * eeValuesByDate[eeLoop+1];
	    }
	    for (int eeLoop=0; eeLoop < timeIntervals.length; eeLoop++) 
	    {
	    	timeIntervalSum+=timeIntervals[eeLoop];
	    }
	    return runningTotal/timeIntervalSum;
	}

	public static double effectiveExpectedExposure(double[] eeValuesByDate, int start, int end)
	{
		 double maxTotal = eeValuesByDate[start];
		 
	    for (int eeLoop=start; eeLoop < end; eeLoop++) 
	    {
	    	if (eeValuesByDate[eeLoop] >0.0d && eeValuesByDate[eeLoop]> maxTotal)
	    	{
	    		maxTotal = eeValuesByDate[eeLoop];
	    	}
	    }
	    return maxTotal;
	}

	
//	/* Effective Expected Positive Exposure (EEPE) is the weighted average over time of effective expected exposure */
//	def effectiveExpectedPositiveExposure(eeeProfile: Seq[Double], timeIntervals: Seq[Double]) = 
//	  eeeProfile.zip(timeIntervals).map(x => (x._1 * x._2)).sum / timeIntervals.sum
}
