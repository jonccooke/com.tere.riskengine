package com.tere.finance.risk.riskengine.model.instrument.fixedincome;

import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.instrument.IborIndex;
import com.tere.finance.risk.riskengine.model.instrument.Instrument;

public class ForwardRateAgreement extends Instrument
{

	private double spotPrice;
	private double deliveryPrice;
	private LocalDate maturityDate;
	private LocalDate issueDate;
	private IborIndex index;

	public ForwardRateAgreement(double spotPrice, double deliveryPrice,
			LocalDate maturityDate, LocalDate issueDate, IborIndex index)
	{
		super();
		this.spotPrice = spotPrice;
		this.deliveryPrice = deliveryPrice;
		this.maturityDate = maturityDate;
		this.index = index;
		this.issueDate = issueDate;
	}

	public LocalDate getIssueDate()
	{
		return issueDate;
	}

	public double getSpotPrice()
	{
		return spotPrice;
	}

	public double getDeliveryPrice()
	{
		return deliveryPrice;
	}

	public LocalDate getMaturityDate()
	{
		return maturityDate;
	}

	public IborIndex getIborIndex()
	{
		return index;
	}
}
