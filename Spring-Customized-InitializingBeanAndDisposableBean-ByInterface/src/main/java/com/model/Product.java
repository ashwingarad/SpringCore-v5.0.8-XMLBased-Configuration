package com.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Ashwin
 *
 */
public class Product implements InitializingBean, DisposableBean {
	private int pid;
	private String pname;
	private int price;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void display() {
		System.out.println("\n------ Product Information -------");
		System.out.println("ID : " + this.getPid() + "\tName : " + this.getPname() + "\tPrice : " + this.getPrice());
	}

	/*
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("\n-------- Destroy method called ---------");
	}

	/*
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("-------- afterPropertiesSet method called ---------");

		System.out.println("Old properties are");
		this.display();

		System.out.print("\nSetting up new properties..");
		for (int i = 0; i < 8; i++) {
			System.out.print(".");
			Thread.sleep(700);
		}
		this.setPname("Peter England");
		this.setPrice(2500);
	}
}
