package com.careerit.selenium.webcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Automate_TextBox {
	
	public static void main(String[] args) {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.facebook.com/");
		
		WebElement firstNameTextbox= driver.findElement(By.xpath("//input[@id='u_0_j']"));
		
		firstNameTextbox.clear();
		firstNameTextbox.sendKeys("Selenium");
		
		WebElement surNameTextbox= driver.findElement(By.xpath("//input[@id='u_0_l']"));
		
		surNameTextbox.clear();
		surNameTextbox.sendKeys("WebDriver");
		
		
		firstNameTextbox.clear();
		
		
		
		
	}

}
