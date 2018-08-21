/**
 * 
 */
package com.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.model.Distributor;

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

		Distributor distributor = beanFactory.getBean("distributor", Distributor.class);
		distributor.displayDistributor();
	}

}
