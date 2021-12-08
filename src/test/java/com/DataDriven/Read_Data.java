package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static void main(String[] args) throws Throwable {

		//particular_Data();
		//System.out.println("All data");
		//all_Data();
		//particular_Row();
		particular_Column();

	}

	public static void particular_Data() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\PATAMA\\eclipse-workspace\\Maven_Oct30\\excel\\datadriven framework.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheet("Data");
		Row row = sheetAt.getRow(0);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int)numericCellValue;
			System.out.println(value);

		}
		
	}
	public static void all_Data() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\PATAMA\\eclipse-workspace\\Maven_Oct30\\excel\\datadriven framework.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheet("Data");
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j <numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				
			}
				else if(cellType.equals(CellType.NUMERIC))
				
				{
					double numericCellValue = cell.getNumericCellValue();
					int value = (int)numericCellValue;
					System.out.println(value);
					}
				}
			
		}
		

	}
	public static void particular_Row() throws Throwable {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\PATAMA\\eclipse-workspace\\Maven_Oct30\\excel\\datadriven framework.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheet("Data");
		Row row = sheetAt.getRow(1);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < numberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			
		}
			else if(cellType.equals(CellType.NUMERIC))
			
			{
				double numericCellValue = cell.getNumericCellValue();
				int value = (int)numericCellValue;
				System.out.println(value);
				}
			
			
		}

	}
	
	public static void particular_Column() throws Throwable {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\PATAMA\\eclipse-workspace\\Maven_Oct30\\excel\\datadriven framework.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheet("Data");
		int numberOfCells = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfCells; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(0);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			
		}
			else if(cellType.equals(CellType.NUMERIC))
			
			{
				double numericCellValue = cell.getNumericCellValue();
				int value=(int) numericCellValue;
				System.out.println(value);

	}
		}
	}
}
		

	


