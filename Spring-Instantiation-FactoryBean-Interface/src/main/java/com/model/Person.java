/**
 * 
 */
package com.model;

import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * @author Ashwin
 *
 */
public class Person extends AbstractFactoryBean<Person> {
	private String pname;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	protected Person createInstance() throws Exception {
		System.out.println("\n----- Through AbstractFactoryBean instantiation -----");
		Person person = new Person();
		person.setPname("Virat Kohali");
		return person;
	}
}
