package com.tere.finance.risk.riskengine.model.risk;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
public  class Facility implements Comparable, Serializable
{
	public static String CURRENTPROPOSEDFLAG_PROPERTY = "Facility.currentProposedFlag.property";
	public static String FACCCY_PROPERTY = "Facility.facCcy.property";
	public static String FACILITYBOOKINGOFFICE_PROPERTY = "Facility.facilityBookingOffice.property";
	public static String FACILITYCLIENTNAME_PROPERTY = "Facility.facilityClientName.property";
	public static String FACILITYEXPIRYDATE_PROPERTY = "Facility.facilityExpiryDate.property";
	public static String FACILITYGROSSAMOUNT_PROPERTY = "Facility.facilityGrossAmount.property";
	public static String FACILITYID_PROPERTY = "Facility.facilityId.property";
	public static String FACILITYLEVELPURPOSE_PROPERTY = "Facility.facilityLevelPurpose.property";
	public static String FACILITYLIMIT_PROPERTY = "Facility.facilityLimit.property";
	public static String FACILITYLONGTERMAMOUNT_PROPERTY = "Facility.facilityLongTermAmount.property";
	public static String FACILITYMEDIUMTERMAMOUNT_PROPERTY = "Facility.facilityMediumTermAmount.property";
	public static String FACILITYPRODUCTNAME_PROPERTY = "Facility.facilityProductName.property";
	public static String FACILITYSETTLEMENTAMOUNT_PROPERTY = "Facility.facilitySettlementAmount.property";
	public static String FACILITYSHORTTERMAMOUNT_PROPERTY = "Facility.facilityShortTermAmount.property";
	public static String FACILITYTERMINDAYS_PROPERTY = "Facility.facilityTermInDays.property";
	public static String FACILITYTERMINMONTHS_PROPERTY = "Facility.facilityTermInMonths.property";
	public static String FACILITYTERMINYEARS_PROPERTY = "Facility.facilityTermInYears.property";
	public static String FACILITYTYPE_PROPERTY = "Facility.facilityType.property";
	public static String MANDCAPID_PROPERTY = "Facility.mandCapId.property";
	protected String currentProposedFlag; 
	protected String facCcy; 
	protected String facilityBookingOffice; 
	protected String facilityClientName; 
	protected java.util.Date facilityExpiryDate; 
	protected String facilityGrossAmount; 
	protected Long facilityId; 
	protected String facilityLevelPurpose; 
	protected String facilityLimit; 
	protected String facilityLongTermAmount; 
	protected String facilityMediumTermAmount; 
	protected String facilityProductName; 
	protected String facilitySettlementAmount; 
	protected String facilityShortTermAmount; 
	protected Integer facilityTermInDays; 
	protected String facilityTermInMonths; 
	protected String facilityTermInYears; 
	protected String facilityType; 
	protected Long mandCapId; 

	public Facility()
	{
	}
	
	public Facility(String currentProposedFlag, String facCcy, String facilityBookingOffice, String facilityClientName, java.util.Date facilityExpiryDate, String facilityGrossAmount, Long facilityId, String facilityLevelPurpose, String facilityLimit, String facilityLongTermAmount, String facilityMediumTermAmount, String facilityProductName, String facilitySettlementAmount, String facilityShortTermAmount, Integer facilityTermInDays, String facilityTermInMonths, String facilityTermInYears, String facilityType, Long mandCapId) throws ConstraintVoliationException
	{
		this.currentProposedFlag = currentProposedFlag;
		this.facCcy = facCcy;
		this.facilityBookingOffice = facilityBookingOffice;
		this.facilityClientName = facilityClientName;
		this.facilityExpiryDate = facilityExpiryDate;
		this.facilityGrossAmount = facilityGrossAmount;
		this.facilityId = facilityId;
		this.facilityLevelPurpose = facilityLevelPurpose;
		this.facilityLimit = facilityLimit;
		this.facilityLongTermAmount = facilityLongTermAmount;
		this.facilityMediumTermAmount = facilityMediumTermAmount;
		this.facilityProductName = facilityProductName;
		this.facilitySettlementAmount = facilitySettlementAmount;
		this.facilityShortTermAmount = facilityShortTermAmount;
		this.facilityTermInDays = facilityTermInDays;
		this.facilityTermInMonths = facilityTermInMonths;
		this.facilityTermInYears = facilityTermInYears;
		this.facilityType = facilityType;
		this.mandCapId = mandCapId;
	}

	public void setCurrentProposedFlag(String currentProposedFlag) throws ConstraintVoliationException
	{
		if (null != currentProposedFlag)
		{
			if (currentProposedFlag.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, currentProposedFlag.length());
			}
		}
		this.currentProposedFlag = currentProposedFlag;
	}
	public String getCurrentProposedFlag()
	{
		return currentProposedFlag;
	}
	public void setFacCcy(String facCcy) throws ConstraintVoliationException
	{
		if (null != facCcy)
		{
			if (facCcy.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facCcy.length());
			}
		}
		this.facCcy = facCcy;
	}
	public String getFacCcy()
	{
		return facCcy;
	}
	public void setFacilityBookingOffice(String facilityBookingOffice) throws ConstraintVoliationException
	{
		if (null != facilityBookingOffice)
		{
			if (facilityBookingOffice.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityBookingOffice.length());
			}
		}
		this.facilityBookingOffice = facilityBookingOffice;
	}
	public String getFacilityBookingOffice()
	{
		return facilityBookingOffice;
	}
	public void setFacilityClientName(String facilityClientName) throws ConstraintVoliationException
	{
		if (null != facilityClientName)
		{
			if (facilityClientName.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityClientName.length());
			}
		}
		this.facilityClientName = facilityClientName;
	}
	public String getFacilityClientName()
	{
		return facilityClientName;
	}
	public void setFacilityExpiryDate(java.util.Date facilityExpiryDate) throws ConstraintVoliationException
	{
		if (null != facilityExpiryDate)
		{
		}
		this.facilityExpiryDate = facilityExpiryDate;
	}
	public java.util.Date getFacilityExpiryDate()
	{
		return facilityExpiryDate;
	}
	public void setFacilityGrossAmount(String facilityGrossAmount) throws ConstraintVoliationException
	{
		if (null != facilityGrossAmount)
		{
			if (facilityGrossAmount.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityGrossAmount.length());
			}
		}
		this.facilityGrossAmount = facilityGrossAmount;
	}
	public String getFacilityGrossAmount()
	{
		return facilityGrossAmount;
	}
	public void setFacilityId(Long facilityId) throws ConstraintVoliationException
	{
		if (null != facilityId)
		{
		}
		this.facilityId = facilityId;
	}
	public Long getFacilityId()
	{
		return facilityId;
	}
	public void setFacilityLevelPurpose(String facilityLevelPurpose) throws ConstraintVoliationException
	{
		if (null != facilityLevelPurpose)
		{
			if (facilityLevelPurpose.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityLevelPurpose.length());
			}
		}
		this.facilityLevelPurpose = facilityLevelPurpose;
	}
	public String getFacilityLevelPurpose()
	{
		return facilityLevelPurpose;
	}
	public void setFacilityLimit(String facilityLimit) throws ConstraintVoliationException
	{
		if (null != facilityLimit)
		{
			if (facilityLimit.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityLimit.length());
			}
		}
		this.facilityLimit = facilityLimit;
	}
	public String getFacilityLimit()
	{
		return facilityLimit;
	}
	public void setFacilityLongTermAmount(String facilityLongTermAmount) throws ConstraintVoliationException
	{
		if (null != facilityLongTermAmount)
		{
			if (facilityLongTermAmount.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityLongTermAmount.length());
			}
		}
		this.facilityLongTermAmount = facilityLongTermAmount;
	}
	public String getFacilityLongTermAmount()
	{
		return facilityLongTermAmount;
	}
	public void setFacilityMediumTermAmount(String facilityMediumTermAmount) throws ConstraintVoliationException
	{
		if (null != facilityMediumTermAmount)
		{
			if (facilityMediumTermAmount.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityMediumTermAmount.length());
			}
		}
		this.facilityMediumTermAmount = facilityMediumTermAmount;
	}
	public String getFacilityMediumTermAmount()
	{
		return facilityMediumTermAmount;
	}
	public void setFacilityProductName(String facilityProductName) throws ConstraintVoliationException
	{
		if (null != facilityProductName)
		{
			if (facilityProductName.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityProductName.length());
			}
		}
		this.facilityProductName = facilityProductName;
	}
	public String getFacilityProductName()
	{
		return facilityProductName;
	}
	public void setFacilitySettlementAmount(String facilitySettlementAmount) throws ConstraintVoliationException
	{
		if (null != facilitySettlementAmount)
		{
			if (facilitySettlementAmount.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilitySettlementAmount.length());
			}
		}
		this.facilitySettlementAmount = facilitySettlementAmount;
	}
	public String getFacilitySettlementAmount()
	{
		return facilitySettlementAmount;
	}
	public void setFacilityShortTermAmount(String facilityShortTermAmount) throws ConstraintVoliationException
	{
		if (null != facilityShortTermAmount)
		{
			if (facilityShortTermAmount.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityShortTermAmount.length());
			}
		}
		this.facilityShortTermAmount = facilityShortTermAmount;
	}
	public String getFacilityShortTermAmount()
	{
		return facilityShortTermAmount;
	}
	public void setFacilityTermInDays(Integer facilityTermInDays) throws ConstraintVoliationException
	{
		if (null != facilityTermInDays)
		{
		}
		this.facilityTermInDays = facilityTermInDays;
	}
	public Integer getFacilityTermInDays()
	{
		return facilityTermInDays;
	}
	public void setFacilityTermInMonths(String facilityTermInMonths) throws ConstraintVoliationException
	{
		if (null != facilityTermInMonths)
		{
			if (facilityTermInMonths.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityTermInMonths.length());
			}
		}
		this.facilityTermInMonths = facilityTermInMonths;
	}
	public String getFacilityTermInMonths()
	{
		return facilityTermInMonths;
	}
	public void setFacilityTermInYears(String facilityTermInYears) throws ConstraintVoliationException
	{
		if (null != facilityTermInYears)
		{
			if (facilityTermInYears.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityTermInYears.length());
			}
		}
		this.facilityTermInYears = facilityTermInYears;
	}
	public String getFacilityTermInYears()
	{
		return facilityTermInYears;
	}
	public void setFacilityType(String facilityType) throws ConstraintVoliationException
	{
		if (null != facilityType)
		{
			if (facilityType.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityType.length());
			}
		}
		this.facilityType = facilityType;
	}
	public String getFacilityType()
	{
		return facilityType;
	}
	public void setMandCapId(Long mandCapId) throws ConstraintVoliationException
	{
		if (null != mandCapId)
		{
		}
		this.mandCapId = mandCapId;
	}
	public Long getMandCapId()
	{
		return mandCapId;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("currentProposedFlag");
		buf.append("='");
		buf.append(currentProposedFlag);
		buf.append("'");

		buf.append("facCcy");
		buf.append("='");
		buf.append(facCcy);
		buf.append("'");

		buf.append("facilityBookingOffice");
		buf.append("='");
		buf.append(facilityBookingOffice);
		buf.append("'");

		buf.append("facilityClientName");
		buf.append("='");
		buf.append(facilityClientName);
		buf.append("'");

		buf.append("facilityExpiryDate");
		buf.append("='");
		buf.append(facilityExpiryDate);
		buf.append("'");

		buf.append("facilityGrossAmount");
		buf.append("='");
		buf.append(facilityGrossAmount);
		buf.append("'");

		buf.append("facilityId");
		buf.append("='");
		buf.append(facilityId);
		buf.append("'");

		buf.append("facilityLevelPurpose");
		buf.append("='");
		buf.append(facilityLevelPurpose);
		buf.append("'");

		buf.append("facilityLimit");
		buf.append("='");
		buf.append(facilityLimit);
		buf.append("'");

		buf.append("facilityLongTermAmount");
		buf.append("='");
		buf.append(facilityLongTermAmount);
		buf.append("'");

		buf.append("facilityMediumTermAmount");
		buf.append("='");
		buf.append(facilityMediumTermAmount);
		buf.append("'");

		buf.append("facilityProductName");
		buf.append("='");
		buf.append(facilityProductName);
		buf.append("'");

		buf.append("facilitySettlementAmount");
		buf.append("='");
		buf.append(facilitySettlementAmount);
		buf.append("'");

		buf.append("facilityShortTermAmount");
		buf.append("='");
		buf.append(facilityShortTermAmount);
		buf.append("'");

		buf.append("facilityTermInDays");
		buf.append("='");
		buf.append(facilityTermInDays);
		buf.append("'");

		buf.append("facilityTermInMonths");
		buf.append("='");
		buf.append(facilityTermInMonths);
		buf.append("'");

		buf.append("facilityTermInYears");
		buf.append("='");
		buf.append(facilityTermInYears);
		buf.append("'");

		buf.append("facilityType");
		buf.append("='");
		buf.append(facilityType);
		buf.append("'");

		buf.append("mandCapId");
		buf.append("='");
		buf.append(mandCapId);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentProposedFlag == null) ? 0 : currentProposedFlag.hashCode());
		result = prime * result + ((facCcy == null) ? 0 : facCcy.hashCode());
		result = prime * result + ((facilityBookingOffice == null) ? 0 : facilityBookingOffice.hashCode());
		result = prime * result + ((facilityClientName == null) ? 0 : facilityClientName.hashCode());
		result = prime * result + ((facilityExpiryDate == null) ? 0 : facilityExpiryDate.hashCode());
		result = prime * result + ((facilityGrossAmount == null) ? 0 : facilityGrossAmount.hashCode());
		result = prime * result + ((facilityId == null) ? 0 : facilityId.hashCode());
		result = prime * result + ((facilityLevelPurpose == null) ? 0 : facilityLevelPurpose.hashCode());
		result = prime * result + ((facilityLimit == null) ? 0 : facilityLimit.hashCode());
		result = prime * result + ((facilityLongTermAmount == null) ? 0 : facilityLongTermAmount.hashCode());
		result = prime * result + ((facilityMediumTermAmount == null) ? 0 : facilityMediumTermAmount.hashCode());
		result = prime * result + ((facilityProductName == null) ? 0 : facilityProductName.hashCode());
		result = prime * result + ((facilitySettlementAmount == null) ? 0 : facilitySettlementAmount.hashCode());
		result = prime * result + ((facilityShortTermAmount == null) ? 0 : facilityShortTermAmount.hashCode());
		result = prime * result + ((facilityTermInDays == null) ? 0 : facilityTermInDays.hashCode());
		result = prime * result + ((facilityTermInMonths == null) ? 0 : facilityTermInMonths.hashCode());
		result = prime * result + ((facilityTermInYears == null) ? 0 : facilityTermInYears.hashCode());
		result = prime * result + ((facilityType == null) ? 0 : facilityType.hashCode());
		result = prime * result + ((mandCapId == null) ? 0 : mandCapId.hashCode());
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
		Facility other = (Facility) obj;
		int comp = 0;
		if (currentProposedFlag == null)
		{
			if (other.currentProposedFlag != null)
				return BEFORE;
		}
		comp = currentProposedFlag.compareTo(other.currentProposedFlag);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facCcy == null)
		{
			if (other.facCcy != null)
				return BEFORE;
		}
		comp = facCcy.compareTo(other.facCcy);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityBookingOffice == null)
		{
			if (other.facilityBookingOffice != null)
				return BEFORE;
		}
		comp = facilityBookingOffice.compareTo(other.facilityBookingOffice);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityClientName == null)
		{
			if (other.facilityClientName != null)
				return BEFORE;
		}
		comp = facilityClientName.compareTo(other.facilityClientName);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityExpiryDate == null)
		{
			if (other.facilityExpiryDate != null)
				return BEFORE;
		}
		comp = facilityExpiryDate.compareTo(other.facilityExpiryDate);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityGrossAmount == null)
		{
			if (other.facilityGrossAmount != null)
				return BEFORE;
		}
		comp = facilityGrossAmount.compareTo(other.facilityGrossAmount);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityId == null)
		{
			if (other.facilityId != null)
				return BEFORE;
		}
		comp = facilityId.compareTo(other.facilityId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityLevelPurpose == null)
		{
			if (other.facilityLevelPurpose != null)
				return BEFORE;
		}
		comp = facilityLevelPurpose.compareTo(other.facilityLevelPurpose);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityLimit == null)
		{
			if (other.facilityLimit != null)
				return BEFORE;
		}
		comp = facilityLimit.compareTo(other.facilityLimit);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityLongTermAmount == null)
		{
			if (other.facilityLongTermAmount != null)
				return BEFORE;
		}
		comp = facilityLongTermAmount.compareTo(other.facilityLongTermAmount);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityMediumTermAmount == null)
		{
			if (other.facilityMediumTermAmount != null)
				return BEFORE;
		}
		comp = facilityMediumTermAmount.compareTo(other.facilityMediumTermAmount);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityProductName == null)
		{
			if (other.facilityProductName != null)
				return BEFORE;
		}
		comp = facilityProductName.compareTo(other.facilityProductName);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilitySettlementAmount == null)
		{
			if (other.facilitySettlementAmount != null)
				return BEFORE;
		}
		comp = facilitySettlementAmount.compareTo(other.facilitySettlementAmount);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityShortTermAmount == null)
		{
			if (other.facilityShortTermAmount != null)
				return BEFORE;
		}
		comp = facilityShortTermAmount.compareTo(other.facilityShortTermAmount);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityTermInDays == null)
		{
			if (other.facilityTermInDays != null)
				return BEFORE;
		}
		comp = facilityTermInDays.compareTo(other.facilityTermInDays);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityTermInMonths == null)
		{
			if (other.facilityTermInMonths != null)
				return BEFORE;
		}
		comp = facilityTermInMonths.compareTo(other.facilityTermInMonths);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityTermInYears == null)
		{
			if (other.facilityTermInYears != null)
				return BEFORE;
		}
		comp = facilityTermInYears.compareTo(other.facilityTermInYears);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityType == null)
		{
			if (other.facilityType != null)
				return BEFORE;
		}
		comp = facilityType.compareTo(other.facilityType);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (mandCapId == null)
		{
			if (other.mandCapId != null)
				return BEFORE;
		}
		comp = mandCapId.compareTo(other.mandCapId);
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
		Facility other = (Facility) obj;
		if (currentProposedFlag == null)
		{
			if (other.currentProposedFlag != null)
				return false;
		}
		else if (!currentProposedFlag.equals(other.currentProposedFlag))
			return false;
		if (facCcy == null)
		{
			if (other.facCcy != null)
				return false;
		}
		else if (!facCcy.equals(other.facCcy))
			return false;
		if (facilityBookingOffice == null)
		{
			if (other.facilityBookingOffice != null)
				return false;
		}
		else if (!facilityBookingOffice.equals(other.facilityBookingOffice))
			return false;
		if (facilityClientName == null)
		{
			if (other.facilityClientName != null)
				return false;
		}
		else if (!facilityClientName.equals(other.facilityClientName))
			return false;
		if (facilityExpiryDate == null)
		{
			if (other.facilityExpiryDate != null)
				return false;
		}
		else if (!facilityExpiryDate.equals(other.facilityExpiryDate))
			return false;
		if (facilityGrossAmount == null)
		{
			if (other.facilityGrossAmount != null)
				return false;
		}
		else if (!facilityGrossAmount.equals(other.facilityGrossAmount))
			return false;
		if (facilityId == null)
		{
			if (other.facilityId != null)
				return false;
		}
		else if (!facilityId.equals(other.facilityId))
			return false;
		if (facilityLevelPurpose == null)
		{
			if (other.facilityLevelPurpose != null)
				return false;
		}
		else if (!facilityLevelPurpose.equals(other.facilityLevelPurpose))
			return false;
		if (facilityLimit == null)
		{
			if (other.facilityLimit != null)
				return false;
		}
		else if (!facilityLimit.equals(other.facilityLimit))
			return false;
		if (facilityLongTermAmount == null)
		{
			if (other.facilityLongTermAmount != null)
				return false;
		}
		else if (!facilityLongTermAmount.equals(other.facilityLongTermAmount))
			return false;
		if (facilityMediumTermAmount == null)
		{
			if (other.facilityMediumTermAmount != null)
				return false;
		}
		else if (!facilityMediumTermAmount.equals(other.facilityMediumTermAmount))
			return false;
		if (facilityProductName == null)
		{
			if (other.facilityProductName != null)
				return false;
		}
		else if (!facilityProductName.equals(other.facilityProductName))
			return false;
		if (facilitySettlementAmount == null)
		{
			if (other.facilitySettlementAmount != null)
				return false;
		}
		else if (!facilitySettlementAmount.equals(other.facilitySettlementAmount))
			return false;
		if (facilityShortTermAmount == null)
		{
			if (other.facilityShortTermAmount != null)
				return false;
		}
		else if (!facilityShortTermAmount.equals(other.facilityShortTermAmount))
			return false;
		if (facilityTermInDays == null)
		{
			if (other.facilityTermInDays != null)
				return false;
		}
		else if (!facilityTermInDays.equals(other.facilityTermInDays))
			return false;
		if (facilityTermInMonths == null)
		{
			if (other.facilityTermInMonths != null)
				return false;
		}
		else if (!facilityTermInMonths.equals(other.facilityTermInMonths))
			return false;
		if (facilityTermInYears == null)
		{
			if (other.facilityTermInYears != null)
				return false;
		}
		else if (!facilityTermInYears.equals(other.facilityTermInYears))
			return false;
		if (facilityType == null)
		{
			if (other.facilityType != null)
				return false;
		}
		else if (!facilityType.equals(other.facilityType))
			return false;
		if (mandCapId == null)
		{
			if (other.mandCapId != null)
				return false;
		}
		else if (!mandCapId.equals(other.mandCapId))
			return false;
		return super.equals(obj);
	}


}

