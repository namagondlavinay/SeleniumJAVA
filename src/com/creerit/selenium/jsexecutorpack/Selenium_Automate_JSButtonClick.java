package com.creerit.selenium.jsexecutorpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Automate_JSButtonClick {
	
	public static void main(String[] args) {
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
		searchTextBox.sendKeys("India");
		Select langSelectbox=new Select(langDropdown);
		langSelectbox.selectByValue("en");
		
		//searchButton.click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", searchButton);
		
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
		//driver.quit();
	}

}
