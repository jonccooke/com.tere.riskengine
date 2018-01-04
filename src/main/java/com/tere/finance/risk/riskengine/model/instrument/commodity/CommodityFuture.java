package com.tere.finance.risk.riskengine.model.instrument.commodity;

import java.util.Currency;

import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.instrument.Instrument;

public class CommodityFuture extends Instrument
{
/**
	S = spot price of the commodity
	F = futures price at parity
	r = continous risk free rate used to calculate the borrowing cost
	y = storage cost for the commodity
	q = dividends or revenues accruing to the holder of the spot position until delivery
	u = convenience yield refering to cost due to not having the asset
	T = time from today until expiry of the futures contract
**/

	private Commodity underlying;
	private double strike;
	private double storageCost;
	private double dividend;
	private LocalDate maturityDate;
	private Currency currency;
	private SettlementType settlementType;
	
	
}
