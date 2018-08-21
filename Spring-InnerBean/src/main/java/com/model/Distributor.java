/**
 * 
 */
package com.model;

/**
 * @author Ashwin
 *
 */
public class Distributor {
	private String dist_name;
	private String GST_No;

	private Product product;

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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void displayDistributor() {
		System.out.println("\n----- Distributor Information -----");
		System.out.println("GST No: " + this.getGST_No() + "\tName: " + this.getDist_name() + "\n");

		this.product.displayProduct();
	}
}
