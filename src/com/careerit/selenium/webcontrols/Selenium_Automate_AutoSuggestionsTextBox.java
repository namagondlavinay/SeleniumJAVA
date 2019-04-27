package com.careerit.selenium.webcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Automate_AutoSuggestionsTextBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.google.com/");
		
		WebElement searchBox= driver.findElement(By.xpath("//input[@name='q']"));
		
		searchBox.sendKeys("Selenium");
		
		Thread.sleep(2000);
		
		driver.wait(5000);
		
		searchBox.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		
		searchBox.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		
		searchBox.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		
		searchBox.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		
		searchBox.sendKeys(Keys.ENTER);
		
	}

}
