package com.Automation.Practice.Project;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Helper.File_Reader_Manager;
import com.Maven.Maven_Oct30.Base_Class;


public class Runner_Class extends Base_Automation {
	public static WebDriver driver=Base_Automation.getBrowser("chrome");
	//public static Women w=new Women(driver);
	/*public static Sign_In si=new Sign_In(driver);
	public static Add_Cart ac=new Add_Cart(driver);*/
	public static POM_Project pom=new POM_Project(driver);
    static Logger log=Logger.getLogger(Runner_Class.class);
	public static void main(String[] args) throws Throwable {		
		PropertyConfigurator.configure("log4j.properties");
		log.info("Creating Session");
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);				
		driver.manage().window().maximize();		
		click(pom.getInstanceWo().getWomen());	
		thread_Sleep(5000);
		click(pom.getInstanceWo().getDresses());
		thread_Sleep(3000);
		click(pom.getInstanceWo().getCasual());
		thread_Sleep(5000);		
		click(pom.getInstanceWo().getPrinted());
		thread_Sleep(3000);
		click(pom.getInstanceAddCart().getQuantity());		
		click(pom.getInstanceAddCart().getQuantity());
		thread_Sleep(5000);			
		click(pom.getInstanceAddCart().getAddcart());
		log.info("Dress Added to the cart");
		thread_Sleep(3000);
		//WebDriverWait wait1=new WebDriverWait(driver, 50);
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"))).click();;
	    click(pom.getInstanceAddCart().getProceedto());
	    //thread_Sleep(3000);	
	    WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"))).click();;
		//click(pom.getInstanceAddCart().getCheckto());
		//thread_Sleep(5000);
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().email();
	    data(pom.getInstanceSignIn().getEmail(),email);		
		click(pom.getInstanceSignIn().getCreateacc());
		//thread_Sleep(3000);
		log.info("account created");
		WebDriverWait wait2=new WebDriverWait(driver, 50);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"id_gender2\"]"))).click();;
		//click(pom.getInstanceSignIn().getTitle());
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
		thread_Sleep(3000);		
		click(pom.getInstanceSignIn().getProceed());
		click(pom.getInstanceSignIn().getCgv());		
		click(pom.getInstanceSignIn().getProceedto());
		log.info("Order placed");
		takeScreenShot();
		close();

	}

}



