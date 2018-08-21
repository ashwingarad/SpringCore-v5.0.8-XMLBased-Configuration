/**
 * 
 */
package com.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.model.President;

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

		President president = beanFactory.getBean("president", President.class);
		System.out.println("\nPresident Name: " + president.getPresident_name());
	}

}
