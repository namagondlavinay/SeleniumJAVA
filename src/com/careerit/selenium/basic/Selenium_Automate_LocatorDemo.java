package com.careerit.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Automate_LocatorDemo {
	
	public static void main(String[] args) {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.amazon.in/");
		
		/*WebElement searchTextBox= driver.findElement(By.id("searchInput"));
		
		driver.findElement(By.name("search"));
		
		driver.findElement(By.linkText("Download for iOS on the App Store"));
		
		driver.findElement(By.partialLinkText("of available Wikipedia apps"));
		
		driver.findElement(By.className("pure-button pure-button-primary-progressive"));
		
		driver.findElement(By.tagName("button"));*/
		
		WebElement firstProduct= driver.findElement(By.xpath("//a[@class='a-link-normal center-image aok-block']/div/img[@alt='Amazon Echo']"));
		
		firstProduct.click();
		
		
		
		
		
		
		
		
		
	}

}
