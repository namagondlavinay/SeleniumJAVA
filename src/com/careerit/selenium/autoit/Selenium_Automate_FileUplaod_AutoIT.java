package com.careerit.selenium.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Automate_FileUplaod_AutoIT {
	
	public static void main(String[] args) throws Exception {
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_create");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement tryItButton= driver.findElement(By.xpath("//button[text()='Try it']"));
		
		tryItButton.click();
		
		WebElement chooseFileButton= driver.findElement(By.xpath("//input[@type='file']"));
		
		chooseFileButton.click();
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("./autoitscripts/FileUploadTest.exe");
	}

}
