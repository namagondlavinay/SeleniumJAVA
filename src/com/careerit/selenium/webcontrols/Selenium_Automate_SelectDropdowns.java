package com.careerit.selenium.webcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Selenium_Automate_SelectDropdowns {
	
	public static void main(String[] args) {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.facebook.com/");
		
		WebElement dayDropdown=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement monthDropdown=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement yearDropdown=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select selectDay=new Select(dayDropdown);
		selectDay.selectByIndex(20);
		
		Select selectMonth=new Select(monthDropdown);
		selectMonth.selectByValue("8");
		
		Select selectYear=new Select(yearDropdown);
		selectYear.selectByVisibleText("2007");
		
		
		
		
		
	}

}
