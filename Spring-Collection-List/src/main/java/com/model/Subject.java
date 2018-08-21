package com.model;

/**
 * @author Ashwin
 */
public class Subject {
	private String subCode;
	private String subName;

	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public void displaySubject() {
		System.out.println("Code: " + this.getSubCode() + "\tName: " + this.getSubName());
	}
}
