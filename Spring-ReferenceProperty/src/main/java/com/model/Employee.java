package com.model;

/**
 * @author Ashwin
 *
 */
public class Employee {
	private int emp_id;
	private String emp_name;
	private float emp_salary;

	private Address address;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public float getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(float emp_salary) {
		this.emp_salary = emp_salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayEmployee() {
		System.out.println("---- Employee information -----");
		System.out.println(
				"ID: " + this.getEmp_id() + "\tName: " + this.getEmp_name() + "\tSalary: " + this.getEmp_salary());
	}
}
