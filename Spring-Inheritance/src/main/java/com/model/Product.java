package com.model;

/**
 * @author Ashwin
 *
 */
public class Product {
	private int pid;
	private String pname;
	private int price;
	private String dist_name;
	private String GST_No;

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

	public String getDist_name() {
		return dist_name;
	}

	public void setDist_name(String dist_name) {
		this.dist_name = dist_name;
	}

	public String getGST_No() {
		return GST_No;
	}

	public void setGST_No(String gST_No) {
		GST_No = gST_No;
	}

	public void displayProduct() {
		System.out.println("----- Product Information -----");
		System.out.println("Id: " + this.getPid() + "\tName: " + this.getPname() + "\tPrice: " + this.getPrice());

		System.out.println("\n----- Distributor Information -----");
		System.out.println("GST No: " + this.getGST_No() + "\tName: " + this.getDist_name());
	}

}
