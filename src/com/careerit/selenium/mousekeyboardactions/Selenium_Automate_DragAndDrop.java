package com.careerit.selenium.mousekeyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Automate_DragAndDrop {
	
	public static void main(String[] args) {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement sourceElement= driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions actionObj=new Actions(driver);
		
		actionObj.dragAndDrop(sourceElement, targetElement).build().perform();
		
		
	}

}
