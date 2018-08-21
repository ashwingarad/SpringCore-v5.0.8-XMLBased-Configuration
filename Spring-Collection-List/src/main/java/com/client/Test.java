package com.client;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.model.Student;
import com.model.Subject;


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

		System.out.println("\n---- Subject Information -----");
		List<Subject> subjects = student.getSubjectList();
		subjects.forEach(s -> s.displaySubject());

		System.out.println("\n---- idref output ----");
		List<String> list = student.getList();
		list.forEach(l -> System.out.println(l));
	}

}
