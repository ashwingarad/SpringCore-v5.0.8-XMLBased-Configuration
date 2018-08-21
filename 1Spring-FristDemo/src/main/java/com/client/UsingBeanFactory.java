package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.model.DemoBean;

/**
 * @author Ashwin
 *
 */
@SuppressWarnings("deprecation")
public class UsingBeanFactory {

	private static BeanFactory beanFactory;

	public static void main(String[] args) {
		/**
		 * XmlBeanFactory is deprecated. There are multiple alternative ways to define
		 * resources. You can use use ApplicationContext, DefaultListableBeanFactory
		 * instead of BeanFactory.
		 */
		System.out.println("\n---------------- BeanFactory ------------");

		beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		DemoBean demoBean = (DemoBean) beanFactory.getBean("demoBean");
		demoBean.welcome();
	}
}
