package com.tere.finance.risk.riskengine.model.valuation;

import java.util.Collection;

import org.joda.time.Days;
import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.valuation.CurveException;
import com.tere.finance.risk.riskengine.valuation.ValuationException;

public class LinearCurveInterpolator extends CurveInterpolator
{
	private Curve curve;
	private int[] dateOffsets;
	private double[] values;
	private int actualCount = 0;
	private Collection<CurvePoint> curvePoints;
	
	public LinearCurveInterpolator(Curve curve)
	{
		this.curve = curve;
		this.curvePoints = curve.getPoints();
//		actualCount = Days.daysBetween(curve.getFirstDate(), curve.getLastDate()).getDays();
		actualCount = curvePoints.size();
		dateOffsets = new int[actualCount];
		values = new double[actualCount];
	}

	/* (non-Javadoc)
	 * @see com.tere.finance.risk.riskengine.model.valuation.CurveInterpolator#buildCurve()
	 */
	@Override
	public void buildCurve()
	{
		int dateOffset;
		int loop=0;
		for (CurvePoint point : curve.getPoints())
		{
			dateOffset = Days.daysBetween(curve.getFirstDate(), point.getDate()).getDays();
			values[loop] = point.getPoint(); 
			dateOffsets[loop++] = dateOffset; 
		}
	}
	
	/* (non-Javadoc)
	 * @see com.tere.finance.risk.riskengine.model.valuation.CurveInterpolator#getPoint(org.joda.time.LocalDate)
	 */
	@Override
	public double getPoint(LocalDate date) throws CurveException
	{
		int currentOffset = 0;
		LocalDate currentDate;
		int loop=0;
		double value;
		CurvePoint curvePoint=null;
		if (null != (curvePoint = curve.getCurvePoint(date)))
		{
			return curvePoint.getPoint();
		}
		if (date == curve.getFirstDate())
		{
			return values[0];
		}
		if (date == curve.getLastDate())
		{
			return values[0];
		}
		int dateOffset = Days.daysBetween(curve.getFirstDate(), date).getDays();
		if (dateOffset < 0)
		{
			throw new CurvePointOutOfRangeException(date, curve.getFirstDate());
		}
		
		currentDate = curve.getFirstDate();
		
		while (currentDate.isBefore(date))
		{
			if (currentDate.equals(date))
			{
				return values[loop];
			}
			loop++;
			currentDate = currentDate.plusDays(dateOffsets[loop]);
		}
		value = (values[loop] + values[loop-1])/2;
		return value;
	}
}
