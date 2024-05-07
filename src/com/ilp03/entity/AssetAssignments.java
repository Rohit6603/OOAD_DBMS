package com.ilp03.entity;

import java.util.Date;

public class AssetAssignments {

	private String assignmentId;
	private Assets assetId;
	private Employees employeesAssignedTo;
	private Date assignedDate;
	private Date returnDate;
	private Employees employeesCreatedBy;
	private Employees employeesUpdatedBy;
	private Date createdOn;
	private Date updatedOn;

	public String getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}

	public Assets getAssetId() {
		return assetId;
	}

	public void setAssetId(Assets assetId) {
		this.assetId = assetId;
	}

	public Employees getEmployeesAssignedTo() {
		return employeesAssignedTo;
	}

	public void setEmployeesAssignedTo(Employees employeesAssignedTo) {
		this.employeesAssignedTo = employeesAssignedTo;
	}

	public Date getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
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

	public AssetAssignments(String assignmentId, Assets assetId, Employees employeesAssignedTo, Date assignedDate,
			Date returnDate, Employees employeesCreatedBy, Employees employeesUpdatedBy, Date createdOn,
			Date updatedOn) {

		this.assignmentId = assignmentId;
		this.assetId = assetId;
		this.employeesAssignedTo = employeesAssignedTo;
		this.assignedDate = assignedDate;
		this.returnDate = returnDate;
		this.employeesCreatedBy = employeesCreatedBy;
		this.employeesUpdatedBy = employeesUpdatedBy;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

}
