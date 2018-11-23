package com.model;

public class Employee {
	private int id;
	private String name;
	private long salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void displayEmployee() {
		System.out.println("Id " + this.getId() + "\t Name " + this.getName() + "\tSalary " + this.getSalary());
	}

	public static class Address {
		private String street;
		private int pincode;

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
		}

		public void displayAddr() {
			System.out.println("Street : " + this.getStreet() + "\tPincode : " + this.getPincode());
		}

	}
}
