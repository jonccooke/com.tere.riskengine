package com.tere.finance.risk.riskengine.model.referencedata;

import java.io.Serializable;

import org.joda.time.DateTimeZone;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;

public  class Country implements Serializable, Comparable
{
	protected int countryId; 
	protected String countryName; 
	protected String alpha2; 
	protected String alpha3; 
	protected String iSONumber;
	public Country(int countryId, String countryName, String alpha2,
			String alpha3, String iSONumber)
	{
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.alpha2 = alpha2;
		this.alpha3 = alpha3;
		this.iSONumber = iSONumber;
	}
	public int getCountryId()
	{
		return countryId;
	}
	public String getCountryName()
	{
		return countryName;
	}
	public String getAlpha2()
	{
		return alpha2;
	}
	public String getAlpha3()
	{
		return alpha3;
	}
	public String getiSONumber()
	{
		return iSONumber;
	}
	
	@Override
	public int compareTo(Object o)
	{
		return 0;
	}
	
	
//	
	
////	public DateTimeZone getTimeZone()
////	{
////		return timeZone;
////	}
////
////	public void setTimeZone(DateTimeZone timeZone)
////	{
////		this.timeZone = timeZone;
////	}
////
////	public Country(DateTimeZone timeZone)
////	{
////		this.timeZone = timeZone;
////	}
////	
////	public Country(DateTimeZone timeZone, int countryId, String countryName, String alpha2, String alpha3, String iSONumber, String iSOCode) throws ConstraintVoliationException
////	{
////		this.countryId = countryId;
////		this.countryName = countryName;
////		this.alpha2 = alpha2;
////		this.alpha3 = alpha3;
////		this.iSONumber = iSONumber;
////		this.iSOCode = iSOCode;
////		this.timeZone = timeZone;
////	}
////
//	public void setCountryId(int countryId) throws ConstraintVoliationException
//	{
//		if (null != countryId)
//		{
//		}
//		this.countryId = countryId;
//	}
//	public int getCountryId()
//	{
//		return countryId;
//	}
//	public void setCountryName(String countryName) throws ConstraintVoliationException
//	{
//		if (null != countryName)
//		{
//			if (countryName.length() > 50)
//			{
//				throw new LengthExceededException("$classReflect.getLabelName($param)", 50, countryName.length());
//			}
//		}
//		this.countryName = countryName;
//	}
//	public String getCountryName()
//	{
//		return countryName;
//	}
//	public void setAlpha2(String alpha2) throws ConstraintVoliationException
//	{
//		if (null != alpha2)
//		{
//			if (alpha2.length() > 2)
//			{
//				throw new LengthExceededException("$classReflect.getLabelName($param)", 2, alpha2.length());
//			}
//		}
//		this.alpha2 = alpha2;
//	}
//	public String getAlpha2()
//	{
//		return alpha2;
//	}
//	public void setAlpha3(String alpha3) throws ConstraintVoliationException
//	{
//		if (null != alpha3)
//		{
//			if (alpha3.length() > 3)
//			{
//				throw new LengthExceededException("$classReflect.getLabelName($param)", 3, alpha3.length());
//			}
//		}
//		this.alpha3 = alpha3;
//	}
//	public String getAlpha3()
//	{
//		return alpha3;
//	}
//	public void setISONumber(String iSONumber) throws ConstraintVoliationException
//	{
//		if (null != iSONumber)
//		{
//			if (iSONumber.length() > 3)
//			{
//				throw new LengthExceededException("$classReflect.getLabelName($param)", 3, iSONumber.length());
//			}
//		}
//		this.iSONumber = iSONumber;
//	}
//	public String getISONumber()
//	{
//		return iSONumber;
//	}
//	public void setISOCode(String iSOCode) throws ConstraintVoliationException
//	{
//		if (null != iSOCode)
//		{
//			if (iSOCode.length() > 20)
//			{
//				throw new LengthExceededException("$classReflect.getLabelName($param)", 20, iSOCode.length());
//			}
//		}
//		this.iSOCode = iSOCode;
//	}
//	public String getISOCode()
//	{
//		return iSOCode;
//	}
//
//	public String toString()
//	{
//		StringBuffer buf = new StringBuffer();
//		buf.append("countryId");
//		buf.append("='");
//		buf.append(countryId);
//		buf.append("'");
//
//		buf.append("countryName");
//		buf.append("='");
//		buf.append(countryName);
//		buf.append("'");
//
//		buf.append("alpha2");
//		buf.append("='");
//		buf.append(alpha2);
//		buf.append("'");
//
//		buf.append("alpha3");
//		buf.append("='");
//		buf.append(alpha3);
//		buf.append("'");
//
//		buf.append("iSONumber");
//		buf.append("='");
//		buf.append(iSONumber);
//		buf.append("'");
//
//		buf.append("iSOCode");
//		buf.append("='");
//		buf.append(iSOCode);
//		buf.append("'");
//		return buf.toString();	
//	}
//	
//	@Override
//	public int hashCode()
//	{
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((countryId == null) ? 0 : countryId.hashCode());
//		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
//		result = prime * result + ((alpha2 == null) ? 0 : alpha2.hashCode());
//		result = prime * result + ((alpha3 == null) ? 0 : alpha3.hashCode());
//		result = prime * result + ((iSONumber == null) ? 0 : iSONumber.hashCode());
//		result = prime * result + ((iSOCode == null) ? 0 : iSOCode.hashCode());
//		return result;
//	}
//	
//	public int compareTo(Object obj)
//	{
//	    final int BEFORE = -1;
//	    final int EQUAL = 0;
//	    final int AFTER = 1;
//	
//		if (this == obj)
//			return EQUAL;
//		if (obj == null)
//			return BEFORE;
//		if (getClass() != obj.getClass())
//			return BEFORE;
//		Country other = (Country) obj;
//		int comp = 0;
//		if (countryId == null)
//		{
//			if (other.countryId != null)
//				return BEFORE;
//		}
//		comp = countryId.compareTo(other.countryId);
//		if (EQUAL != comp)
//		{
//			return comp;
//		}
//		if (countryName == null)
//		{
//			if (other.countryName != null)
//				return BEFORE;
//		}
//		comp = countryName.compareTo(other.countryName);
//		if (EQUAL != comp)
//		{
//			return comp;
//		}
//		if (alpha2 == null)
//		{
//			if (other.alpha2 != null)
//				return BEFORE;
//		}
//		comp = alpha2.compareTo(other.alpha2);
//		if (EQUAL != comp)
//		{
//			return comp;
//		}
//		if (alpha3 == null)
//		{
//			if (other.alpha3 != null)
//				return BEFORE;
//		}
//		comp = alpha3.compareTo(other.alpha3);
//		if (EQUAL != comp)
//		{
//			return comp;
//		}
//		if (iSONumber == null)
//		{
//			if (other.iSONumber != null)
//				return BEFORE;
//		}
//		comp = iSONumber.compareTo(other.iSONumber);
//		if (EQUAL != comp)
//		{
//			return comp;
//		}
//		if (iSOCode == null)
//		{
//			if (other.iSOCode != null)
//				return BEFORE;
//		}
//		comp = iSOCode.compareTo(other.iSOCode);
//		if (EQUAL != comp)
//		{
//			return comp;
//		}
//		return comp;
//	}
//
//	@Override
//	public boolean equals(Object obj)
//	{
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Country other = (Country) obj;
//		if (countryId == null)
//		{
//			if (other.countryId != null)
//				return false;
//		}
//		else if (!countryId.equals(other.countryId))
//			return false;
//		if (countryName == null)
//		{
//			if (other.countryName != null)
//				return false;
//		}
//		else if (!countryName.equals(other.countryName))
//			return false;
//		if (alpha2 == null)
//		{
//			if (other.alpha2 != null)
//				return false;
//		}
//		else if (!alpha2.equals(other.alpha2))
//			return false;
//		if (alpha3 == null)
//		{
//			if (other.alpha3 != null)
//				return false;
//		}
//		else if (!alpha3.equals(other.alpha3))
//			return false;
//		if (iSONumber == null)
//		{
//			if (other.iSONumber != null)
//				return false;
//		}
//		else if (!iSONumber.equals(other.iSONumber))
//			return false;
//		if (iSOCode == null)
//		{
//			if (other.iSOCode != null)
//				return false;
//		}
//		else if (!iSOCode.equals(other.iSOCode))
//			return false;
//		return super.equals(obj);
//	}
//

}

