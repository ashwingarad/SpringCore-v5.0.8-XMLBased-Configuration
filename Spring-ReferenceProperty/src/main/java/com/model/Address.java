package com.model;

/**
 * @author Ashwin
 *
 */
public class Address {
	private String street;
	private String area;
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void displayAddress() {
		System.out.println("---- Address -----");
		System.out.println("Street: " + this.getStreet() + "\nArea: " + this.getArea() + "\nCity: " + this.getCity());

	}

}
