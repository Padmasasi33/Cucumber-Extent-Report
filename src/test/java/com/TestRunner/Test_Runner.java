package com.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Helper.File_Reader_Manager;
import com.Maven.Maven_Oct30.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src\\test\\java\\com\\adactin\\feature\\adactin.feature",
		glue="com.stepdefinition",
		monochrome=true,
		dryRun=false,
		strict=true,
		plugin= {
				"html:Report/HtmlReport.html",
				"json:JsonReport/Report.json","pretty",
				"com.cucumber.listener.ExtentCucumberFormatter:CucumberReport/Extent.html"
				
		}
		)


public class Test_Runner {
	
	public static WebDriver driver;  //--->null driver
	@BeforeClass
	public static void set_Up() throws Throwable {
		
		driver = Base_Class.getBrowser("chrome");
		
		//WebDriver driver = Base_Class.getBrowser(File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl());
        //driver.getCurrentUrl();
	}
	@AfterClass
	public static void tear_Down() {
		
		
		driver.close();

	}
	

}
