package com.careerit.selenium.webcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Automate_AutoSuggestionsTextBox2 {
	
	public static void main(String[] args) {
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.google.com/");
		
		WebElement searchBox= driver.findElement(By.xpath("//input[@name='q']"));
		
		searchBox.sendKeys("Selenium");
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='aajZCb']/ul[@class='erkvQe']/li[5]")));
		
		Actions actionsObj=new Actions(driver);
		
		actionsObj.moveToElement(driver.findElement(By.xpath("//div[@class='aajZCb']/ul[@class='erkvQe']/li[5]"))).click().build().perform();
		
		
	}

}
