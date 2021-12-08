package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
	
	@Test
	private void demo() {	
	
		/*String actual_Username="Starc";
	
		String expected_Username="Star";
		
		//validation
		
		Assert.assertEquals(actual_Username, expected_Username);
		System.out.println("Data validation");*/
		
		
		
		//verification
		String actual_Username="Starc";
		
		String expected_Username="Star";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actual_Username, expected_Username);
		System.out.println("Data verification");
		
		
		
		
	
	}
	}


			


