package com.tere.finance.risk.riskengine.model.referencedata;


import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
import com.tere.finance.risk.riskengine.model.exceptions.ManditoryElementNotSpecifiedException;
public  class Agreement implements Comparable, Serializable
{
	public static String AGREEMENTID_PROPERTY = "Agreement.agreementId.property";
	public static String AGREEMENTTYPEDESCRIPTION_PROPERTY = "Agreement.agreementTypeDescription.property";
	public static String AGREEMENTTYPENAME_PROPERTY = "Agreement.agreementTypeName.property";
	public static String MASTERSUPPLIMENTARY_PROPERTY = "Agreement.masterSupplimentary.property";
	public static String PRODUCTID_PROPERTY = "Agreement.productId.property";
	public static String TRADENETID_PROPERTY = "Agreement.tradeNetId.property";
	public static String ENTITYA_PROPERTY = "Agreement.entityA.property";
	public static String ENTITYB_PROPERTY = "Agreement.entityB.property";
	protected Long agreementId; 
	protected String agreementTypeDescription; 
	protected String agreementTypeName; 
	protected String masterSupplimentary; 
	protected Long productId; 
	protected String tradeNetId; 
	protected Counterparty entityA; 
	protected Counterparty entityB; 

	public Agreement()
	{
	}
	
	public Agreement(Long agreementId, String agreementTypeDescription, String agreementTypeName, String masterSupplimentary, Long productId, String tradeNetId, com.tere.finance.risk.riskengine.model.referencedata.Counterparty entityA, com.tere.finance.risk.riskengine.model.referencedata.Counterparty entityB) throws ConstraintVoliationException
	{
		this.agreementId = agreementId;
		this.agreementTypeDescription = agreementTypeDescription;
		this.agreementTypeName = agreementTypeName;
		this.masterSupplimentary = masterSupplimentary;
		this.productId = productId;
		this.tradeNetId = tradeNetId;
		this.entityA = entityA;
		this.entityB = entityB;
	}

	public void setAgreementId(Long agreementId) throws ConstraintVoliationException
	{
		if (null != agreementId)
		{
		}
		this.agreementId = agreementId;
	}
	public Long getAgreementId()
	{
		return agreementId;
	}
	public void setAgreementTypeDescription(String agreementTypeDescription) throws ConstraintVoliationException
	{
		if (null != agreementTypeDescription)
		{
			if (agreementTypeDescription.length() > 10000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 10000, agreementTypeDescription.length());
			}
		}
		this.agreementTypeDescription = agreementTypeDescription;
	}
	public String getAgreementTypeDescription()
	{
		return agreementTypeDescription;
	}
	public void setAgreementTypeName(String agreementTypeName) throws ConstraintVoliationException
	{
		if (null != agreementTypeName)
		{
			if (agreementTypeName.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, agreementTypeName.length());
			}
		}
		this.agreementTypeName = agreementTypeName;
	}
	public String getAgreementTypeName()
	{
		return agreementTypeName;
	}
	public void setMasterSupplimentary(String masterSupplimentary) throws ConstraintVoliationException
	{
		if (null != masterSupplimentary)
		{
			if (masterSupplimentary.length() > 10000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 10000, masterSupplimentary.length());
			}
		}
		this.masterSupplimentary = masterSupplimentary;
	}
	public String getMasterSupplimentary()
	{
		return masterSupplimentary;
	}
	public void setProductId(Long productId) throws ConstraintVoliationException
	{
		if (null != productId)
		{
		}
		this.productId = productId;
	}
	public Long getProductId()
	{
		return productId;
	}
	public void setTradeNetId(String tradeNetId) throws ConstraintVoliationException
	{
		if (null != tradeNetId)
		{
			if (tradeNetId.length() > 20)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 20, tradeNetId.length());
			}
		}
		this.tradeNetId = tradeNetId;
	}
	public String getTradeNetId()
	{
		return tradeNetId;
	}
	public void setEntityA(Counterparty entityA) throws ConstraintVoliationException
	{
		if (null == entityA)
		{
			throw new ManditoryElementNotSpecifiedException("$classReflect.getLabelName($param)");
		}
		this.entityA = entityA;
	}
	public Counterparty getEntityA()
	{
		return entityA;
	}
	public void setEntityB(Counterparty entityB) throws ConstraintVoliationException
	{
		if (null == entityB)
		{
			throw new ManditoryElementNotSpecifiedException("$classReflect.getLabelName($param)");
		}
		this.entityB = entityB;
	}
	public Counterparty getEntityB()
	{
		return entityB;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("agreementId");
		buf.append("='");
		buf.append(agreementId);
		buf.append("'");

		buf.append("agreementTypeDescription");
		buf.append("='");
		buf.append(agreementTypeDescription);
		buf.append("'");

		buf.append("agreementTypeName");
		buf.append("='");
		buf.append(agreementTypeName);
		buf.append("'");

		buf.append("masterSupplimentary");
		buf.append("='");
		buf.append(masterSupplimentary);
		buf.append("'");

		buf.append("productId");
		buf.append("='");
		buf.append(productId);
		buf.append("'");

		buf.append("tradeNetId");
		buf.append("='");
		buf.append(tradeNetId);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agreementId == null) ? 0 : agreementId.hashCode());
		result = prime * result + ((agreementTypeDescription == null) ? 0 : agreementTypeDescription.hashCode());
		result = prime * result + ((agreementTypeName == null) ? 0 : agreementTypeName.hashCode());
		result = prime * result + ((masterSupplimentary == null) ? 0 : masterSupplimentary.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((tradeNetId == null) ? 0 : tradeNetId.hashCode());
		result = prime * result + ((entityA == null) ? 0 : entityA.hashCode());
		result = prime * result + ((entityB == null) ? 0 : entityB.hashCode());
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
		Agreement other = (Agreement) obj;
		int comp = 0;
		if (agreementId == null)
		{
			if (other.agreementId != null)
				return BEFORE;
		}
		comp = agreementId.compareTo(other.agreementId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (agreementTypeDescription == null)
		{
			if (other.agreementTypeDescription != null)
				return BEFORE;
		}
		comp = agreementTypeDescription.compareTo(other.agreementTypeDescription);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (agreementTypeName == null)
		{
			if (other.agreementTypeName != null)
				return BEFORE;
		}
		comp = agreementTypeName.compareTo(other.agreementTypeName);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (masterSupplimentary == null)
		{
			if (other.masterSupplimentary != null)
				return BEFORE;
		}
		comp = masterSupplimentary.compareTo(other.masterSupplimentary);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (productId == null)
		{
			if (other.productId != null)
				return BEFORE;
		}
		comp = productId.compareTo(other.productId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (tradeNetId == null)
		{
			if (other.tradeNetId != null)
				return BEFORE;
		}
		comp = tradeNetId.compareTo(other.tradeNetId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (entityA == null)
		{
			if (other.entityA != null)
				return BEFORE;
		}
		comp = entityA.compareTo(other.entityA);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (entityB == null)
		{
			if (other.entityB != null)
				return BEFORE;
		}
		comp = entityB.compareTo(other.entityB);
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
		Agreement other = (Agreement) obj;
		if (agreementId == null)
		{
			if (other.agreementId != null)
				return false;
		}
		else if (!agreementId.equals(other.agreementId))
			return false;
		if (agreementTypeDescription == null)
		{
			if (other.agreementTypeDescription != null)
				return false;
		}
		else if (!agreementTypeDescription.equals(other.agreementTypeDescription))
			return false;
		if (agreementTypeName == null)
		{
			if (other.agreementTypeName != null)
				return false;
		}
		else if (!agreementTypeName.equals(other.agreementTypeName))
			return false;
		if (masterSupplimentary == null)
		{
			if (other.masterSupplimentary != null)
				return false;
		}
		else if (!masterSupplimentary.equals(other.masterSupplimentary))
			return false;
		if (productId == null)
		{
			if (other.productId != null)
				return false;
		}
		else if (!productId.equals(other.productId))
			return false;
		if (tradeNetId == null)
		{
			if (other.tradeNetId != null)
				return false;
		}
		else if (!tradeNetId.equals(other.tradeNetId))
			return false;
		if (entityA == null)
		{
			if (other.entityA != null)
				return false;
		}
		else if (!entityA.equals(other.entityA))
			return false;
		if (entityB == null)
		{
			if (other.entityB != null)
				return false;
		}
		else if (!entityB.equals(other.entityB))
			return false;
		return super.equals(obj);
	}


}

