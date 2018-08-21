package com.client;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.model.Student;

/**
 * @author Ashwin
 *
 */
public class Test {
	private static DefaultListableBeanFactory beanFactory;

	public static void main(String[] args) {
		beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("spring.xml");

		Student student = beanFactory.getBean("student", Student.class);
		student.displayStudent();

		System.out.println("\n---- Subjects List ----");
		List<String> list = student.getSubList();
		list.forEach(l -> System.out.println(l));

		System.out.println("\n---- Subjects Set ----");
		Set<String> set = student.getSubSet();
		set.forEach(s -> System.out.println(s));

		System.out.println("\n---- Subjects Map ----");
		Map<Integer, String> map = student.getSubMap();
		map.forEach((k, v) -> System.out.println(k + " " + v));
	}

}
