package com.careerit.selenium.mousekeyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Automate_KeyboardWithoutElement {
	
	public static void main(String[] args) {
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement tryItButton= driver.findElement(By.xpath("//button[text()='Try it']"));
		
		tryItButton.click();
		
		Actions actionObj=new Actions(driver);
		actionObj.sendKeys(Keys.ESCAPE).build().perform();
		
	}

}
