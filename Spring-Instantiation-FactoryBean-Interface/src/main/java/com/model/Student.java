package com.model;

import org.springframework.beans.factory.FactoryBean;

public class Student implements FactoryBean<Student> {
	private String sname;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public Student getObject() throws Exception {
		System.out.println("\n----- Through FactoryBean instantiation -----");
		Student student = new Student();
		student.setSname("Mahesh");
		return student;
	}

	@Override
	public Class<?> getObjectType() {
		return Student.class;
	}

}
