package com.tere.finance.risk.riskengine.model.valuation;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
import com.tere.finance.risk.riskengine.model.instrument.Instrument;

public class Quote implements Comparable, Serializable
{
	public static String QUOTEID_PROPERTY = "Quote.quoteId.property";
	public static String PRICE_PROPERTY = "Quote.price.property";
	public static String CHANGE_PROPERTY = "Quote.change.property";
	public static String VOLUME_PROPERTY = "Quote.volume.property";
	public static String LASTUPDATE_PROPERTY = "Quote.lastUpdate.property";
	public static String TRADEDATE_PROPERTY = "Quote.tradeDate.property";
	public static String CODE_PROPERTY = "Quote.code.property";
	public static String DIVDEND_PROPERTY = "Quote.divdend.property";
	public static String TRADETIME_PROPERTY = "Quote.tradeTime.property";
	public static String OPEN_PROPERTY = "Quote.open.property";
	public static String HIGH_PROPERTY = "Quote.high.property";
	public static String LOW_PROPERTY = "Quote.low.property";
	public static String CLOSE_PROPERTY = "Quote.close.property";
	protected Long quoteId;
	protected Double price;
	protected Double change;
	protected Long volume;
	protected java.util.Date lastUpdate;
	protected java.util.Date tradeDate;
	protected String code;
	protected Double divdend;
	protected java.util.Date tradeTime;
	protected Double open;
	protected Double high;
	protected Double low;
	protected Double close;
	protected Instrument instrument;

	public Quote()
	{
	}

	public Quote(Instrument instrument, Long quoteId, Double price,
			Double change, Long volume, java.util.Date lastUpdate,
			java.util.Date tradeDate, String code, Double divdend,
			java.util.Date tradeTime, Double open, Double high, Double low,
			Double close) throws ConstraintVoliationException
	{
		this.quoteId = quoteId;
		this.price = price;
		this.change = change;
		this.volume = volume;
		this.lastUpdate = lastUpdate;
		this.tradeDate = tradeDate;
		this.code = code;
		this.divdend = divdend;
		this.tradeTime = tradeTime;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.instrument = instrument;
	}

	public Instrument getInstrument()
	{
		return instrument;
	}

	public void setInstrument(Instrument instrument)
	{
		this.instrument = instrument;
	}

	public void setQuoteId(Long quoteId) throws ConstraintVoliationException
	{
		if (null != quoteId)
		{
		}
		this.quoteId = quoteId;
	}

	public Long getQuoteId()
	{
		return quoteId;
	}

	public void setPrice(Double price) throws ConstraintVoliationException
	{
		if (null != price)
		{
		}
		this.price = price;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setChange(Double change) throws ConstraintVoliationException
	{
		if (null != change)
		{
		}
		this.change = change;
	}

	public Double getChange()
	{
		return change;
	}

	public void setVolume(Long volume) throws ConstraintVoliationException
	{
		if (null != volume)
		{
		}
		this.volume = volume;
	}

	public Long getVolume()
	{
		return volume;
	}

	public void setLastUpdate(java.util.Date lastUpdate)
			throws ConstraintVoliationException
	{
		if (null != lastUpdate)
		{
		}
		this.lastUpdate = lastUpdate;
	}

	public java.util.Date getLastUpdate()
	{
		return lastUpdate;
	}

	public void setTradeDate(java.util.Date tradeDate)
			throws ConstraintVoliationException
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

	public void setCode(String code) throws ConstraintVoliationException
	{
		if (null != code)
		{
			if (code.length() > 20)
			{
				throw new LengthExceededException(
						"$classReflect.getLabelName($param)", 20, code.length());
			}
		}
		this.code = code;
	}

	public String getCode()
	{
		return code;
	}

	public void setDivdend(Double divdend) throws ConstraintVoliationException
	{
		if (null != divdend)
		{
		}
		this.divdend = divdend;
	}

	public Double getDivdend()
	{
		return divdend;
	}

	public void setTradeTime(java.util.Date tradeTime)
			throws ConstraintVoliationException
	{
		if (null != tradeTime)
		{
		}
		this.tradeTime = tradeTime;
	}

	public java.util.Date getTradeTime()
	{
		return tradeTime;
	}

	public void setOpen(Double open) throws ConstraintVoliationException
	{
		if (null != open)
		{
		}
		this.open = open;
	}

	public Double getOpen()
	{
		return open;
	}

	public void setHigh(Double high) throws ConstraintVoliationException
	{
		if (null != high)
		{
		}
		this.high = high;
	}

	public Double getHigh()
	{
		return high;
	}

	public void setLow(Double low) throws ConstraintVoliationException
	{
		if (null != low)
		{
		}
		this.low = low;
	}

	public Double getLow()
	{
		return low;
	}

	public void setClose(Double close) throws ConstraintVoliationException
	{
		if (null != close)
		{
		}
		this.close = close;
	}

	public Double getClose()
	{
		return close;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("quoteId");
		buf.append("='");
		buf.append(quoteId);
		buf.append("'");

		buf.append("price");
		buf.append("='");
		buf.append(price);
		buf.append("'");

		buf.append("change");
		buf.append("='");
		buf.append(change);
		buf.append("'");

		buf.append("volume");
		buf.append("='");
		buf.append(volume);
		buf.append("'");

		buf.append("lastUpdate");
		buf.append("='");
		buf.append(lastUpdate);
		buf.append("'");

		buf.append("tradeDate");
		buf.append("='");
		buf.append(tradeDate);
		buf.append("'");

		buf.append("code");
		buf.append("='");
		buf.append(code);
		buf.append("'");

		buf.append("divdend");
		buf.append("='");
		buf.append(divdend);
		buf.append("'");

		buf.append("tradeTime");
		buf.append("='");
		buf.append(tradeTime);
		buf.append("'");

		buf.append("open");
		buf.append("='");
		buf.append(open);
		buf.append("'");

		buf.append("high");
		buf.append("='");
		buf.append(high);
		buf.append("'");

		buf.append("low");
		buf.append("='");
		buf.append(low);
		buf.append("'");

		buf.append("close");
		buf.append("='");
		buf.append(close);
		buf.append("'");
		return buf.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((quoteId == null) ? 0 : quoteId.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((change == null) ? 0 : change.hashCode());
		result = prime * result + ((volume == null) ? 0 : volume.hashCode());
		result = prime * result
				+ ((lastUpdate == null) ? 0 : lastUpdate.hashCode());
		result = prime * result
				+ ((tradeDate == null) ? 0 : tradeDate.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((divdend == null) ? 0 : divdend.hashCode());
		result = prime * result
				+ ((tradeTime == null) ? 0 : tradeTime.hashCode());
		result = prime * result + ((open == null) ? 0 : open.hashCode());
		result = prime * result + ((high == null) ? 0 : high.hashCode());
		result = prime * result + ((low == null) ? 0 : low.hashCode());
		result = prime * result + ((close == null) ? 0 : close.hashCode());
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
		Quote other = (Quote) obj;
		int comp = 0;
		if (quoteId == null)
		{
			if (other.quoteId != null)
				return BEFORE;
		}
		comp = quoteId.compareTo(other.quoteId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (price == null)
		{
			if (other.price != null)
				return BEFORE;
		}
		comp = price.compareTo(other.price);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (change == null)
		{
			if (other.change != null)
				return BEFORE;
		}
		comp = change.compareTo(other.change);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (volume == null)
		{
			if (other.volume != null)
				return BEFORE;
		}
		comp = volume.compareTo(other.volume);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (lastUpdate == null)
		{
			if (other.lastUpdate != null)
				return BEFORE;
		}
		comp = lastUpdate.compareTo(other.lastUpdate);
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
		if (divdend == null)
		{
			if (other.divdend != null)
				return BEFORE;
		}
		comp = divdend.compareTo(other.divdend);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (tradeTime == null)
		{
			if (other.tradeTime != null)
				return BEFORE;
		}
		comp = tradeTime.compareTo(other.tradeTime);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (open == null)
		{
			if (other.open != null)
				return BEFORE;
		}
		comp = open.compareTo(other.open);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (high == null)
		{
			if (other.high != null)
				return BEFORE;
		}
		comp = high.compareTo(other.high);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (low == null)
		{
			if (other.low != null)
				return BEFORE;
		}
		comp = low.compareTo(other.low);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (close == null)
		{
			if (other.close != null)
				return BEFORE;
		}
		comp = close.compareTo(other.close);
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
		Quote other = (Quote) obj;
		if (quoteId == null)
		{
			if (other.quoteId != null)
				return false;
		}
		else if (!quoteId.equals(other.quoteId))
			return false;
		if (price == null)
		{
			if (other.price != null)
				return false;
		}
		else if (!price.equals(other.price))
			return false;
		if (change == null)
		{
			if (other.change != null)
				return false;
		}
		else if (!change.equals(other.change))
			return false;
		if (volume == null)
		{
			if (other.volume != null)
				return false;
		}
		else if (!volume.equals(other.volume))
			return false;
		if (lastUpdate == null)
		{
			if (other.lastUpdate != null)
				return false;
		}
		else if (!lastUpdate.equals(other.lastUpdate))
			return false;
		if (tradeDate == null)
		{
			if (other.tradeDate != null)
				return false;
		}
		else if (!tradeDate.equals(other.tradeDate))
			return false;
		if (code == null)
		{
			if (other.code != null)
				return false;
		}
		else if (!code.equals(other.code))
			return false;
		if (divdend == null)
		{
			if (other.divdend != null)
				return false;
		}
		else if (!divdend.equals(other.divdend))
			return false;
		if (tradeTime == null)
		{
			if (other.tradeTime != null)
				return false;
		}
		else if (!tradeTime.equals(other.tradeTime))
			return false;
		if (open == null)
		{
			if (other.open != null)
				return false;
		}
		else if (!open.equals(other.open))
			return false;
		if (high == null)
		{
			if (other.high != null)
				return false;
		}
		else if (!high.equals(other.high))
			return false;
		if (low == null)
		{
			if (other.low != null)
				return false;
		}
		else if (!low.equals(other.low))
			return false;
		if (close == null)
		{
			if (other.close != null)
				return false;
		}
		else if (!close.equals(other.close))
			return false;
		return super.equals(obj);
	}

}
