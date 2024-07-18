package com.test1;

public class RegulatoryCompliance {
	private Integer regualtoryComplianceCode;
	private Integer custodialAccountEffective;
	private String custodialAccountEffectiveDate;
	private String custodialAccountregulatoryComplianceDesc;
	private String custodialAccountregulatoryComplianceShortDesc;
	private Integer cutodialAccountDecimalPositions;
	private String custodialAccountregulatoryComplianceSymbol;
	private String custodialAccountregulatoryComplianceScale;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RegulatoryCompliance() {

	}

	public RegulatoryCompliance(Integer regualtoryComplianceCode, Integer custodialAccountEffective,
			String custodialAccountEffectiveDate, String custodialAccountregulatoryComplianceDesc,
			String custodialAccountregulatoryComplianceShortDesc, Integer cutodialAccountDecimalPositions,
			String custodialAccountregulatoryComplianceSymbol, String custodialAccountregulatoryComplianceScale,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.regualtoryComplianceCode = regualtoryComplianceCode;
		this.custodialAccountEffective = custodialAccountEffective;
		this.custodialAccountEffectiveDate = custodialAccountEffectiveDate;
		this.custodialAccountregulatoryComplianceDesc = custodialAccountregulatoryComplianceDesc;
		this.custodialAccountregulatoryComplianceShortDesc = custodialAccountregulatoryComplianceShortDesc;
		this.cutodialAccountDecimalPositions = cutodialAccountDecimalPositions;
		this.custodialAccountregulatoryComplianceSymbol = custodialAccountregulatoryComplianceSymbol;
		this.custodialAccountregulatoryComplianceScale = custodialAccountregulatoryComplianceScale;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRegualtoryComplianceCode() {
		return regualtoryComplianceCode;
	}

	public void setRegualtoryComplianceCode(Integer regualtoryComplianceCode) {
		this.regualtoryComplianceCode = regualtoryComplianceCode;
	}

	public Integer getCustodialAccountEffective() {
		return custodialAccountEffective;
	}

	public void setCustodialAccountEffective(Integer custodialAccountEffective) {
		this.custodialAccountEffective = custodialAccountEffective;
	}

	public String getCustodialAccountEffectiveDate() {
		return custodialAccountEffectiveDate;
	}

	public void setCustodialAccountEffectiveDate(String custodialAccountEffectiveDate) {
		this.custodialAccountEffectiveDate = custodialAccountEffectiveDate;
	}

	public String getCustodialAccountregulatoryComplianceDesc() {
		return custodialAccountregulatoryComplianceDesc;
	}

	public void setCustodialAccountregulatoryComplianceDesc(String custodialAccountregulatoryComplianceDesc) {
		this.custodialAccountregulatoryComplianceDesc = custodialAccountregulatoryComplianceDesc;
	}

	public String getCustodialAccountregulatoryComplianceShortDesc() {
		return custodialAccountregulatoryComplianceShortDesc;
	}

	public void setCustodialAccountregulatoryComplianceShortDesc(String custodialAccountregulatoryComplianceShortDesc) {
		this.custodialAccountregulatoryComplianceShortDesc = custodialAccountregulatoryComplianceShortDesc;
	}

	public Integer getCutodialAccountDecimalPositions() {
		return cutodialAccountDecimalPositions;
	}

	public void setCutodialAccountDecimalPositions(Integer cutodialAccountDecimalPositions) {
		this.cutodialAccountDecimalPositions = cutodialAccountDecimalPositions;
	}

	public String getCustodialAccountregulatoryComplianceSymbol() {
		return custodialAccountregulatoryComplianceSymbol;
	}

	public void setCustodialAccountregulatoryComplianceSymbol(String custodialAccountregulatoryComplianceSymbol) {
		this.custodialAccountregulatoryComplianceSymbol = custodialAccountregulatoryComplianceSymbol;
	}

	public String getCustodialAccountregulatoryComplianceScale() {
		return custodialAccountregulatoryComplianceScale;
	}

	public void setCustodialAccountregulatoryComplianceScale(String custodialAccountregulatoryComplianceScale) {
		this.custodialAccountregulatoryComplianceScale = custodialAccountregulatoryComplianceScale;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
