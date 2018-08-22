/**
 * 
 */
package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Conditional;
import com.model.Logical;
import com.model.Maths;
import com.model.ObjectAccess;
import com.model.Regex;
import com.model.StringOperation;

/**
 * @author Ashwin
 *
 */
public class Test {
	private static ApplicationContext context;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring.xml");

		Maths maths = context.getBean("math", Maths.class);
		maths.display();

		StringOperation operation = context.getBean("str", StringOperation.class);
		System.out.println("\nString : " + operation.getStr());

		Logical logical = context.getBean("logic", Logical.class);
		System.out.println("\nLogical : " + logical.isAns());

		Conditional conditional = context.getBean("conditional", Conditional.class);
		System.out.println("\nConditional : " + conditional.getAns());

		Regex regex = context.getBean("regex", Regex.class);
		System.out.println("\nRegex : " + regex.isFlag());
		System.out.println("Regex valisd string : " + regex.isValidString());

		ObjectAccess access = context.getBean("objectAccess", ObjectAccess.class);
		System.out.println("\nStringOperation object value : " + access.getStrValue());
		System.out.println("Upper case : " + access.getUpper());
		System.out.println("Lower case : " + access.getLower());
	}
}
