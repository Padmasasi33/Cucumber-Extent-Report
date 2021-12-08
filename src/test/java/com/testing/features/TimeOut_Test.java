package com.testing.features;

import org.testng.annotations.Test;

public class TimeOut_Test {
	
	@Test(timeOut=4000)
	private void login() throws InterruptedException {
		
		System.out.println("Browser Launch");
		
		Thread.sleep(2000);
		
		System.out.println("User enter the credentials");
		
		System.out.println("Click on login btn");
		
		Thread.sleep(2000);
		
		System.out.println("Navigate to home page");
		
		Thread.sleep(2000);
		
		System.out.println("Perform some operations");
		
		
		
		
		

	}

}
