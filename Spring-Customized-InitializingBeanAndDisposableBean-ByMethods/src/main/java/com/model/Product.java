package com.model;

/**
 * @author Ashwin
 *
 */
public class Product {
	private int pid;
	private String pname;
	private int price;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void display() {
		System.out.println("\n\n------ Product Information -------");
		System.out.println("ID : " + this.getPid() + "\tName : " + this.getPname() + "\tPrice : " + this.getPrice());
	}

	public void afterInitialBean() throws Exception {
		System.out.println("\n\n-------- User defined afterInitialBean method called ---------");

		System.out.println("Old properties are");
		this.display();

		System.out.print("\nSetting up new properties..");
		for (int i = 0; i < 8; i++) {
			System.out.print(".");
			Thread.sleep(700);
		}
		this.setPname("Peter England");
		this.setPrice(2500);
	}

	public void tearDown() throws Exception {
		System.out.println("\n-------- User Defined tearDown method called ---------");
	}
}
