/**
 * 
 */
package com.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.model.Person;

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
		person.displayInfo(1);

		Person person2 = beanFactory.getBean("person2", Person.class);
		person2.displayInfo(2);
	}

}
