/**
 * 
 */
package com.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.model.Person;
import com.model.Student;

/**
 * @author Ashwin
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("spring.xml");

		Person person = beanFactory.getBean("person", Person.class);
		System.out.println("\nPerson Name: " + person.getPname());

		Student student = beanFactory.getBean("student", Student.class);
		System.out.println("\nStudent name : " + student.getSname());
	}

}
