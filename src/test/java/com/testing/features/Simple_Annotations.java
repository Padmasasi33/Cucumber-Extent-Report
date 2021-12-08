package com.testing.features;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	// before method -->test--->after method
	
	@BeforeSuite
	private void setProperty() {
		// TODO Auto-generated method stub
		System.out.println("set property");

	}
	
	@BeforeTest
	private void BrowserLaunch() {
		// TODO Auto-generated method stub
		System.out.println("Browser Launch");

	}
	@BeforeClass
	private void url() {
		// TODO Auto-generated method stub
		System.out.println("Launching the url");

	}
	@AfterClass
	private void homepage() {
		// TODO Auto-generated method stub
		System.out.println("Home page");

	}
	@AfterTest
	private void close() {
		// TODO Auto-generated method stub
		System.out.println("Close");

	}
	@AfterSuite
	private void cookies() {
		// TODO Auto-generated method stub
		System.out.println("delete cookies");

	}

	@Test
	private void women() {
		System.out.println("Women");

	}

	@BeforeMethod
	private void sign_In() {
		// TODO Auto-generated method stub
		System.out.println("Sign in");

	}

	@AfterMethod
	private void sign_Off() {
		// TODO Auto-generated method stub
		System.out.println("sign off");

	}

	@Test
	private void dress() {
		// TODO Auto-generated method stub
		System.out.println("dress");

	}

	@Test
	private void tshirts() {
		// TODO Auto-generated method stub
		System.out.println("Tshirts");

	}

}
