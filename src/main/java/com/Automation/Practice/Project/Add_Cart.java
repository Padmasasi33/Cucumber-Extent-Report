package com.Automation.Practice.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Cart {
	public WebDriver driver;	
	@FindBy(xpath="//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")
	private WebElement quantity;
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	private WebElement addcart;
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	private WebElement proceedto;
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	private WebElement checkto;
	 public Add_Cart(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		 this.driver=driver2;
			PageFactory.initElements(driver, this);
	}
	
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getAddcart() {
		return addcart;
	}
	public WebElement getProceedto() {
		return proceedto;
	}
	public WebElement getCheckto() {
		return checkto;
	}

}
