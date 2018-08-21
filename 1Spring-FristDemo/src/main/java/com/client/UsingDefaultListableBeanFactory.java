package com.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.model.DemoBean;

/**
 * @author Ashwin
 *
 */
public class UsingDefaultListableBeanFactory {

	private static DefaultListableBeanFactory beanFactory;

	public static void main(String[] args) {

		System.out.println("\n---------------- DefaultListableBeanFactory ------------");

		beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("spring.xml");

		DemoBean demoBean = (DemoBean) beanFactory.getBean("demoBean");
		demoBean.welcome();

	}
}
