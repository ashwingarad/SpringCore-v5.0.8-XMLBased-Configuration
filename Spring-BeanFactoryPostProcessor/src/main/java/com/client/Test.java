package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Product;

/**
 * @author Ashwin
 *
 */
public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Product product = applicationContext.getBean("product", Product.class);
		product.display();

		Product product2 = applicationContext.getBean("product2", Product.class);
		product2.display();
	}
}
