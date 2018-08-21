package com.client;

import java.util.Set;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.model.Student;
import com.model.Subject;

public class Test {
	private static DefaultListableBeanFactory beanFactory;

	public static void main(String[] args) {
		beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("spring.xml");

		Student student = beanFactory.getBean("student", Student.class);
		student.displayStudent();

		System.out.println("\n---- Subject Information -----");
		Set<Subject> subjects = student.getSubjectSet();
		subjects.forEach(s -> s.displaySubject());
	}

}
