package com.Helper;

public class File_Reader_Manager {

	//Constructor as private
	//static method
	//Non static method
	private File_Reader_Manager()
	{
		
	}
	
	public static File_Reader_Manager getInstanceFRM() {
	File_Reader_Manager frm=new File_Reader_Manager();
	return frm;

	}
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		// TODO Auto-generated method stub
		Configuration_Reader cr=new Configuration_Reader();
		return cr;

	}
	
}
