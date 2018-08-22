/**
 * 
 */
package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.model.MyPublisher;

/**
 * @author Ashwin
 *
 */
public class Test {

	private static ConfigurableApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		MyPublisher myPublisher = applicationContext.getBean("myPublisher", MyPublisher.class);
		myPublisher.publish();
	}
}
