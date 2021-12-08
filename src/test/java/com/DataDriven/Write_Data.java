package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	
	public static void main(String[] args) throws Throwable {
		File f=new File("C:\\Users\\PATAMA\\Desktop\\write data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet createSheet = w.createSheet("Credential");
		Row createRow = createSheet.createRow(0);
		Row createRow1 = createSheet.createRow(1);
		Row createRow2 = createSheet.createRow(2);
		Row createRow3 = createSheet.createRow(3);
		w.getSheet("Credential").getRow(0).createCell(0).setCellValue("Email");
		w.getSheet("Credential").getRow(0).createCell(1).setCellValue("Password");
		w.getSheet("Credential").getRow(1).createCell(0).setCellValue("Padma");
		w.getSheet("Credential").getRow(1).createCell(1).setCellValue("321");
		w.getSheet("Credential").getRow(2).createCell(0).setCellValue("starc");
		w.getSheet("Credential").getRow(2).createCell(1).setCellValue("678");
		w.getSheet("Credential").getRow(3).createCell(0).setCellValue("kala");
		w.getSheet("Credential").getRow(3).createCell(1).setCellValue("890");		
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		w.close();
		System.out.println("Write Successfully");
	}

}
