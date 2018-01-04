package com.tere.finance.risk.riskengine.model.referencedata;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
public  class NettingSet implements Comparable, Serializable
{
	public static String CROSSA_PROPERTY = "NettingSet.crossA.property";
	public static String CROSSB_PROPERTY = "NettingSet.crossB.property";
	public static String CROSSPRODUCT_PROPERTY = "NettingSet.crossProduct.property";
	public static String NETTING_PROPERTY = "NettingSet.netting.property";
	public static String NETTINGSETID_PROPERTY = "NettingSet.nettingSetId.property";
	public static String NETTINGTYPE_PROPERTY = "NettingSet.nettingType.property";
	public static String PRODUCTID_PROPERTY = "NettingSet.productId.property";
	public static String TRADENETID_PROPERTY = "NettingSet.tradeNetId.property";
	public static String BRANCHA_PROPERTY = "NettingSet.branchA.property";
	public static String BRANCHB_PROPERTY = "NettingSet.branchB.property";
	public static String AGREEMENTID_PROPERTY = "NettingSet.agreementId.property";
	public static String NETTINGID_PROPERTY = "NettingSet.nettingId.property";
	protected Boolean crossA; 
	protected Boolean crossB; 
	protected String crossProduct; 
	protected Long netting; 
	protected Long nettingSetId; 
	protected String nettingType; 
	protected Long productId; 
	protected Long tradeNetId; 
	protected Long branchA; 
	protected Long branchB; 
	protected Long agreementId; 
	protected Long nettingId; 

	public NettingSet()
	{
	}
	
	public NettingSet(Boolean crossA, Boolean crossB, String crossProduct, Long netting, Long nettingSetId, String nettingType, Long productId, Long tradeNetId, Long branchA, Long branchB, Long agreementId, Long nettingId) throws ConstraintVoliationException
	{
		this.crossA = crossA;
		this.crossB = crossB;
		this.crossProduct = crossProduct;
		this.netting = netting;
		this.nettingSetId = nettingSetId;
		this.nettingType = nettingType;
		this.productId = productId;
		this.tradeNetId = tradeNetId;
		this.branchA = branchA;
		this.branchB = branchB;
		this.agreementId = agreementId;
		this.nettingId = nettingId;
	}

	public void setCrossA(Boolean crossA) throws ConstraintVoliationException
	{
		if (null != crossA)
		{
		}
		this.crossA = crossA;
	}
	public Boolean getCrossA()
	{
		return crossA;
	}
	public void setCrossB(Boolean crossB) throws ConstraintVoliationException
	{
		if (null != crossB)
		{
		}
		this.crossB = crossB;
	}
	public Boolean getCrossB()
	{
		return crossB;
	}
	public void setCrossProduct(String crossProduct) throws ConstraintVoliationException
	{
		if (null != crossProduct)
		{
			if (crossProduct.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, crossProduct.length());
			}
		}
		this.crossProduct = crossProduct;
	}
	public String getCrossProduct()
	{
		return crossProduct;
	}
	public void setNetting(Long netting) throws ConstraintVoliationException
	{
		if (null != netting)
		{
		}
		this.netting = netting;
	}
	public Long getNetting()
	{
		return netting;
	}
	public void setNettingSetId(Long nettingSetId) throws ConstraintVoliationException
	{
		if (null != nettingSetId)
		{
		}
		this.nettingSetId = nettingSetId;
	}
	public Long getNettingSetId()
	{
		return nettingSetId;
	}
	public void setNettingType(String nettingType) throws ConstraintVoliationException
	{
		if (null != nettingType)
		{
			if (nettingType.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, nettingType.length());
			}
		}
		this.nettingType = nettingType;
	}
	public String getNettingType()
	{
		return nettingType;
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
	public void setTradeNetId(Long tradeNetId) throws ConstraintVoliationException
	{
		if (null != tradeNetId)
		{
		}
		this.tradeNetId = tradeNetId;
	}
	public Long getTradeNetId()
	{
		return tradeNetId;
	}
	public void setBranchA(Long branchA) throws ConstraintVoliationException
	{
		if (null != branchA)
		{
		}
		this.branchA = branchA;
	}
	public Long getBranchA()
	{
		return branchA;
	}
	public void setBranchB(Long branchB) throws ConstraintVoliationException
	{
		if (null != branchB)
		{
		}
		this.branchB = branchB;
	}
	public Long getBranchB()
	{
		return branchB;
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
	public void setNettingId(Long nettingId) throws ConstraintVoliationException
	{
		if (null != nettingId)
		{
		}
		this.nettingId = nettingId;
	}
	public Long getNettingId()
	{
		return nettingId;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("crossA");
		buf.append("='");
		buf.append(crossA);
		buf.append("'");

		buf.append("crossB");
		buf.append("='");
		buf.append(crossB);
		buf.append("'");

		buf.append("crossProduct");
		buf.append("='");
		buf.append(crossProduct);
		buf.append("'");

		buf.append("netting");
		buf.append("='");
		buf.append(netting);
		buf.append("'");

		buf.append("nettingSetId");
		buf.append("='");
		buf.append(nettingSetId);
		buf.append("'");

		buf.append("nettingType");
		buf.append("='");
		buf.append(nettingType);
		buf.append("'");

		buf.append("productId");
		buf.append("='");
		buf.append(productId);
		buf.append("'");

		buf.append("tradeNetId");
		buf.append("='");
		buf.append(tradeNetId);
		buf.append("'");

		buf.append("branchA");
		buf.append("='");
		buf.append(branchA);
		buf.append("'");

		buf.append("branchB");
		buf.append("='");
		buf.append(branchB);
		buf.append("'");

		buf.append("agreementId");
		buf.append("='");
		buf.append(agreementId);
		buf.append("'");

		buf.append("nettingId");
		buf.append("='");
		buf.append(nettingId);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crossA == null) ? 0 : crossA.hashCode());
		result = prime * result + ((crossB == null) ? 0 : crossB.hashCode());
		result = prime * result + ((crossProduct == null) ? 0 : crossProduct.hashCode());
		result = prime * result + ((netting == null) ? 0 : netting.hashCode());
		result = prime * result + ((nettingSetId == null) ? 0 : nettingSetId.hashCode());
		result = prime * result + ((nettingType == null) ? 0 : nettingType.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((tradeNetId == null) ? 0 : tradeNetId.hashCode());
		result = prime * result + ((branchA == null) ? 0 : branchA.hashCode());
		result = prime * result + ((branchB == null) ? 0 : branchB.hashCode());
		result = prime * result + ((agreementId == null) ? 0 : agreementId.hashCode());
		result = prime * result + ((nettingId == null) ? 0 : nettingId.hashCode());
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
		NettingSet other = (NettingSet) obj;
		int comp = 0;
		if (crossA == null)
		{
			if (other.crossA != null)
				return BEFORE;
		}
		comp = crossA.compareTo(other.crossA);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (crossB == null)
		{
			if (other.crossB != null)
				return BEFORE;
		}
		comp = crossB.compareTo(other.crossB);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (crossProduct == null)
		{
			if (other.crossProduct != null)
				return BEFORE;
		}
		comp = crossProduct.compareTo(other.crossProduct);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (netting == null)
		{
			if (other.netting != null)
				return BEFORE;
		}
		comp = netting.compareTo(other.netting);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (nettingSetId == null)
		{
			if (other.nettingSetId != null)
				return BEFORE;
		}
		comp = nettingSetId.compareTo(other.nettingSetId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (nettingType == null)
		{
			if (other.nettingType != null)
				return BEFORE;
		}
		comp = nettingType.compareTo(other.nettingType);
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
		if (branchA == null)
		{
			if (other.branchA != null)
				return BEFORE;
		}
		comp = branchA.compareTo(other.branchA);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (branchB == null)
		{
			if (other.branchB != null)
				return BEFORE;
		}
		comp = branchB.compareTo(other.branchB);
		if (EQUAL != comp)
		{
			return comp;
		}
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
		if (nettingId == null)
		{
			if (other.nettingId != null)
				return BEFORE;
		}
		comp = nettingId.compareTo(other.nettingId);
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
		NettingSet other = (NettingSet) obj;
		if (crossA == null)
		{
			if (other.crossA != null)
				return false;
		}
		else if (!crossA.equals(other.crossA))
			return false;
		if (crossB == null)
		{
			if (other.crossB != null)
				return false;
		}
		else if (!crossB.equals(other.crossB))
			return false;
		if (crossProduct == null)
		{
			if (other.crossProduct != null)
				return false;
		}
		else if (!crossProduct.equals(other.crossProduct))
			return false;
		if (netting == null)
		{
			if (other.netting != null)
				return false;
		}
		else if (!netting.equals(other.netting))
			return false;
		if (nettingSetId == null)
		{
			if (other.nettingSetId != null)
				return false;
		}
		else if (!nettingSetId.equals(other.nettingSetId))
			return false;
		if (nettingType == null)
		{
			if (other.nettingType != null)
				return false;
		}
		else if (!nettingType.equals(other.nettingType))
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
		if (branchA == null)
		{
			if (other.branchA != null)
				return false;
		}
		else if (!branchA.equals(other.branchA))
			return false;
		if (branchB == null)
		{
			if (other.branchB != null)
				return false;
		}
		else if (!branchB.equals(other.branchB))
			return false;
		if (agreementId == null)
		{
			if (other.agreementId != null)
				return false;
		}
		else if (!agreementId.equals(other.agreementId))
			return false;
		if (nettingId == null)
		{
			if (other.nettingId != null)
				return false;
		}
		else if (!nettingId.equals(other.nettingId))
			return false;
		return super.equals(obj);
	}


}

