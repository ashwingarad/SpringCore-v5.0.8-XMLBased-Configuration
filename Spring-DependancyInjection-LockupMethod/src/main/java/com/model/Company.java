/**
 * 
 */
package com.model;

/**
 * @author Ashwin
 *
 */
public abstract class Company {
	private String companyName;

	public abstract Employee getObjectEmployee();

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void displayCompany() {		
		System.out.println("--------- Company Information --------");
		System.out.println("Company Name : " + this.getCompanyName());
		
		getObjectEmployee().displayEmployee();
	}
}
