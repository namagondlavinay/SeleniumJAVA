package com.careerit.selenium.browsernavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Automate_BrowserNavigationDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/automationTesting/difference-between-driver-close-and-driver-quit-command-in-selenium-webdriver.html");
		String Title = driver.getTitle();
		System.out.println(Title);
		if(Title.equals("Difference between driver.close() and driver.quit() in selenium webdriver")) {
			System.out.println("correct Title");
		}else {
			System.out.println("Incorrect Title");
		}
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Home")).click();
		
		
		//driver.findElement(By.id("search")).sendKeys("telugu songs");
		//driver.findElement(By.id("search-icon-legacy")).click();
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.flipkart.com/");
		
		//driver.navigate().to("https://www.flipkart.com/");
		
		//System.out.println("Page Source == "+driver.getPageSource());
		
		System.out.println("Page Title == "+driver.getTitle());
		
		WebElement closeLoginPopup= driver.findElement(By.xpath("//button[text()='✕']"));
		
		closeLoginPopup.click();
		
		WebElement searchBox= driver.findElement(By.xpath("//input[@name='q']"));
		
		searchBox.sendKeys("Mobiles");
		searchBox.sendKeys(Keys.ENTER);
		
		
		
		String parentWindow = driver.getWindowHandle();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='_1HmYoV _35HD7C'][2]/div[2]//a")));
		
		System.out.println("Page Title == "+driver.getTitle());
		
		System.out.println("URL before click on first product ==> "+driver.getCurrentUrl());
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		
		
		/*
		WebElement firstProduct= driver.findElement(By.xpath("//div[@class='_1HmYoV _35HD7C'][2]/div[2]//a"));
		
		System.out.println("Href attribute of anchor tag = "+ firstProduct.getAttribute("href"));
		
		firstProduct.click();
		
		for (String newWindow : driver.getWindowHandles()) {
			driver.switchTo().window(newWindow);
		} 
		
		System.out.println("URL of product details page of first product ==> "+driver.getCurrentUrl());
		
		System.out.println("Page Title == "+driver.getTitle());
		*/
		
	}

}
