package com.careerit.selenium.testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selenium_TestNG_DataProviderWiki {
	
	@DataProvider (name="Wiki_TestData")
	public Object[][] testData(){
		
		Object[][] data={
							{"India","en"},
							{"Cricket","en"},
							{"USA","en"},
							{"Sport","en"},
							{"Hyderabad","en"}
							
						};
		
		return data;
		
	}
	
	@Test (dataProvider="Wiki_TestData")
	public void wikiTestCase(String searchKey,String language){
		
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
		langSelectbox.selectByValue(language);
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
