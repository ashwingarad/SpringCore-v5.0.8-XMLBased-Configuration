/**
 * 
 */
package com.client;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.model.Employee;

/**
 * @author Ashwin
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("spring.xml");

		Resource resource = new ClassPathResource("/config.properties");
		PropertyPlaceholderConfigurer placeholderConfigurer = new PropertyPlaceholderConfigurer();
		placeholderConfigurer.setLocation(resource);
		placeholderConfigurer.postProcessBeanFactory(beanFactory);

//		Properties properties = PropertiesLoaderUtils.loadProperties(resource);

		Employee employee = beanFactory.getBean("employee", Employee.class);
		employee.display();
	}

}
