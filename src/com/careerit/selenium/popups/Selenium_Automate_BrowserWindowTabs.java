package com.careerit.selenium.popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Automate_BrowserWindowTabs {
	
	public static void main(String[] args) {
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.flipkart.com/");
		
		WebElement closeLoginPopup= driver.findElement(By.xpath("//button[text()='✕']"));
		
		closeLoginPopup.click();
		
		WebElement searchBox= driver.findElement(By.xpath("//input[@name='q']"));
		
		searchBox.sendKeys("Mobiles");
		searchBox.sendKeys(Keys.ENTER);
		
		String parentWindow = driver.getWindowHandle();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='_1HmYoV _35HD7C'][2]/div[2]//a")));
		
		WebElement firstProduct= driver.findElement(By.xpath("//div[@class='_1HmYoV _35HD7C'][2]/div[2]//a"));
		
		firstProduct.click();
		
		Set<String> allBrowserTabs= driver.getWindowHandles();
		
		for (String newWidow : allBrowserTabs) {
			if (!newWidow.equals(parentWindow)) {
				driver.switchTo().window(newWidow);
			}
		}
		
		WebElement productName= driver.findElement(By.xpath("//span[@class='_35KyD6']"));
		
		System.out.println("Product Name in New Tab = "+productName.getText());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		
		WebElement secondProduct=driver.findElement(By.xpath("//div[@class='_1HmYoV _35HD7C'][2]/div[3]//a"));
		
		secondProduct.click();
		
		Set<String> allBrowserTabs2= driver.getWindowHandles();
		
		for (String newWidow : allBrowserTabs2) {
			if (!newWidow.equals(parentWindow)) {
				driver.switchTo().window(newWidow);
			}
		}
		
		WebElement secondProductName= driver.findElement(By.xpath("//span[@class='_35KyD6']"));
		
		System.out.println("Second Product Name in New Tab = "+secondProductName.getText());
		
		
		
		
		
		
		
	}

}
