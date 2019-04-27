  package com.careerit.selenium.screenshotdemo;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Automate_Screenshot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		try {
			//Initiate the WebDriver
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			
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
		} catch (Exception e) {
			
			File sourceFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourceFile, new File("./screenshots/flipkartTest2.jpg"));
			
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
