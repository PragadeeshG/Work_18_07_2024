package com.test1;

public class RegulatoryComplianceMakerCheckers {
	private Integer regulatoryComplianceCode;
	private Integer groupCode;
	private Integer sequenceId;
	private String roleId;
	private String groupName;
	private Integer makerCheckerTypeCode;
	private String makerCheckerType;
	private String makerCheckerTypeDesc;
	private String subdivisionInstrumentalitiesDesc;
	private String subdivisionInstrumentalities;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RegulatoryComplianceMakerCheckers() {

	}

	public RegulatoryComplianceMakerCheckers(Integer regulatoryComplianceCode, Integer groupCode, Integer sequenceId,
			String roleId, String groupName, Integer makerCheckerTypeCode, String makerCheckerType,
			String makerCheckerTypeDesc, String subdivisionInstrumentalitiesDesc, String subdivisionInstrumentalities,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.regulatoryComplianceCode = regulatoryComplianceCode;
		this.groupCode = groupCode;
		this.sequenceId = sequenceId;
		this.roleId = roleId;
		this.groupName = groupName;
		this.makerCheckerTypeCode = makerCheckerTypeCode;
		this.makerCheckerType = makerCheckerType;
		this.makerCheckerTypeDesc = makerCheckerTypeDesc;
		this.subdivisionInstrumentalitiesDesc = subdivisionInstrumentalitiesDesc;
		this.subdivisionInstrumentalities = subdivisionInstrumentalities;
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

	public Integer getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(Integer groupCode) {
		this.groupCode = groupCode;
	}

	public Integer getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getMakerCheckerTypeCode() {
		return makerCheckerTypeCode;
	}

	public void setMakerCheckerTypeCode(Integer makerCheckerTypeCode) {
		this.makerCheckerTypeCode = makerCheckerTypeCode;
	}

	public String getMakerCheckerType() {
		return makerCheckerType;
	}

	public void setMakerCheckerType(String makerCheckerType) {
		this.makerCheckerType = makerCheckerType;
	}

	public String getMakerCheckerTypeDesc() {
		return makerCheckerTypeDesc;
	}

	public void setMakerCheckerTypeDesc(String makerCheckerTypeDesc) {
		this.makerCheckerTypeDesc = makerCheckerTypeDesc;
	}

	public String getSubdivisionInstrumentalitiesDesc() {
		return subdivisionInstrumentalitiesDesc;
	}

	public void setSubdivisionInstrumentalitiesDesc(String subdivisionInstrumentalitiesDesc) {
		this.subdivisionInstrumentalitiesDesc = subdivisionInstrumentalitiesDesc;
	}

	public String getSubdivisionInstrumentalities() {
		return subdivisionInstrumentalities;
	}

	public void setSubdivisionInstrumentalities(String subdivisionInstrumentalities) {
		this.subdivisionInstrumentalities = subdivisionInstrumentalities;
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
