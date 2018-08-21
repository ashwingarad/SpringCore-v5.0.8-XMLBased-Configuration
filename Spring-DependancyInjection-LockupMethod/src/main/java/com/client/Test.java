package com.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.model.Company;

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

		Company company = beanFactory.getBean("company", Company.class);
		company.displayCompany();

	}
}
