package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Ashwin
 */
public class Student {
	private int id;
	private String name;
	private int mark;

	private List<String> subList;
	private Set<String> subSet;
	private Map<Integer, String> subMap;

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

	public List<String> getSubList() {
		return subList;
	}

	public void setSubList(List<String> subList) {
		this.subList = subList;
	}

	public Set<String> getSubSet() {
		return subSet;
	}

	public void setSubSet(Set<String> subSet) {
		this.subSet = subSet;
	}

	public Map<Integer, String> getSubMap() {
		return subMap;
	}

	public void setSubMap(Map<Integer, String> subMap) {
		this.subMap = subMap;
	}

	public void displayStudent() {
		System.out.println("---- Student information -----");
		System.out.println("ID: " + this.getId() + "\tName: " + this.getName() + "\tMark: " + this.getMark());
	}
}
