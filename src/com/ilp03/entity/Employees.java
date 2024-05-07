package com.ilp03.entity;

public class Employees {

	private String empId;
	private String empFirstName;
	private String empLastName;
	private String email;
	private String sex;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Employees(String empId, String empFirstName, String empLastName, String email, String sex) {

		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.email = email;
		this.sex = sex;
	}

}
