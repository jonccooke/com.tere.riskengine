package com.tere.finance.risk.riskengine.model.trade;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
import com.tere.finance.risk.riskengine.model.referencedata.Counterparty;
public  class OTCTrade extends Trade  implements Comparable, Serializable
{
	public static String STRIKE_PROPERTY = "OTCTrade.strike.property";
	public static String BUY_COUNTERPARTYNAME_PROPERTY = "OTCTrade.buyCounterpartyName.property";
	public static String SELL_COUNTERPARTYNAME_PROPERTY = "OTCTrade.sellCounterpartyName.property";
	public static String Counterparty_PROPERTY = "OTCTrade.counterparty.property";
	protected java.math.BigDecimal strike; 
	protected String counterpartyName; 
	protected Counterparty buyCounterparty; 
	protected Counterparty sellCounterparty; 

	public Counterparty getSellCounterparty()
	{
		return sellCounterparty;
	}

	public void setSellCounterparty(Counterparty sellCounterparty)
	{
		this.sellCounterparty = sellCounterparty;
	}

	public OTCTrade()
	{
	}
	
	public OTCTrade(Long tradeId, java.math.BigDecimal notional, String externalTradeId, java.util.Date tradeDate, java.util.Date settlementDate, java.math.BigDecimal strike, String counterpartyName, com.tere.finance.risk.riskengine.model.instrument.Instrument instrument, com.tere.finance.risk.riskengine.model.referencedata.Country countryId, com.tere.finance.risk.riskengine.model.referencedata.Sector sectorId, com.tere.finance.risk.riskengine.model.referencedata.Counterparty buyCounterparty, com.tere.finance.risk.riskengine.model.referencedata.Counterparty sellCounterparty) throws ConstraintVoliationException
	{
		this.tradeId = tradeId;
		this.notional = notional;
		this.externalTradeId = externalTradeId;
		this.tradeDate = tradeDate;
		this.settlementDate = settlementDate;
		this.strike = strike;
		this.counterpartyName = counterpartyName;
		this.instrument = instrument;
		this.countryId = countryId;
		this.sectorId = sectorId;
		this.buyCounterparty = buyCounterparty;
		this.sellCounterparty = sellCounterparty;
	}

	public void setStrike(java.math.BigDecimal strike) throws ConstraintVoliationException
	{
		if (null != strike)
		{
		}
		this.strike = strike;
	}
	public java.math.BigDecimal getStrike()
	{
		return strike;
	}
	public void setCounterpartyName(String counterpartyName) throws ConstraintVoliationException
	{
		if (null != counterpartyName)
		{
			if (counterpartyName.length() > 200)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 200, counterpartyName.length());
			}
		}
		this.counterpartyName = counterpartyName;
	}
	public String getCounterpartyName()
	{
		return counterpartyName;
	}
	public void setCounterparty(Counterparty counterparty) throws ConstraintVoliationException
	{
		this.buyCounterparty = counterparty;
	}
	public Counterparty getCounterparty()
	{
		return buyCounterparty;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("strike");
		buf.append("='");
		buf.append(strike);
		buf.append("'");

		buf.append("counterpartyName");
		buf.append("='");
		buf.append(counterpartyName);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((strike == null) ? 0 : strike.hashCode());
		result = prime * result + ((counterpartyName == null) ? 0 : counterpartyName.hashCode());
		result = prime * result + ((buyCounterparty == null) ? 0 : buyCounterparty.hashCode());
		return result;
	}
	
	@Override
	public int compareTo(Object obj)
	{
	    final int BEFORE = -1;
	    final int EQUAL = 0;
	    final int AFTER = 1;
	
		if (this == obj)
			return EQUAL;
		if (obj == null)
			return BEFORE;
		if (getClass() != obj.getClass())
			return BEFORE;
		OTCTrade other = (OTCTrade) obj;
		int comp = 0;
		if (strike == null)
		{
			if (other.strike != null)
				return BEFORE;
		}
		comp = strike.compareTo(other.strike);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (counterpartyName == null)
		{
			if (other.counterpartyName != null)
				return BEFORE;
		}
		comp = counterpartyName.compareTo(other.counterpartyName);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (buyCounterparty == null)
		{
			if (other.buyCounterparty != null)
				return BEFORE;
		}
		comp = buyCounterparty.compareTo(other.buyCounterparty);
		if (EQUAL != comp)
		{
			return comp;
		}
		return comp;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OTCTrade other = (OTCTrade) obj;
		if (strike == null)
		{
			if (other.strike != null)
				return false;
		}
		else if (!strike.equals(other.strike))
			return false;
		if (counterpartyName == null)
		{
			if (other.counterpartyName != null)
				return false;
		}
		else if (!counterpartyName.equals(other.counterpartyName))
			return false;
		if (buyCounterparty == null)
		{
			if (other.buyCounterparty != null)
				return false;
		}
		else if (!buyCounterparty.equals(other.buyCounterparty))
			return false;
		return super.equals(obj);
	}


}

