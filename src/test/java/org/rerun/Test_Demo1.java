package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Demo1 {
	
	@Test
	private void username_Validation() {
		
        String username="Starc";
		
		String actual_Username="Starc";
		
		Assert.assertEquals(username, actual_Username);
		
			}
	
	@Test
	private void password_Validation() {
		
        String password="Starc123";
		
		String actual_Password="Starc";
		
		Assert.assertEquals(password, actual_Password);
	}

}
