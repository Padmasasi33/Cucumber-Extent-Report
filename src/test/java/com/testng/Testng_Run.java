package com.testng;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Automation.Practice.Project.Base_Automation;
import com.Automation.Practice.Project.POM_Project;
import com.Helper.File_Reader_Manager;

public class Testng_Run  extends Base_Automation{
	
	public static WebDriver driver=Base_Automation.getBrowser("chrome");
	static Logger log=Logger.getLogger(Testng_Run.class);
	public static POM_Project pom=new POM_Project(driver);
	
	
	@Test(priority=-5)
    private void session() throws Throwable  {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);
		PropertyConfigurator.configure("log4j.properties");
		log.info("Creating Session");		

	}
	@Test(priority=-4)
    private void women ()   {
		
		click(pom.getInstanceWo().getWomen());
		
	}
	@Test(priority=-3)
	private void dresses() throws InterruptedException {
		Thread.sleep(3000);
		click(pom.getInstanceWo().getDresses());

	}
	@Test(priority=-2)
	private void casual() throws InterruptedException {
		Thread.sleep(3000);
		click(pom.getInstanceWo().getCasual());

	}
	@Test(priority=-1)
	private void printed() throws InterruptedException {
		Thread.sleep(3000);
		click(pom.getInstanceWo().getPrinted());

	}
	@Test(priority=0)
	private void quantity() throws InterruptedException
	{
		Thread.sleep(3000);
		click(pom.getInstanceAddCart().getQuantity());		
		click(pom.getInstanceAddCart().getQuantity());

	}
	@Test(priority=1)
	private void cart() throws InterruptedException  {
		//Thread.sleep(2000);
		
		//WebElement cart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		//cart.click();
		click(pom.getInstanceAddCart().getAddcart());
		PropertyConfigurator.configure("log4j.properties");
		log.info("Dress Added to the cart");
	}
	@Test(priority=2)
	private void proceed() throws InterruptedException  {
		
		WebDriverWait wait1=new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"))).click();;
		 WebDriverWait wait=new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"))).click();;
		
		
		//click(pom.getInstanceAddCart().getProceedto());
	}
	@Test(priority=3)
	private void email() throws Throwable {
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().email();
	    data(pom.getInstanceSignIn().getEmail(),email);	
	}
	@Test(priority=4)
	private void createAcc() {
		click(pom.getInstanceSignIn().getCreateacc());
		PropertyConfigurator.configure("log4j.properties");
		log.info("Account created");

	}
	@Test(priority=5)
	private void sign_In() throws Throwable {
		WebDriverWait wait2=new WebDriverWait(driver, 50);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"id_gender2\"]"))).click();;
		//click(pom.getInstanceSignIn().getTitle());
		Thread.sleep(10000);
		PropertyConfigurator.configure("log4j.properties");
		log.info("Enter the customer Details ");
		String fn = File_Reader_Manager.getInstanceFRM().getInstanceCR().firstname();
		data(pom.getInstanceSignIn().getFname(), fn);  
		String ln = File_Reader_Manager.getInstanceFRM().getInstanceCR().lastname();
		data(pom.getInstanceSignIn().getLname(), ln);  
		String p = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		data(pom.getInstanceSignIn().getPassword(), p);  
		String d = File_Reader_Manager.getInstanceFRM().getInstanceCR().getdate();
		data(pom.getInstanceSignIn().getDate(), d); 
		String m = File_Reader_Manager.getInstanceFRM().getInstanceCR().getmonth();
		data(pom.getInstanceSignIn().getMonth(), m); 
		String y = File_Reader_Manager.getInstanceFRM().getInstanceCR().getyears();
		data(pom.getInstanceSignIn().getYears(), y);				
        click(pom.getInstanceSignIn().getAcc_creation());
        String c = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcompany();
		data(pom.getInstanceSignIn().getCompany(), c);
		String a = File_Reader_Manager.getInstanceFRM().getInstanceCR().getadd();
		data(pom.getInstanceSignIn().getAdress(), a);
		String st = File_Reader_Manager.getInstanceFRM().getInstanceCR().getStreet();
		data(pom.getInstanceSignIn().getStreet(), st);
		String city = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCity();
		data(pom.getInstanceSignIn().getCity(), city);
		String s = File_Reader_Manager.getInstanceFRM().getInstanceCR().getState();
		data(pom.getInstanceSignIn().getState(),s);	
		String po = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpost();
		data(pom.getInstanceSignIn().getPost(), po);	
		String coun = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCountry();
		data(pom.getInstanceSignIn().getCountry(),coun);
		String dor = File_Reader_Manager.getInstanceFRM().getInstanceCR().getDoor();
		data(pom.getInstanceSignIn().getName(), dor);
		String ph = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPhone();
		data(pom.getInstanceSignIn().getPhone(), ph);
		String mb = File_Reader_Manager.getInstanceFRM().getInstanceCR().getMobile();
		data(pom.getInstanceSignIn().getMobile(), mb);	
		driver.findElement(By.name("alias")).clear();	
		String alis = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAlias();
		data(pom.getInstanceSignIn().getAlias(), alis);	
		data(pom.getInstanceSignIn().getAlias(), "Tirunelveli");			
		click(pom.getInstanceSignIn().getSubmit());
		

	}
	@Test(priority=6)
	private void proceed_To() throws InterruptedException {
		thread_Sleep(3000);		
		click(pom.getInstanceSignIn().getProceed());

	}
	
	@Test(priority=7)
	private void cgv() {
		click(pom.getInstanceSignIn().getCgv());

	}
	@Test(priority=8)
	private void final_proceed() throws IOException {
		click(pom.getInstanceSignIn().getProceedto());
		PropertyConfigurator.configure("log4j.properties");
		log.info("Order Placed");
		takeScreenShot();
		close();


	}
}
	
	


	
	
	
	
	/*@BeforeTest
	private void session() throws Throwable  {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);
		PropertyConfigurator.configure("log4j.properties");
		log.info("Creating Session");		

	}
	
	@BeforeClass
    private void women ()   {
		
		click(pom.getInstanceWo().getWomen());
		
	}
	
	@BeforeMethod
	private void dresses() throws InterruptedException {
		Thread.sleep(3000);
		click(pom.getInstanceWo().getDresses());

	}
	
	@Test(priority=-3)
	private void casual() throws InterruptedException {
		Thread.sleep(3000);
		click(pom.getInstanceWo().getCasual());

	}
	
	@Test(priority=-2)
	private void printed() throws InterruptedException {
		Thread.sleep(3000);
		click(pom.getInstanceWo().getPrinted());

	}
	@Test(priority=-1)
	private void quantity() throws InterruptedException
	{
		Thread.sleep(3000);
		click(pom.getInstanceAddCart().getQuantity());		
		click(pom.getInstanceAddCart().getQuantity());

	}
	
	@Test(priority=0)
	private void cart() throws InterruptedException  {
		//Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		cart.click();
		click(pom.getInstanceAddCart().getAddcart());
		PropertyConfigurator.configure("log4j.properties");
		log.info("Dress Added to the cart");
	}
	@Test(priority=1)
	private void proceeed() throws InterruptedException  {
		Thread.sleep(3000);
		
		
		click(pom.getInstanceAddCart().getProceedto());
	}
	@Test(priority=2)
	private void email() throws Throwable {
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().email();
	    data(pom.getInstanceSignIn().getEmail(),email);	
	}
	@Test(priority=3)
	private void createAcc() {
		click(pom.getInstanceSignIn().getCreateacc());
		PropertyConfigurator.configure("log4j.properties");
		log.info("account created");

	}
	
	@Test(priority=4)
	private void sign_In() throws Throwable {
		WebDriverWait wait2=new WebDriverWait(driver, 50);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"id_gender2\"]"))).click();;
		//click(pom.getInstanceSignIn().getTitle());
		PropertyConfigurator.configure("log4j.properties");
		log.info("Enter the customer Details ");
		String fn = File_Reader_Manager.getInstanceFRM().getInstanceCR().firstname();
		data(pom.getInstanceSignIn().getFname(), fn);  
		String ln = File_Reader_Manager.getInstanceFRM().getInstanceCR().lastname();
		data(pom.getInstanceSignIn().getLname(), ln);  
		String p = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		data(pom.getInstanceSignIn().getPassword(), p);  
		String d = File_Reader_Manager.getInstanceFRM().getInstanceCR().getdate();
		data(pom.getInstanceSignIn().getDate(), d); 
		String m = File_Reader_Manager.getInstanceFRM().getInstanceCR().getmonth();
		data(pom.getInstanceSignIn().getMonth(), m); 
		String y = File_Reader_Manager.getInstanceFRM().getInstanceCR().getyears();
		data(pom.getInstanceSignIn().getYears(), y);				
        click(pom.getInstanceSignIn().getAcc_creation());
        String c = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcompany();
		data(pom.getInstanceSignIn().getCompany(), c);
		String a = File_Reader_Manager.getInstanceFRM().getInstanceCR().getadd();
		data(pom.getInstanceSignIn().getAdress(), a);
		String st = File_Reader_Manager.getInstanceFRM().getInstanceCR().getStreet();
		data(pom.getInstanceSignIn().getStreet(), st);
		String city = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCity();
		data(pom.getInstanceSignIn().getCity(), city);
		String s = File_Reader_Manager.getInstanceFRM().getInstanceCR().getState();
		data(pom.getInstanceSignIn().getState(),s);	
		String po = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpost();
		data(pom.getInstanceSignIn().getPost(), po);	
		String coun = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCountry();
		data(pom.getInstanceSignIn().getCountry(),coun);
		String dor = File_Reader_Manager.getInstanceFRM().getInstanceCR().getDoor();
		data(pom.getInstanceSignIn().getName(), dor);
		String ph = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPhone();
		data(pom.getInstanceSignIn().getPhone(), ph);
		String mb = File_Reader_Manager.getInstanceFRM().getInstanceCR().getMobile();
		data(pom.getInstanceSignIn().getMobile(), mb);	
		driver.findElement(By.name("alias")).clear();	
		String alis = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAlias();
		data(pom.getInstanceSignIn().getAlias(), alis);	
		data(pom.getInstanceSignIn().getAlias(), "Tirunelveli");			
		click(pom.getInstanceSignIn().getSubmit());
		

	}
	
	@AfterMethod
	private void proceed_To() throws InterruptedException {
		thread_Sleep(3000);		
		click(pom.getInstanceSignIn().getProceed());

	}
	
	@AfterClass
	private void cgv() {
		click(pom.getInstanceSignIn().getCgv());

	}
	@AfterTest
	private void final_proceed() throws IOException {
		click(pom.getInstanceSignIn().getProceedto());
		PropertyConfigurator.configure("log4j.properties");
		log.info("Order Placed");
		takeScreenShot();
		close();


	}*/
	
	

	
	