package com.tere.finance.risk.riskengine.model.trade;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
import com.tere.finance.risk.riskengine.model.instrument.Instrument;
import com.tere.finance.risk.riskengine.model.referencedata.Country;
import com.tere.finance.risk.riskengine.model.referencedata.Sector;
public  class Trade implements Comparable, Serializable
{
	public static String TRADEID_PROPERTY = "Trade.tradeId.property";
	public static String NOTIONAL_PROPERTY = "Trade.notional.property";
	public static String EXTERNALTRADEID_PROPERTY = "Trade.externalTradeId.property";
	public static String TRADEDATE_PROPERTY = "Trade.tradeDate.property";
	public static String SETTLEMENTDATE_PROPERTY = "Trade.settlementDate.property";
	public static String INSTRUMENT_PROPERTY = "Trade.instrument.property";
	public static String COUNTRYID_PROPERTY = "Trade.countryId.property";
	public static String SECTORID_PROPERTY = "Trade.sectorId.property";
	public static String TRADES_BOOK_PROPERTY = "Trade.tradesBook.property";
	protected Long tradeId; 
	protected java.math.BigDecimal notional; 
	protected String externalTradeId; 
	protected java.util.Date tradeDate; 
	protected java.util.Date settlementDate; 
	protected Instrument instrument; 
	protected Country countryId; 
	protected Sector sectorId; 

	public Trade()
	{
	}
	
	public Trade(Long tradeId, java.math.BigDecimal notional, String externalTradeId, java.util.Date tradeDate, java.util.Date settlementDate, com.tere.finance.risk.riskengine.model.instrument.Instrument instrument, com.tere.finance.risk.riskengine.model.referencedata.Country countryId, com.tere.finance.risk.riskengine.model.referencedata.Sector sectorId) throws ConstraintVoliationException
	{
		this.tradeId = tradeId;
		this.notional = notional;
		this.externalTradeId = externalTradeId;
		this.tradeDate = tradeDate;
		this.settlementDate = settlementDate;
		this.instrument = instrument;
		this.countryId = countryId;
		this.sectorId = sectorId;
	}

	public void setTradeId(Long tradeId) throws ConstraintVoliationException
	{
		if (null != tradeId)
		{
		}
		this.tradeId = tradeId;
	}
	public Long getTradeId()
	{
		return tradeId;
	}
	public void setNotional(java.math.BigDecimal notional) throws ConstraintVoliationException
	{
		if (null != notional)
		{
		}
		this.notional = notional;
	}
	public java.math.BigDecimal getNotional()
	{
		return notional;
	}
	public void setExternalTradeId(String externalTradeId) throws ConstraintVoliationException
	{
		if (null != externalTradeId)
		{
			if (externalTradeId.length() > 50)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 50, externalTradeId.length());
			}
		}
		this.externalTradeId = externalTradeId;
	}
	public String getExternalTradeId()
	{
		return externalTradeId;
	}
	public void setTradeDate(java.util.Date tradeDate) throws ConstraintVoliationException
	{
		if (null != tradeDate)
		{
		}
		this.tradeDate = tradeDate;
	}
	public java.util.Date getTradeDate()
	{
		return tradeDate;
	}
	public void setSettlementDate(java.util.Date settlementDate) throws ConstraintVoliationException
	{
		if (null != settlementDate)
		{
		}
		this.settlementDate = settlementDate;
	}
	public java.util.Date getSettlementDate()
	{
		return settlementDate;
	}
	public void setInstrument(Instrument instrument) throws ConstraintVoliationException
	{
		this.instrument = instrument;
	}
	public Instrument getInstrument()
	{
		return instrument;
	}
	public void setCountryId(Country countryId) throws ConstraintVoliationException
	{
		this.countryId = countryId;
	}
	public Country getCountryId()
	{
		return countryId;
	}
	public void setSectorId(Sector sectorId) throws ConstraintVoliationException
	{
		this.sectorId = sectorId;
	}
	public Sector getSectorId()
	{
		return sectorId;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("tradeId");
		buf.append("='");
		buf.append(tradeId);
		buf.append("'");

		buf.append("notional");
		buf.append("='");
		buf.append(notional);
		buf.append("'");

		buf.append("externalTradeId");
		buf.append("='");
		buf.append(externalTradeId);
		buf.append("'");

		buf.append("tradeDate");
		buf.append("='");
		buf.append(tradeDate);
		buf.append("'");

		buf.append("settlementDate");
		buf.append("='");
		buf.append(settlementDate);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tradeId == null) ? 0 : tradeId.hashCode());
		result = prime * result + ((notional == null) ? 0 : notional.hashCode());
		result = prime * result + ((externalTradeId == null) ? 0 : externalTradeId.hashCode());
		result = prime * result + ((tradeDate == null) ? 0 : tradeDate.hashCode());
		result = prime * result + ((settlementDate == null) ? 0 : settlementDate.hashCode());
		result = prime * result + ((instrument == null) ? 0 : instrument.hashCode());
		result = prime * result + ((countryId == null) ? 0 : countryId.hashCode());
		result = prime * result + ((sectorId == null) ? 0 : sectorId.hashCode());
		return result;
	}
	
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
		Trade other = (Trade) obj;
		int comp = 0;
		if (tradeId == null)
		{
			if (other.tradeId != null)
				return BEFORE;
		}
		comp = tradeId.compareTo(other.tradeId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (notional == null)
		{
			if (other.notional != null)
				return BEFORE;
		}
		comp = notional.compareTo(other.notional);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (externalTradeId == null)
		{
			if (other.externalTradeId != null)
				return BEFORE;
		}
		comp = externalTradeId.compareTo(other.externalTradeId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (tradeDate == null)
		{
			if (other.tradeDate != null)
				return BEFORE;
		}
		comp = tradeDate.compareTo(other.tradeDate);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (settlementDate == null)
		{
			if (other.settlementDate != null)
				return BEFORE;
		}
		comp = settlementDate.compareTo(other.settlementDate);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (instrument == null)
		{
			if (other.instrument != null)
				return BEFORE;
		}
		comp = instrument.compareTo(other.instrument);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (countryId == null)
		{
			if (other.countryId != null)
				return BEFORE;
		}
		comp = countryId.compareTo(other.countryId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (sectorId == null)
		{
			if (other.sectorId != null)
				return BEFORE;
		}
		comp = sectorId.compareTo(other.sectorId);
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
		Trade other = (Trade) obj;
		if (tradeId == null)
		{
			if (other.tradeId != null)
				return false;
		}
		else if (!tradeId.equals(other.tradeId))
			return false;
		if (notional == null)
		{
			if (other.notional != null)
				return false;
		}
		else if (!notional.equals(other.notional))
			return false;
		if (externalTradeId == null)
		{
			if (other.externalTradeId != null)
				return false;
		}
		else if (!externalTradeId.equals(other.externalTradeId))
			return false;
		if (tradeDate == null)
		{
			if (other.tradeDate != null)
				return false;
		}
		else if (!tradeDate.equals(other.tradeDate))
			return false;
		if (settlementDate == null)
		{
			if (other.settlementDate != null)
				return false;
		}
		else if (!settlementDate.equals(other.settlementDate))
			return false;
		if (instrument == null)
		{
			if (other.instrument != null)
				return false;
		}
		else if (!instrument.equals(other.instrument))
			return false;
		if (countryId == null)
		{
			if (other.countryId != null)
				return false;
		}
		else if (!countryId.equals(other.countryId))
			return false;
		if (sectorId == null)
		{
			if (other.sectorId != null)
				return false;
		}
		else if (!sectorId.equals(other.sectorId))
			return false;
		return super.equals(obj);
	}


}

