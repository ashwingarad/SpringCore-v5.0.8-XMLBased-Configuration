/**
 * 
 */
package com.model;

/**
 * @author Ashwin
 *
 */
public class Person {
	private String pname;

	public static Person getInstance() throws Exception {
		System.out.println("Instantiation process...");
		for (int i = 0; i < 8; i++) {
			System.out.print("_");
			Thread.sleep(800);
		}
		return new Person();
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

}
