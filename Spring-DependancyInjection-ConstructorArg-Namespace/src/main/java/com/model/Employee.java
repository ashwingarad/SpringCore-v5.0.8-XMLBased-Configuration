package com.model;

/**
 * @author Ashwin
 *
 */
public class Employee {
	private int emp_id;
	private String emp_name;
	private float emp_salary;

	public Employee(int emp_id, String emp_name, float emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

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

	public void display() {
		System.out.println("--- Employee details ---");
		System.out.println("ID: " + this.getEmp_id());
		System.out.println("Name: " + this.getEmp_name());
		System.out.println("Salary: " + this.getEmp_salary());
	}

}
