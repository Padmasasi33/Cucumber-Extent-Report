package com.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	// To read the data from .properties
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\PATAMA\\eclipse-workspace\\Maven_Oct30\\src\\main\\java\\com\\Properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();// --->null
		p.load(fis);

	}

	public String getUrl() throws Throwable {

		String url = p.getProperty("url");
		return url;
	}

	public String getUserName() throws Throwable {

		String username = p.getProperty("username");
		return username;

	}

	public String getPassword() throws Throwable {

		String password = p.getProperty("password");
		return password;

	}

	public String getLocation() throws Throwable {

		String location = p.getProperty("location");
		return location;

	}

	public String getHotel() {
		// TODO Auto-generated method stub
		String hotel = p.getProperty("hotel");
		return hotel;

	}

	public String room_Type() {
		// TODO Auto-generated method stub
		String type = p.getProperty("room_type");
		return type;

	}

	public String room_No() {
		// TODO Auto-generated method stub
		String number = p.getProperty("room_nos");
		return number;

	}
	public String date_In() {
		// TODO Auto-generated method stub
		String datein = p.getProperty("datein");
		return datein;

	}
	public String date_Out() {
		// TODO Auto-generated method stub
		String dateout = p.getProperty("dateout");
		return dateout;
	}
	public String adult() {
		// TODO Auto-generated method stub
		String adult = p.getProperty("adult");
		return adult;
	}
	public String child() {
		// TODO Auto-generated method stub
		String child = p.getProperty("child");
		return child;
	}
	public String first_Name() {
		// TODO Auto-generated method stub
		String fname = p.getProperty("firstname");
		return fname;
	}
	public String last_Name() {
		// TODO Auto-generated method stub
		String lname = p.getProperty("lastname");
		return lname;
	}
	public String address() {
		// TODO Auto-generated method stub
		String address= p.getProperty("address");
		return address;
	}
	public String card_Number() {
		// TODO Auto-generated method stub
		String cno= p.getProperty("ccNO");
		return cno;
	}
	public String card_Type() {
		// TODO Auto-generated method stub
		String ctype= p.getProperty("ccType");
		return ctype;
	}
	public String e_Month() {
		// TODO Auto-generated method stub
		String emonth= p.getProperty("exp_month");
		return emonth;
	}
	public String e_Year() {
		// TODO Auto-generated method stub
		String eyear= p.getProperty("exp_year");
		return eyear;
	}
	public String cvv() {
		// TODO Auto-generated method stub
		String cvv= p.getProperty("cvv");
		return cvv;
	}
	public String email() {
		// TODO Auto-generated method stub
		String email= p.getProperty("email");
		return email;
	}
	private String password() {
		// TODO Auto-generated method stub
		String pass = p.getProperty("password");
		return pass;

	}
	public String firstname() {
		// TODO Auto-generated method stub
		String fn = p.getProperty("fname");
		return fn;

	}
	public String lastname() {
		// TODO Auto-generated method stub
		String ln = p.getProperty("lname");
		return ln;

	}
	public String getdate() {
		// TODO Auto-generated method stub
		String dt = p.getProperty("date");
		return dt;

	}
	public String getmonth() {
		// TODO Auto-generated method stub
		String m = p.getProperty("month");
		return m;

	}
	public String getyears() {
		// TODO Auto-generated method stub
		String y = p.getProperty("years");
		return y;

	}
	public String getcompany() {
		// TODO Auto-generated method stub
		String c = p.getProperty("company");
		return c;

	}
	public String getadd() {
		// TODO Auto-generated method stub
		String ad = p.getProperty("add");
		return ad;

	}
	public String getStreet() {
		// TODO Auto-generated method stub
		String st = p.getProperty("street");
		return st;

	}
	public String getCity() {
		// TODO Auto-generated method stub
		String c = p.getProperty("city");
		return c;

	}
	public String getState() {
		// TODO Auto-generated method stub
		String s = p.getProperty("state");
		return s;

	}
	public String getpost() {
		// TODO Auto-generated method stub
		String po = p.getProperty("post");
		return po;

	}
	public String getDoor() {
		// TODO Auto-generated method stub
		String dr = p.getProperty("door");
		return dr;

	}
	public String getCountry() {
		// TODO Auto-generated method stub
		String ctry = p.getProperty("country");
		return ctry;

	}
	public String getPhone() {
		// TODO Auto-generated method stub
		String ph = p.getProperty("phone");
		return ph;

	}
	public String getMobile() {
		// TODO Auto-generated method stub
		String mble = p.getProperty("mobile");
		return mble;

	}
	public String getAlias() {
		// TODO Auto-generated method stub
		String a = p.getProperty("alias");
		return a;

	}
	
	
	



}
