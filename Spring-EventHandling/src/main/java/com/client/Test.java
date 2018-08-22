/**
 * 
 */
package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashwin
 *
 */
public class Test {

	private static ConfigurableApplicationContext context;

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		context = new ClassPathXmlApplicationContext("spring.xml");
		context.start();
		Thread.sleep(2000);
		context.stop();
	}

}
