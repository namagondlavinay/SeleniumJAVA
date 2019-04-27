package com.careerit.selenium.popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Automate_IFrames {
	
	public static void main(String[] args) {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//using Frame Index
		//driver.switchTo().frame(0);
		
		//using Frame Id or Name
		//driver.switchTo().frame("iframeResult");
		
		//using Frame webelement
		WebElement iframeElement= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframeElement);
		
		WebElement tryItButton= driver.findElement(By.xpath("//button[text()='Try it']"));
		
		tryItButton.click();
		
		Alert alertBox = driver.switchTo().alert();
		
		System.out.println("Message inside Alert Box = "+alertBox.getText());
		
		//alertBox.accept();
		
		alertBox.dismiss();
		
		WebElement message=driver.findElement(By.xpath("//p[@id='demo']"));
		
		System.out.println(message.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement frameSize= driver.findElement(By.id("framesize"));
		
		System.out.println("Frame Window Size = "+ frameSize.getText());
		
	}

}
