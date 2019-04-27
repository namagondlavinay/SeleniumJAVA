package com.careerit.selenium.seleniumgriddemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Selenium_Automate_SeleniumGrid {
	
	@Test
	public void testNGBasicTest() throws Exception{
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		
		
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
