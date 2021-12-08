package com.testing.features;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(priority = -1)
	private void setProperty() {
		System.out.println("set Property");

	}
	@Test(invocationCount=5)
	private void refresh() {
		System.out.println("Refresh");

	}
	@Test(priority=1)
	private void click() {
		System.out.println("click");
		

	}
	
	

}
