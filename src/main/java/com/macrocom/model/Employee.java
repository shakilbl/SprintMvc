package com.macrocom.model;
// Generated Sep 16, 2021 9:45:39 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Employee generated by hbm2java
 */
public class Employee implements java.io.Serializable {

	private int id;
	private Department department;
	private String name;

	public Employee() {
	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(int id, Department department, String name) {
		this.id = id;
		this.department = department;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
