package com.model;

import java.util.Map;

/**
 * @author Ashwin
 */

public class Student {
	private int id;
	private String name;
	private int mark;

	private Map<Integer, String> subjectMap;

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

	public Map<Integer, String> getSubjectMap() {
		return subjectMap;
	}

	public void setSubjectMap(Map<Integer, String> subjectMap) {
		this.subjectMap = subjectMap;
	}

	public void displayStudent() {
		System.out.println("---- Student information -----");
		System.out.println("ID: " + this.getId() + "\tName: " + this.getName() + "\tMark: " + this.getMark());

		System.out.println("\n---- Subjects -----");
		this.subjectMap.forEach((k, v) -> System.out.println(k + " " + v));
	}
}
