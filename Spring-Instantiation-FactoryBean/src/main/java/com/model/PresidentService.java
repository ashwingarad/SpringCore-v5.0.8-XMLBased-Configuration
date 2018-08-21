package com.model;

public class PresidentService {
	private static President president = new President();

	private PresidentService() {
	}

	public static PresidentService getInstance() {
		return new PresidentService();
	}

	public President getPresidentInstance() throws Exception {
		System.out.println("Instantiation process...");
		for (int i = 0; i < 8; i++) {
			System.out.print("_");
			Thread.sleep(800);
		}
		president.setPresident_name("Dr. Abdul Kalam");
		return president;
	}
}
