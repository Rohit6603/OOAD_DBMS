package com.ilp03.entity;

import java.util.Date;

public class Assets {

	private String assetId;
	private String assetName;
	private String assetDescription;
	private String assetType;
	private Date purchaseDate;
	private float purchasePrice;
	private Employees employeesCreatedBy;
	private Employees employeesUpdatedBy;
	private Date createdOn;
	private Date updatedOn;
	private Locations locationsId;
	private Statuses statusesId;

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetDescription() {
		return assetDescription;
	}

	public void setAssetDescription(String assetDescription) {
		this.assetDescription = assetDescription;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public float getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Employees getEmployeesCreatedBy() {
		return employeesCreatedBy;
	}

	public void setEmployeesCreatedBy(Employees employeesCreatedBy) {
		this.employeesCreatedBy = employeesCreatedBy;
	}

	public Employees getEmployeesUpdatedBy() {
		return employeesUpdatedBy;
	}

	public void setEmployeesUpdatedBy(Employees employeesUpdatedBy) {
		this.employeesUpdatedBy = employeesUpdatedBy;
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

	public Locations getLocationsId() {
		return locationsId;
	}

	public void setLocationsId(Locations locationsId) {
		this.locationsId = locationsId;
	}

	public Statuses getStatusesId() {
		return statusesId;
	}

	public void setStatusesId(Statuses statusesId) {
		this.statusesId = statusesId;
	}

	public Assets(String assetId, String assetName, String assetDescription, String assetType, Date purchaseDate,
			float purchasePrice, Employees employeesCreatedBy, Employees employeesUpdatedBy, Date createdOn,
			Date updatedOn, Locations locationsId, Statuses statusesId) {

		this.assetId = assetId;
		this.assetName = assetName;
		this.assetDescription = assetDescription;
		this.assetType = assetType;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.employeesCreatedBy = employeesCreatedBy;
		this.employeesUpdatedBy = employeesUpdatedBy;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.locationsId = locationsId;
		this.statusesId = statusesId;
	}

}