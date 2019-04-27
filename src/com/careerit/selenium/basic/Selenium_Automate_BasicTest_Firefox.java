package com.careerit.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Automate_BasicTest_Firefox {
	
	public static void main(String[] args) {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");		
		WebDriver driver= new FirefoxDriver();
		
		//Navigate to a Web Site
		driver.get("https://www.wikipedia.org/");
		
		//Locate web Element on a Web Page
		WebElement searchTextBox= driver.findElement(By.id("searchInput"));
		WebElement langDropdown= driver.findElement(By.id("searchLanguage"));
		WebElement searchButton=driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
		
		//Performing actions
		searchTextBox.sendKeys("India");
		Select langSelectbox=new Select(langDropdown);
		langSelectbox.selectByValue("en");
		searchButton.click();
		
		//Anticipating browser response
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
		
		//Validation
		String headerText= driver.findElement(By.id("firstHeading")).getText();
		if (headerText.equalsIgnoreCase("India")) {
			System.out.println("Test Passed - Header Text has been displayed as expected");
		}else{
			System.out.println("Test Failed - Header Text is not matching with Expected");
		}
		
		//Concluding test case
		driver.quit();
		
	}

}
