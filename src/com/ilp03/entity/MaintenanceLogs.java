package com.ilp03.entity;

import java.util.Date;

public class MaintenanceLogs {

	private String logId;
	private Assets assetId;
	private Date maintenanceDate;
	private String maintenanceDescription;
	private float maintenanceCost;
	private Employees createdBy;
	private Employees updatedBy;
	private Date createdOn;
	private Date updatedOn;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public Assets getAssetId() {
		return assetId;
	}

	public void setAssetId(Assets assetId) {
		this.assetId = assetId;
	}

	public Date getMaintenanceDate() {
		return maintenanceDate;
	}

	public void setMaintenanceDate(Date maintenanceDate) {
		this.maintenanceDate = maintenanceDate;
	}

	public String getMaintenanceDescription() {
		return maintenanceDescription;
	}

	public void setMaintenanceDescription(String maintenanceDescription) {
		this.maintenanceDescription = maintenanceDescription;
	}

	public float getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(float maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public Employees getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Employees createdBy) {
		this.createdBy = createdBy;
	}

	public Employees getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Employees updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public MaintenanceLogs(String logId, Assets assetId, Date maintenanceDate, String maintenanceDescription,
			float maintenanceCost, Employees createdBy, Employees updatedBy, Date createdOn, Date updatedOn) {

		this.logId = logId;
		this.assetId = assetId;
		this.maintenanceDate = maintenanceDate;
		this.maintenanceDescription = maintenanceDescription;
		this.maintenanceCost = maintenanceCost;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

}
