package com.careerit.selenium.ddtExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Automate_WriteDataToExcel {
	
	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) throws Exception {
		

		String filePath="./resources/TestDataSheet.xlsx";
		FileInputStream file=new FileInputStream(filePath);
		
		XSSFWorkbook objWorkbook=new XSSFWorkbook(file);
		XSSFSheet sheet=objWorkbook.getSheetAt(0);
		
		DataFormatter formatterObj=new DataFormatter();
		String searchKeyword= formatterObj.formatCellValue(sheet.getRow(1).getCell(0));
		String language= formatterObj.formatCellValue(sheet.getRow(1).getCell(1));
		
		System.out.println("Search Keyword from Excel = "+searchKeyword);
		System.out.println("Language from Excel = "+language);
				
		
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
		searchTextBox.sendKeys(searchKeyword);
		Select langSelectbox=new Select(langDropdown);
		langSelectbox.selectByValue(language);
		searchButton.click();
		
		//Anticipating browser response
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
		
		//Validation
		String headerText= driver.findElement(By.id("firstHeading")).getText();
		
		XSSFRow row= sheet.getRow(1);
		
		XSSFCell cell = null;
		
		if (cell==null) {
			cell=row.createCell(2);
			cell.setCellValue(headerText);
		}else{
			cell.setCellValue(headerText);
		}
		
		FileOutputStream fileOutput=new FileOutputStream(filePath);
		objWorkbook.write(fileOutput);
		
		
		if (headerText.equalsIgnoreCase("India")) {
			System.out.println("Test Passed - Header Text has been displayed as expected");
		}else{
			System.out.println("Test Failed - Header Text is not matching with Expected");
		}
		
		//Concluding test case
		driver.quit();
		
		objWorkbook.close();
		file.close();
		fileOutput.close();
	}

}
