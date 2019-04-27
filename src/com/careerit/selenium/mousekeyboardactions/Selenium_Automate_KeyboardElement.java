package com.careerit.selenium.mousekeyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Automate_KeyboardElement {
	
	public static void main(String[] args) {
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.facebook.com/");
		
		WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
		
		firstName.sendKeys("First Name");
		firstName.sendKeys(Keys.TAB);
		
		Actions actionObj=new Actions(driver);
		actionObj.sendKeys("Sur Name").build().perform();
		
	}

}
