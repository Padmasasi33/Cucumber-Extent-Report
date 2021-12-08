package com.testing.features;

import org.testng.annotations.Test;

public class Priority_Concept {
	@Test(priority = -1)
	private void setProperty() {
		System.out.println("set Property");

	}
	@Test()
	private void browserLaunch() {
		System.out.println("Browser Launch");

	}
	@Test(priority = 0)
	private void url() {
	System.out.println("URL");

	}
	@Test(priority = 1)
	private void windowMax() {
		System.out.println("Maximize the window");

	}

}
