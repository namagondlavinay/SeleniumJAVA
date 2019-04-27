package com.careerit.selenium.webcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Automate_Checkboxes {
	
	public static void main(String[] args) {
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.amazon.in");
		
		WebElement searchTextBox= driver.findElement(By.id("twotabsearchtextbox"));
		
		searchTextBox.sendKeys("Mobiles");
		
		WebElement searchButton= driver.findElement(By.xpath("//input[@value='Go']"));
		
		searchButton.click();
		
		
		
		WebElement getItTodayCheckbox= driver.findElement(By.xpath("//h4[text()='Delivery Day']/following::input[@type='checkbox'][1]"));
		
		System.out.println("Is Get It Today Checkbox selected or not ? "+getItTodayCheckbox.isSelected());
		
		getItTodayCheckbox.click();
		
		System.out.println("Is Get It Today Checkbox selected or not ? "+getItTodayCheckbox.isSelected());
		
	}

}
