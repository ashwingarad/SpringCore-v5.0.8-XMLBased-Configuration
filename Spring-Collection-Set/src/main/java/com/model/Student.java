package com.model;

import java.util.Set;

/**
 * @author Ashwin
 */

public class Student {
	private int id;
	private String name;
	private int mark;

	private Set<Subject> subjectSet;

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

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Set<Subject> getSubjectSet() {
		return subjectSet;
	}

	public void setSubjectSet(Set<Subject> subjectSet) {
		this.subjectSet = subjectSet;
	}

	public void displayStudent() {
		System.out.println("---- Student information -----");
		System.out.println("ID: " + this.getId() + "\tName: " + this.getName() + "\tMark: " + this.getMark());
	}
}
