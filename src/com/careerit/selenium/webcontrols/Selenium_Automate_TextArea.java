package com.careerit.selenium.webcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Automate_TextArea {
	
	public static void main(String[] args) {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_textarea");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement textArea= driver.findElement(By.xpath("//textarea[@rows='4']"));
		
		textArea.clear();
		textArea.sendKeys("Selenium automates browsers. That's it! What you do with that power is entirely up to you. Primarily, it is for automating web applications for testing purposes, but is certainly not limited to just that. Boring web-based administration tasks can (and should!) be automated as well");
	}

}
