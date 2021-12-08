package com.testing.features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer {

	int start=1;
	int end=5;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(start<=end) {
			
			start++;
			return true;  //invoke the failed method
		}
		
		return false;//exit from the method
	}

}
