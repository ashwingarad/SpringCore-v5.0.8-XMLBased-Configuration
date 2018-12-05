package com.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class College implements ApplicationContextAware {
	private ApplicationContext applicationContext;

	public College() {
		System.out.println("\n" + this + " = College instance is created");
	}

	public Student createStudent() {
		return this.applicationContext.getBean("student", Student.class);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
