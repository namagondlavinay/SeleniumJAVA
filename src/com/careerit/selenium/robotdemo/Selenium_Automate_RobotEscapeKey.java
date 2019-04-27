package com.careerit.selenium.robotdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Automate_RobotEscapeKey {
	
	public static void main(String[] args) throws AWTException {
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement tryItButton= driver.findElement(By.xpath("//button[text()='Try it']"));
		
		tryItButton.click();
		
		Robot objRobot=new Robot();
		
		objRobot.keyPress(KeyEvent.VK_ESCAPE);
		objRobot.keyRelease(KeyEvent.VK_ESCAPE);
		
		
	}

}
