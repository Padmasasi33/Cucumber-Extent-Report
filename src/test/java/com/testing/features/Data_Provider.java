package com.testing.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test(dataProvider = "data")
	private void credentials(String username, int password) {
		
		System.out.println("Username:" +username);
		System.out.println("Password:" +password);

	}

	@DataProvider
	private Object[][] data() {
		// TODO Auto-generated method stub
		return new Object[][] { { "Starc", 123 }, { "Smith", 2434 }, { "Starc", 123345 }

		};
	}

}
