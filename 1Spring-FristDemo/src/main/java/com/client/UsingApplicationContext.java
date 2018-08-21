package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.DemoBean;

/**
 * @author Ashwin
 *
 */
public class UsingApplicationContext {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {

		System.out.println("\n---------------- ApplicationContext ------------");

		applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		DemoBean demoBean = (DemoBean) applicationContext.getBean("demoBean");
		demoBean.welcome();
	}
}
