package com.model;

/**
 * @author Ashwin
 *
 */
public class Subject {
	private String subName;
	private int mark;

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public void displaySubject() {
		System.out.println("\n----------- Subject Information -----------");
		System.out.println("Name: " + this.getSubName() + "\tMark : " + this.getMark());
	}
}
