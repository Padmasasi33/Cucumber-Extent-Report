package com.Maven.Maven_Oct30;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Helper.File_Reader_Manager;
import com.Pom.Book_Hotel;
import com.Pom.Itineray_Page;
import com.Pom.Login_Page;
import com.Pom.Search_Hotels;
import com.sdp.Page_Object_Manager;

public class Runner_Class extends Base_Class {
	
	public static WebDriver driver=Base_Class.getBrowser("chrome");
	/*public static Login_Page lp=new Login_Page(driver);
	public static Search_Hotels sh=new Search_Hotels(driver);
	public static Book_Hotel bh=new Book_Hotel(driver);
	public static Itineray_Page ip=new Itineray_Page(driver);*/
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {	
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);
		//String name = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUserName();
		//userName(pom.getInstanceLp().getUsername(),name);
		String pass = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();		


		click(pom.getInstanceLp().getLogin());
		thread_Sleep(3000);
		String location = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();
		dropDown("byValue",pom.getInstanceSh().getLocation(), location);
		String hotel = File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotel();
		dropDown("byValue",pom.getInstanceSh().getLocation(), hotel);
		String rtype = File_Reader_Manager.getInstanceFRM().getInstanceCR().room_Type();
		dropDown("byValue",pom.getInstanceSh().getLocation(), rtype);
		String rno = File_Reader_Manager.getInstanceFRM().getInstanceCR().room_No();
		dropDown("byValue",pom.getInstanceSh().getLocation(), rno);
		String din = File_Reader_Manager.getInstanceFRM().getInstanceCR().date_In();
		dropDown("byValue",pom.getInstanceSh().getLocation(), din);
		String dout = File_Reader_Manager.getInstanceFRM().getInstanceCR().date_Out();
		dropDown("byValue",pom.getInstanceSh().getLocation(), dout);
		String adult = File_Reader_Manager.getInstanceFRM().getInstanceCR().adult();
		dropDown("byValue",pom.getInstanceSh().getLocation(), adult);
		String child = File_Reader_Manager.getInstanceFRM().getInstanceCR().child();
		dropDown("byValue",pom.getInstanceSh().getLocation(), child);
		click(pom.getInstanceSh().getSearch());
		thread_Sleep(3000);
		click(pom.getInstanceSh().getRadio());
		click(pom.getInstanceSh().getCon());
		thread_Sleep(3000);
		String fname = File_Reader_Manager.getInstanceFRM().getInstanceCR().first_Name();
		dropDown("byValue",pom.getInstanceSh().getLocation(), fname);
		String lname = File_Reader_Manager.getInstanceFRM().getInstanceCR().last_Name();
		dropDown("byValue",pom.getInstanceSh().getLocation(), lname);
		String adres = File_Reader_Manager.getInstanceFRM().getInstanceCR().address();
		dropDown("byValue",pom.getInstanceSh().getLocation(), adres);
		String no = File_Reader_Manager.getInstanceFRM().getInstanceCR().card_Number();
		dropDown("byValue",pom.getInstanceSh().getLocation(), no);
		String t = File_Reader_Manager.getInstanceFRM().getInstanceCR().card_Type();
		dropDown("byValue",pom.getInstanceSh().getLocation(), t);
		String m = File_Reader_Manager.getInstanceFRM().getInstanceCR().e_Month();
		dropDown("byValue",pom.getInstanceSh().getLocation(), m);
		String y = File_Reader_Manager.getInstanceFRM().getInstanceCR().e_Year();
		dropDown("byValue",pom.getInstanceSh().getLocation(), y);
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().cvv();
		dropDown("byValue",pom.getInstanceSh().getLocation(), cvv);		
		click(pom.getInstanceBh().getBook_now());
		thread_Sleep(3000);
		scroll(pom.getInstanceIp().getMy_itinerary());
		click(pom.getInstanceIp().getMy_itinerary());
		thread_Sleep(3000);
		takeScreenShot();	
		
		/*getUrl("https://adactinhotelapp.com/HotelAppBuild2/");
		userName(pom.getInstanceLp().getUsername(),"Padmasasi");
		userName(pom.getInstanceLp().getPassword(),"654321");
		click(pom.getInstanceLp().getLogin());
		thread_Sleep(3000);
		dropDown("byValue",pom.getInstanceSh().getLocation(), "London");
		dropDown("byIndex",pom.getInstanceSh().getHotels(),"3");
		dropDown("byValue", pom.getInstanceSh().getRoom_Type(), "Double");
		dropDown("byValue", pom.getInstanceSh().getRoom_nos(), "3");
		passWord(pom.getInstanceSh().getDatepick_in(), "6/11/2021");
		passWord(pom.getInstanceSh().getDatepick_out(), "10/11/2021");
		dropDown("byIndex", pom.getInstanceSh().getAdult_room(), "2");
		dropDown("byIndex", pom.getInstanceSh().getChild_room(), "2");
		click(pom.getInstanceSh().getSearch());
		thread_Sleep(3000);
		click(pom.getInstanceSh().getRadio());
		click(pom.getInstanceSh().getCon());
		thread_Sleep(3000);
		userName(pom.getInstanceBh().getFirstname(),"Padmavathi");
		userName(pom.getInstanceBh().getLastname(), "Chokkalingam");
		userName(pom.getInstanceBh().getAddress(), "Los Agenls");
		passWord(pom.getInstanceBh().getCc_num(),"1234567890123456" );
		dropDown("byIndex", pom.getInstanceBh().getCc_type(), "2");
		dropDown("byIndex",pom.getInstanceBh().getCc_exp_month() , "5");
		dropDown("byValue",pom.getInstanceBh().getCc_exp_year() , "2022");
		passWord(pom.getInstanceBh().getCc_cvv(), "369");
		click(pom.getInstanceBh().getBook_now());
		thread_Sleep(3000);
		scroll(pom.getInstanceIp().getMy_itinerary());
		click(pom.getInstanceIp().getMy_itinerary());
		thread_Sleep(3000);
		takeScreenShot();	*/
		

		
		
		
		
		/*getUrl("https://adactinhotelapp.com/HotelAppBuild2/");		
		userName(lp.getUsername(), "Padmasasi");
		passWord(lp.getPassword(), "654321");
		click(lp.getLogin());
		thread_Sleep(4000);		
		dropDown("byValue", sh.getLocation(), "London");
		dropDown("byIndex", sh.getHotels(), "3");
		dropDown("byValue", sh.getRoom_Type(), "Double");
		dropDown("byValue", sh.getRoom_nos(), "3");
		passWord(sh.getDatepick_in(), "6/11/2021");
		passWord(sh.getDatepick_out(), "10/11/2021");	
		dropDown("byIndex", sh.getAdult_room(), "2");
		dropDown("byIndex", sh.getChild_room(), "2");
		click(sh.getSearch());
		thread_Sleep(3000);
		click(sh.getRadio());
		click(sh.getCon());
		thread_Sleep(3000);		
		userName(bh.getFirstname(), "Padmavathi");
		userName(bh.getLastname(), "chokkalingam");
		userName(bh.getAddress(), "Los Agenls" +  "USA");
		passWord(bh.getCc_num(),"1234567890123456" );
		dropDown("byIndex", bh.getCc_type(), "2");
		dropDown("byIndex",bh.getCc_exp_month() , "5");
		dropDown("byValue",bh.getCc_exp_year() , "2022");
		passWord(bh.getCc_cvv(), "369");
		click(bh.getBook_now());
		thread_Sleep(5000);			
		scroll(ip.getMy_itinerary());
		click(ip.getMy_itinerary());
		thread_Sleep(3000);
		takeScreenShot();*/

	}}


