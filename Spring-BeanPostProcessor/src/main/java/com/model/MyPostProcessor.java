package com.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Ashwin
 *
 */
public class MyPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before Initialization : " + beanName);
		Product product = (Product) bean;
		System.out.println("Product name " + product.getPname());
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("\nAfter Initialization : " + beanName);
		Product product = (Product) bean;
		System.out
				.println("Before changing Product Name is " + product.getPname() + " and price " + product.getPrice());
		product.setPname("Peter England Jeans");
		product.setPrice(1200);
		return product;
	}

}
