package com.test1;

public class RegulatoryComplianceOrigin {
	private Integer regulatoryComplianceCode;
	private Integer dataCustodianId;
	private Integer excemptCodeId;
	private String ExcemptionApplicable;
	private Integer businessIndicator;
	private boolean userCode;
	private boolean countryCode;
	private String unitName;
	private String custodialAccountMappingId;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RegulatoryComplianceOrigin() {

	}

	public RegulatoryComplianceOrigin(Integer regulatoryComplianceCode, Integer dataCustodianId, Integer excemptCodeId,
			String excemptionApplicable, Integer businessIndicator, boolean userCode, boolean countryCode,
			String unitName, String custodialAccountMappingId, String creationCr, String modifiedCr,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.regulatoryComplianceCode = regulatoryComplianceCode;
		this.dataCustodianId = dataCustodianId;
		this.excemptCodeId = excemptCodeId;
		ExcemptionApplicable = excemptionApplicable;
		this.businessIndicator = businessIndicator;
		this.userCode = userCode;
		this.countryCode = countryCode;
		this.unitName = unitName;
		this.custodialAccountMappingId = custodialAccountMappingId;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRegulatoryComplianceCode() {
		return regulatoryComplianceCode;
	}

	public void setRegulatoryComplianceCode(Integer regulatoryComplianceCode) {
		this.regulatoryComplianceCode = regulatoryComplianceCode;
	}

	public Integer getDataCustodianId() {
		return dataCustodianId;
	}

	public void setDataCustodianId(Integer dataCustodianId) {
		this.dataCustodianId = dataCustodianId;
	}

	public Integer getExcemptCodeId() {
		return excemptCodeId;
	}

	public void setExcemptCodeId(Integer excemptCodeId) {
		this.excemptCodeId = excemptCodeId;
	}

	public String getExcemptionApplicable() {
		return ExcemptionApplicable;
	}

	public void setExcemptionApplicable(String excemptionApplicable) {
		ExcemptionApplicable = excemptionApplicable;
	}

	public Integer getBusinessIndicator() {
		return businessIndicator;
	}

	public void setBusinessIndicator(Integer businessIndicator) {
		this.businessIndicator = businessIndicator;
	}

	public boolean isUserCode() {
		return userCode;
	}

	public void setUserCode(boolean userCode) {
		this.userCode = userCode;
	}

	public boolean isCountryCode() {
		return countryCode;
	}

	public void setCountryCode(boolean countryCode) {
		this.countryCode = countryCode;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getCustodialAccountMappingId() {
		return custodialAccountMappingId;
	}

	public void setCustodialAccountMappingId(String custodialAccountMappingId) {
		this.custodialAccountMappingId = custodialAccountMappingId;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
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
