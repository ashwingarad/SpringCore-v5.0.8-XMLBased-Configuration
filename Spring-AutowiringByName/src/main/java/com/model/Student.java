package com.model;

/**
 * @author Ashwin
 *
 */
public class Student {
	private int id;
	private String name;

	private Subject subject;

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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public void displayStudent() {
		System.out.println("-------- Student Information --------");
		System.out.println("Id: " + this.getId() + "\tName: " + this.getName());
		this.subject.displaySubject();
	}

}
