package com.careerit.selenium.webcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Automate_RadioButtons {
	
	public static void main(String[] args) {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.facebook.com/");
		
		WebElement femaleRadioButton= driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		
		System.out.println("Is Female Radio button selected or not ? "+femaleRadioButton.isSelected());
		
		femaleRadioButton.click();
		
		System.out.println("Is Female Radio button selected or not ? "+femaleRadioButton.isSelected());
	}

}
