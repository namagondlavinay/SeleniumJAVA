package com.careerit.selenium.testngpack;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class Selenium_TestNG_DataProviderClass {
	
	@DataProvider (name="ExcelTestData")
	public Object[][] testData() throws Exception{
		
		String testDataSheet="./resources/TestDataSheet.xlsx";
		FileInputStream file=new FileInputStream(testDataSheet);
		
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workBook.getSheetAt(0);
		
		int noOfRows= sheet.getPhysicalNumberOfRows();
		
		int noOfColumns=sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		System.out.println("No of Columns = "+noOfColumns);
		
		DataFormatter formatter=new DataFormatter();
		Object[][] excelData=new Object[noOfRows-1][noOfColumns];
		
		for (int row = 0; row < noOfRows-1; row++) {
			for (int column = 0; column < noOfColumns; column++) {
				if (formatter.formatCellValue(sheet.getRow(row+1).getCell(column)) != null){
					excelData[row][column]=formatter.formatCellValue(sheet.getRow(row+1).getCell(column));
				}
			}
			
		}
		workBook.close();
		file.close();
		
		return excelData;
	}

}
