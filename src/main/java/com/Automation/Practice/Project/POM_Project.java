package com.Automation.Practice.Project;

import org.openqa.selenium.WebDriver;

import com.Pom.Search_Hotels;

public class POM_Project {
	public WebDriver driver;
	private Add_Cart ac;
	private Sign_In si;
	private Women w;
	
	
	
	public POM_Project(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public Add_Cart getInstanceAddCart() {
		// TODO Auto-generated method stub
		if(ac==null)
		{
			ac=new Add_Cart(driver);
		}
		return ac;

	}
	public Sign_In getInstanceSignIn() {
		// TODO Auto-generated method stub
		if(si==null)
		{
			si=new Sign_In(driver);
		}
		return si;

	}
	public Women getInstanceWo() {
		// TODO Auto-generated method stub
		if(w==null)
		{
			w=new Women(driver);
		}
		return w;

	}
	

}
