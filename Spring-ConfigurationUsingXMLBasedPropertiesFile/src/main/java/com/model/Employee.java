/**
 * 
 */
package com.model;

/**
 * @author Ashwin
 *
 */
public class Employee {
	private String ename;
	private String salary;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("\n------- Employee Information -------");
		System.out.println("Name: " + this.ename + "\tSalary: " + this.salary);
	}
}
