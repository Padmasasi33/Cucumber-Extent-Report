package com.Automation.Practice.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {
	public WebDriver driver;	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	@FindBy(xpath="(//a[@class='subcategory-name'])[2]")
	private WebElement dresses;
	@FindBy(xpath="(//a[@class='subcategory-name'])[1]")
	private WebElement casual;
	@FindBy(xpath="(//a[@class='product-name'])[2]")
	private WebElement printed;
	public Women(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public WebElement getWomen() {
		return women;
	}
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getCasual() {
		return casual;
	}
	public WebElement getPrinted() {
		return printed;
	}
	

}
