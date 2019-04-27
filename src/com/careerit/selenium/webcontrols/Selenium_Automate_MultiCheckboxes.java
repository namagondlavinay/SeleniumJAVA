package com.careerit.selenium.webcontrols;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Automate_MultiCheckboxes {
	
	public static void main(String[] args) throws InterruptedException {
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
		
		List<WebElement> checkboxes= driver.findElements(By.xpath("//h4[text()='Primary Camera Resolution']/following::ul[1]/div/li//input[@type='checkbox']"));
		
		int i=1;
		for (WebElement checkbox : checkboxes) {
			
			//WebDriverWait wait=new WebDriverWait(driver, 45);
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[text()='Primary Camera Resolution']/following::ul[1]/div/li["+i+"]//input[@type='checkbox']")));
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			
			//checkbox.click();
			
			Thread.sleep(7000);
			
			WebElement chkBox= driver.findElement(By.xpath("//h4[text()='Primary Camera Resolution']/following::ul[1]/div/li["+i+"]//input[@type='checkbox']"));
			chkBox.click();
			
			i=i+1;
			
		}
		
		
		
	}

}
