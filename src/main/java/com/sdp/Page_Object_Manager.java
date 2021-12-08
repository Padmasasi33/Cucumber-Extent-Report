package com.sdp;

import org.openqa.selenium.WebDriver;

import com.Pom.Book_Hotel;
import com.Pom.Itineray_Page;
import com.Pom.Login_Page;
import com.Pom.Search_Hotels;

public class Page_Object_Manager {
	public WebDriver driver;
	public Search_Hotels sh;
	private Login_Page lp;
	private Book_Hotel bh;
	private Itineray_Page ip;
	
	public Page_Object_Manager(WebDriver driver2)
	
	{
	this.driver=driver2;
	}
	
	public Search_Hotels getInstanceSh() {
		// TODO Auto-generated method stub
		if(sh==null)
		{
			sh=new Search_Hotels(driver);
		}
		return sh;

	}
	public Login_Page getInstanceLp() {
		// TODO Auto-generated method stub
		if(lp==null)
		{
			lp=new Login_Page(driver);
		}
		return lp;

	}
	public Book_Hotel getInstanceBh() {
		// TODO Auto-generated method stub
		if(bh==null)
		{
			bh=new Book_Hotel(driver);
		}
		return bh;

	}
	public Itineray_Page getInstanceIp() {
		// TODO Auto-generated method stub
		
		if(ip==null)
		{
			ip=new Itineray_Page(driver);
		}
		return ip;

	}

}
