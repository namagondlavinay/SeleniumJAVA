package com.careerit.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Automate_CssSelectorLocator {
	
	public static void main(String[] args) {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.google.com/");
		
		WebElement searchTextbox= driver.findElement(By.cssSelector("input[name='q']"));
		
		searchTextbox.sendKeys("Selenium WebDriver");
		searchTextbox.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("div#search>div div.srg div.g:nth-of-type(4)")).click();
		
		
	}

}
