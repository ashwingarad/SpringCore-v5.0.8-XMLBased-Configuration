package com.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.model.Employee;

/**
 * @author Ashwin
 *
 */
public class Test {
	private static DefaultListableBeanFactory beanFactory;

	public static void main(String[] args) {
		beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("spring.xml");

		Employee employee = beanFactory.getBean("employee", Employee.class);
		employee.display();

		System.out.println();

		Employee employee2 = beanFactory.getBean("employee2", Employee.class);
		employee2.display();
	}
}
