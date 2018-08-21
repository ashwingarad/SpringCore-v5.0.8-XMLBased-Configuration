package com.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @author Ashwin
 *
 */
public class Person implements BeanNameAware, BeanFactoryAware, InitializingBean {
	private String name;
	private String addr;

	public Person() {
		System.out.println("\nConstructor call");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void displayInfo(int i) {
		System.out.println("\n----- " + i + " Person Details -----");
		System.out.println("Name: " + this.getName() + "\nAddress: " + this.getAddr());
	}

	/*
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("\n........ After property set called .......");
	}

	/*
	 * @see org.springframework.beans.factory.BeanFactoryAware#setBeanFactory(org.
	 * springframework.beans.factory.BeanFactory)
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory Received");

		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(Person.class);

		MutablePropertyValues values = new MutablePropertyValues();
		values.add("name", "Ashnil");
		values.add("addr", "Pimpri-Chinchwad");
		beanDefinition.setPropertyValues(values);

		((DefaultListableBeanFactory) beanFactory).registerBeanDefinition("person2", beanDefinition);
	}

	/*
	 * @see
	 * org.springframework.beans.factory.BeanNameAware#setBeanName(java.lang.String)
	 */
	@Override
	public void setBeanName(String name) {
		System.out.println("Created Bean Name : " + name);
	}

}
