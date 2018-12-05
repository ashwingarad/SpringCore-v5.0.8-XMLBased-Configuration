package com.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class SpringTest {

	private static char ch;
	private static Scanner sc = new Scanner(System.in);
	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("spring.xml");
		do {
			context.getBean("employee", Employee.class);

			System.out.print("\nDo you want continue.....? = ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}

}
