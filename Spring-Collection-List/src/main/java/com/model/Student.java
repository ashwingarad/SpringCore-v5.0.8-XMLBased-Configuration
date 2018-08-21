package com.model;

import java.util.List;
/**
 * @author Ashwin
 */
public class Student {
	private int id;
	private String name;
	private int mark;

	private List<Subject> subjectList; // for ref property
	private List<String> list; // for idref property

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

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void displayStudent() {
		System.out.println("---- Student information -----");
		System.out.println("ID: " + this.getId() + "\tName: " + this.getName() + "\tMark: " + this.getMark());
	}
}
