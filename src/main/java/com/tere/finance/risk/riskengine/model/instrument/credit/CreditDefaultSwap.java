package com.tere.finance.risk.riskengine.model.instrument.credit;

import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.instrument.Instrument;
import com.tere.finance.risk.riskengine.model.instrument.Leg;
import com.tere.finance.risk.riskengine.model.referencedata.Frequency;

public class CreditDefaultSwap extends Instrument
{

	private double notional;
	private double probabilityOfDefault;
	private double lossGivenDefault;
	private double recoveryRate;
	private LocalDate issueDate;
	private LocalDate maturityDate;
	private Leg protectionLeg = new Leg();
	private Leg preminumLeg = new Leg();
	private Frequency couponFrequency;

	

}
