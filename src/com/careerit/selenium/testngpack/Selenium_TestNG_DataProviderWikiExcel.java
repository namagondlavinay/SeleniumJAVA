package com.careerit.selenium.testngpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selenium_TestNG_DataProviderWikiExcel {
	
	/*@DataProvider (name="TestDataExcel")
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
	}*/
	
	@Test (dataProvider="ExcelTestData",dataProviderClass=Selenium_TestNG_DataProviderClass.class)
	public void wikiTestCase_Excel(String searchKey,String lang){
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.wikipedia.org/");
		
		//Locate web Element on a Web Page
		WebElement searchTextBox= driver.findElement(By.id("searchInput"));
		WebElement langDropdown= driver.findElement(By.id("searchLanguage"));
		WebElement searchButton=driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
		
		//Performing actions
		searchTextBox.sendKeys(searchKey);
		Select langSelectbox=new Select(langDropdown);
		langSelectbox.selectByValue(lang);
		searchButton.click();
		
		//Anticipating browser response
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
		
		//Validation
		String headerText= driver.findElement(By.id("firstHeading")).getText();
		
		System.out.println("Header Text = "+headerText);
		
		//Concluding test case
		driver.quit();
		
	}

}
