package com.Automation.Practice.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In {
	public WebDriver driver;	
	@FindBy(xpath="(//input[@data-validate='isEmail'])[1]")
	private WebElement email;
	@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
	private WebElement createacc;
	@FindBy(name="id_gender")
	private WebElement title;
	@FindBy(xpath="//*[@id=\"customer_firstname\"]")
	private WebElement fname;
	@FindBy(xpath="//*[@id=\"customer_lastname\"]")
	private WebElement lname;
	@FindBy(xpath="//*[@id=\"passwd\"]")
	private WebElement password;
	@FindBy(xpath="//*[@id=\"days\"]")
	private WebElement date;
	@FindBy(xpath="//*[@id=\"months\"]")
	private WebElement month;
	@FindBy(xpath="//*[@id=\"years\"]")
	private WebElement years;
	@FindBy(xpath="//*[@id=\"account-creation_form\"]/div[1]/div[8]/label")
	private WebElement acc_creation;
	@FindBy(xpath="//*[@id=\"company\"]")
	private WebElement company;
	@FindBy(xpath="//*[@id=\"address1\"]")
	private WebElement adress;
	@FindBy(xpath="//*[@id=\"address2\"]")
	private WebElement street;
	@FindBy(xpath="//*[@id=\"city\"]")
	private WebElement city;
	@FindBy(xpath="//*[@id=\"id_state\"]")
	private WebElement state;
	@FindBy(id="postcode")
	private WebElement post;
	@FindBy(xpath="//select[@name='id_country']")
	private WebElement country;
	@FindBy(name="other")
	private WebElement name;
	@FindBy(name="phone")
	private WebElement phone;
	@FindBy(name="phone_mobile")
	private WebElement mobile;
	@FindBy(name="alias")
	private WebElement alias;
	@FindBy(xpath="//*[@id=\"submitAccount\"]")
	private WebElement submit;
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
	private WebElement proceed;
	@FindBy(name="cgv")
	private WebElement cgv;
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
	private WebElement proceedto;
	 public Sign_In(WebDriver driver3) {
			// TODO Auto-generated constructor stub
			 this.driver=driver3;
				PageFactory.initElements(driver, this);
		}
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getCreateacc() {
		return createacc;
	}
	public WebElement getTitle() {
		return title;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYears() {
		return years;
	}
	public WebElement getAcc_creation() {
		return acc_creation;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getAdress() {
		return adress;
	}
	public WebElement getStreet() {
		return street;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getPost() {
		return post;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getAlias() {
		return alias;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getProceed() {
		return proceed;
	}
	public WebElement getCgv() {
		return cgv;
	}
	public WebElement getProceedto() {
		return proceedto;
	}
	

}
