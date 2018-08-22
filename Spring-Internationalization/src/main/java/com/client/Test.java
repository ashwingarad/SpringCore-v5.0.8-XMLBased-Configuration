/**
 * 
 */
package com.client;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashwin
 *
 */
public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		String eng = applicationContext.getMessage("welcome.springcore", null, "Not Found", new Locale("en", "US"));
		System.out.println(eng);

		String marathi = applicationContext.getMessage("welcome.springcore", null, "Not Found", new Locale("mr", "IN"));
		System.out.println(marathi);

		String hindi = applicationContext.getMessage("welcome.springcore", null, "Not Found", new Locale("hi", "IN"));
		System.out.println(hindi);
	}

}
