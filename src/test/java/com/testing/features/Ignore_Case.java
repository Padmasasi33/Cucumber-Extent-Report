package com.testing.features;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Case {
	@Test
	private void dress() {
	
		System.out.println("Dress");

	}
	@Test
	private void tshirts() {
		System.out.println("Tshirts");

	}
	@Ignore
	@Test
	private void books() {
		System.out.println("Books");

	}
	@Test(enabled=false)
	private void children() {
		System.out.println("Children");

	}

}
