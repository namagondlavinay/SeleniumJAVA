package com.careerit.selenium.webcontrols;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Automate_FileUploadControl {
	
	public static void main(String[] args) {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://demos.devexpress.com/aspxfilemanageranduploaddemos/uploadcontrol/multifileselection.aspx");
		
		WebElement fileUploadControl= driver.findElement(By.xpath("//input[@id='ContentHolder_UploadControl_TextBox0_Input']"));
		
		File fileObj=new File("./resources/Penguins.jpg");
		
		
		fileUploadControl.sendKeys(fileObj.getAbsolutePath());
		
		WebElement uploadLink= driver.findElement(By.xpath("//a[text()='Upload']"));
		
		uploadLink.click();
		
		
	}

}
