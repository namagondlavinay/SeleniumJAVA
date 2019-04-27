package com.careerit.selenium.mousekeyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Automate_MouseHover {
	
	public static void main(String[] args) {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.amazon.in/");
		
		WebElement signInlink= driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"));
		
		Actions actionObj=new Actions(driver);
		actionObj.moveToElement(signInlink).build().perform();
		
		WebElement yourOrderslink=driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']"));
		
		yourOrderslink.click();
		
		
		
	}

}
