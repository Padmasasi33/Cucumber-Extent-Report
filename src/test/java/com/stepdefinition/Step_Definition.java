package com.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Helper.File_Reader_Manager;
import com.Maven.Maven_Oct30.Base_Class;
import com.TestRunner.Test_Runner;

import com.sdp.Page_Object_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Before
	public void beforeHooks(Scenario s) {

		String name = s.getName();
		System.out.println("Name :" + name);

	}

	@After
	public void afterHooks(Scenario s) throws Throwable {

		if (s.isFailed()) {

			takeScreenShot();
		}

		String status = s.getStatus();
		System.out.println("Status:" + status);

	}

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);

	}

	@When("^user Give The \"([^\"]*)\" In UserName Textbox$")
	public void user_Give_The_In_UserName_Textbox(String name) throws Throwable {

		userName(pom.getInstanceLp().getUsername(), name);

	}

	@When("^user Enter The \"([^\"]*)\" In Password Textbox$")
	public void user_Enter_The_In_Password_Textbox(String pass) throws Throwable {

		userName(pom.getInstanceLp().getPassword(), pass);

	}

	@Then("^user click The Sign In Button It Navigates To The Search Hotel Page$")
	public void user_click_The_Sign_In_Button_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {

		click(pom.getInstanceLp().getLogin());
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {

		// WebDriverWait wait1=new WebDriverWait(driver, 100);
		// wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='location']")));
		String location = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();
		dropDown("byValue", pom.getInstanceSh().getLocation(), location);

	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {

		String hotel = File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotel();
		dropDown("byIndex", pom.getInstanceSh().getHotels(), hotel);

	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {

		String rtype = File_Reader_Manager.getInstanceFRM().getInstanceCR().room_Type();
		dropDown("byValue", pom.getInstanceSh().getRoom_Type(), rtype);

	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {

		String rno = File_Reader_Manager.getInstanceFRM().getInstanceCR().room_No();
		dropDown("byValue", pom.getInstanceSh().getRoom_nos(), rno);

	}

	@When("^user Give The Check In Date$")
	public void user_Give_The_Check_In_Date() throws Throwable {
		String din = File_Reader_Manager.getInstanceFRM().getInstanceCR().date_In();
		userName(pom.getInstanceSh().getDatepick_in(), din);

	}

	@When("^user Give The Check Out Date$")
	public void user_Give_The_Check_Out_Date() throws Throwable {

		String dout = File_Reader_Manager.getInstanceFRM().getInstanceCR().date_Out();
		userName(pom.getInstanceSh().getDatepick_out(), dout);

	}

	@When("^user Give The Number Of Adults In Room$")
	public void user_Give_The_Number_Of_Adults_In_Room() throws Throwable {

		String adult = File_Reader_Manager.getInstanceFRM().getInstanceCR().adult();
		dropDown("byValue", pom.getInstanceSh().getAdult_room(), adult);

	}

	@When("^user Give The Number Of Children In Room$")
	public void user_Give_The_Number_Of_Children_In_Room() throws Throwable {

		String child = File_Reader_Manager.getInstanceFRM().getInstanceCR().child();
		dropDown("byValue", pom.getInstanceSh().getChild_room(), child);

	}

	@Then("^user Give The Search Button It Navigates To The Next Page$")
	public void user_Give_The_Search_Button_It_Navigates_To_The_Next_Page() throws Throwable {

		click(pom.getInstanceSh().getSearch());
	}

	@When("^user Click The Radio Button$")
	public void user_Click_The_Radio_Button() throws Throwable {

		click(pom.getInstanceSh().getRadio());

	}

	@Then("^user Click The Continue Button It Navigates To The Book A Hotel page$")
	public void user_Click_The_Continue_Button_It_Navigates_To_The_Book_A_Hotel_page() throws Throwable {

		click(pom.getInstanceSh().getCon());

	}

	@When("^user Give The First Name$")
	public void user_Give_The_First_Name() throws Throwable {

		String fname = File_Reader_Manager.getInstanceFRM().getInstanceCR().first_Name();
		userName(pom.getInstanceBh().getFirstname(), fname);

	}

	@When("^user Give The Last Name$")
	public void user_Give_The_Last_Name() throws Throwable {

		String lname = File_Reader_Manager.getInstanceFRM().getInstanceCR().last_Name();
		userName(pom.getInstanceBh().getLastname(), lname);

	}

	@When("^user Give The Address$")
	public void user_Give_The_Address() throws Throwable {

		String adres = File_Reader_Manager.getInstanceFRM().getInstanceCR().address();
		userName(pom.getInstanceBh().getAddress(), adres);

	}

	@When("^user Give The Card Number$")
	public void user_Give_The_Card_Number() throws Throwable {

		String no = File_Reader_Manager.getInstanceFRM().getInstanceCR().card_Number();
		userName(pom.getInstanceBh().getCc_num(), no);
	}

	@When("^user Give The Card Type$")
	public void user_Give_The_Card_Type() throws Throwable {

		String t = File_Reader_Manager.getInstanceFRM().getInstanceCR().card_Type();
		dropDown("byIndex", pom.getInstanceBh().getCc_type(), t);

	}

	@When("^user Give The Validitity Details Of The Card$")
	public void user_Give_The_Validitity_Details_Of_The_Card() throws Throwable {

		String m = File_Reader_Manager.getInstanceFRM().getInstanceCR().e_Month();
		dropDown("byIndex", pom.getInstanceBh().getCc_exp_month(), m);
		String y = File_Reader_Manager.getInstanceFRM().getInstanceCR().e_Year();
		dropDown("byIndex", pom.getInstanceBh().getCc_exp_year(), y);
	}

	@When("^user Give The Card CVV Details$")
	public void user_Give_The_Card_CVV_Details() throws Throwable {

		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().cvv();
		userName(pom.getInstanceBh().getCc_cvv(), cvv);

	}

	@Then("^user Click The Book Now Button It Navigates To The Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {

		click(pom.getInstanceBh().getBook_now());
	}

	@Then("^user Click The Itinerary Button And It Navigates To The Itinerary Page$")
	public void user_Click_The_Itinerary_Button_And_It_Navigates_To_The_Itinerary_Page() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='my_itinerary']"))).click();
		;
		// scroll(pom.getInstanceIp().getMy_itinerary());
		// click(pom.getInstanceIp().getMy_itinerary());
	}
}
