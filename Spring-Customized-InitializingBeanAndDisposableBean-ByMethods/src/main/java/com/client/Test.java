package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Product;

/**
 * @author Ashwin
 *
 */
public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Product product = context.getBean("product", Product.class);
		product.display();

		context.close();
	}
}
