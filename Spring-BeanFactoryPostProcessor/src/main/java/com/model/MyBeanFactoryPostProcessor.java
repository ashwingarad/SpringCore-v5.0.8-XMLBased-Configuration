package com.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @author Ashwin
 *
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Inside postProcessBeanFactory method.");
		System.out.println("Creating new bean product2");

		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(Product.class);

		MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
		mutablePropertyValues.add("pid", "504");
		mutablePropertyValues.add("pname", "Peter England T-Shirts");
		mutablePropertyValues.add("price", "5400");
		beanDefinition.setPropertyValues(mutablePropertyValues);

		((DefaultListableBeanFactory) beanFactory).registerBeanDefinition("product2", beanDefinition);

		System.out.println("New bean of \"" + beanDefinition.getBeanClassName() + "\" is created ");
	}
}
