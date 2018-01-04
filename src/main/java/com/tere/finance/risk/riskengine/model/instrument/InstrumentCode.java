package com.tere.finance.risk.riskengine.model.instrument;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
import com.tere.finance.risk.riskengine.model.referencedata.Exchange;
public  class InstrumentCode implements Comparable, Serializable
{
	public static String INSTRUMENTCODEID_PROPERTY = "InstrumentCode.instrumentCodeId.property";
	public static String CODE_PROPERTY = "InstrumentCode.code.property";
	public static String PROVIDERID_PROPERTY = "InstrumentCode.providerId.property";
	public static String ISIN_PROPERTY = "InstrumentCode.ISIN.property";
	public static String EXCHANGE_PROPERTY = "InstrumentCode.exchange.property";
	public static String INSTRUMENT_PROPERTY = "InstrumentCode.instrument.property";
	protected Long instrumentCodeId; 
	protected String code; 
	protected Long providerId; 
	protected String iSIN; 
	protected Exchange exchange; 
	protected Instrument instrument; 

	public InstrumentCode()
	{
	}
	
	public InstrumentCode(Long instrumentCodeId, String code, Long providerId, String iSIN, com.tere.finance.risk.riskengine.model.referencedata.Exchange exchange, com.tere.finance.risk.riskengine.model.instrument.Instrument instrument) throws ConstraintVoliationException
	{
		this.instrumentCodeId = instrumentCodeId;
		this.code = code;
		this.providerId = providerId;
		this.iSIN = iSIN;
		this.exchange = exchange;
		this.instrument = instrument;
	}

	public void setInstrumentCodeId(Long instrumentCodeId) throws ConstraintVoliationException
	{
		if (null != instrumentCodeId)
		{
		}
		this.instrumentCodeId = instrumentCodeId;
	}
	public Long getInstrumentCodeId()
	{
		return instrumentCodeId;
	}
	public void setCode(String code) throws ConstraintVoliationException
	{
		if (null != code)
		{
			if (code.length() > 30)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 30, code.length());
			}
		}
		this.code = code;
	}
	public String getCode()
	{
		return code;
	}
	public void setProviderId(Long providerId) throws ConstraintVoliationException
	{
		if (null != providerId)
		{
		}
		this.providerId = providerId;
	}
	public Long getProviderId()
	{
		return providerId;
	}
	public void setISIN(String iSIN) throws ConstraintVoliationException
	{
		if (null != iSIN)
		{
			if (iSIN.length() > 20)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 20, iSIN.length());
			}
		}
		this.iSIN = iSIN;
	}
	public String getISIN()
	{
		return iSIN;
	}
	public void setExchange(Exchange exchange) throws ConstraintVoliationException
	{
		this.exchange = exchange;
	}
	public Exchange getExchange()
	{
		return exchange;
	}
	public void setInstrument(Instrument instrument) throws ConstraintVoliationException
	{
		this.instrument = instrument;
	}
	public Instrument getInstrument()
	{
		return instrument;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("instrumentCodeId");
		buf.append("='");
		buf.append(instrumentCodeId);
		buf.append("'");

		buf.append("code");
		buf.append("='");
		buf.append(code);
		buf.append("'");

		buf.append("providerId");
		buf.append("='");
		buf.append(providerId);
		buf.append("'");

		buf.append("iSIN");
		buf.append("='");
		buf.append(iSIN);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((instrumentCodeId == null) ? 0 : instrumentCodeId.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((providerId == null) ? 0 : providerId.hashCode());
		result = prime * result + ((iSIN == null) ? 0 : iSIN.hashCode());
		result = prime * result + ((exchange == null) ? 0 : exchange.hashCode());
		result = prime * result + ((instrument == null) ? 0 : instrument.hashCode());
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
		InstrumentCode other = (InstrumentCode) obj;
		int comp = 0;
		if (instrumentCodeId == null)
		{
			if (other.instrumentCodeId != null)
				return BEFORE;
		}
		comp = instrumentCodeId.compareTo(other.instrumentCodeId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (code == null)
		{
			if (other.code != null)
				return BEFORE;
		}
		comp = code.compareTo(other.code);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (providerId == null)
		{
			if (other.providerId != null)
				return BEFORE;
		}
		comp = providerId.compareTo(other.providerId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (iSIN == null)
		{
			if (other.iSIN != null)
				return BEFORE;
		}
		comp = iSIN.compareTo(other.iSIN);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (exchange == null)
		{
			if (other.exchange != null)
				return BEFORE;
		}
		comp = exchange.compareTo(other.exchange);
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
		InstrumentCode other = (InstrumentCode) obj;
		if (instrumentCodeId == null)
		{
			if (other.instrumentCodeId != null)
				return false;
		}
		else if (!instrumentCodeId.equals(other.instrumentCodeId))
			return false;
		if (code == null)
		{
			if (other.code != null)
				return false;
		}
		else if (!code.equals(other.code))
			return false;
		if (providerId == null)
		{
			if (other.providerId != null)
				return false;
		}
		else if (!providerId.equals(other.providerId))
			return false;
		if (iSIN == null)
		{
			if (other.iSIN != null)
				return false;
		}
		else if (!iSIN.equals(other.iSIN))
			return false;
		if (exchange == null)
		{
			if (other.exchange != null)
				return false;
		}
		else if (!exchange.equals(other.exchange))
			return false;
		if (instrument == null)
		{
			if (other.instrument != null)
				return false;
		}
		else if (!instrument.equals(other.instrument))
			return false;
		return super.equals(obj);
	}


}

