package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Employee employee = context.getBean("employee", Employee.class);
		employee.displayEmployee();

		Employee.Address address = context.getBean("address", Employee.Address.class);
		address.displayAddr();
	}
}
