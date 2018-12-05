package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class SpringTest {

	private static ConfigurableApplicationContext context;

	public static void main(String[] args) throws InterruptedException {
		context = new ClassPathXmlApplicationContext("spring.xml");

		for (int i = 0; i < 5; i++) {
			Thread.sleep(500);
			Student student = context.getBean("student", Student.class);
			System.out.println("Student object created : " + student.hashCode());
		}

		for (String scope : context.getBeanFactory().getRegisteredScopeNames()) {
			System.out.println("\nScope name : "+scope);
		}
	}
}
