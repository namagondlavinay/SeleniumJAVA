package com.careerit.selenium.popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_Automate_AlertBox {
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		WebDriver driver =new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		//Navigate to a Web Site
		driver.get("http:\\www.facebook.com");

        WebElement element1 = driver.findElement(By.id("email"));
        element1.sendKeys("harshachowdarygolla@gmail.com");

        WebElement element2 = driver.findElement(By.id("pass"));
        element2.sendKeys("9491290886");
        WebElement element3 = driver.findElement(By.id("u_0_2"));
        element3.click();
        /*System.out.println("Login");
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement tryItButton= driver.findElement(By.xpath("//button[text()='Try it']"));
		
		tryItButton.click();
		*/
		
	/*	Alert alertBox = driver.switchTo().alert();
		
		System.out.println("Message inside Alert Box = "+alertBox.getText());
		
		alertBox.accept();
		
		alertBox.dismiss();
		*/
		driver.close();
		
		//WebElement message=driver.findElement(By.xpath("//p[@id='demo']"));
		
		//System.out.println(message.getText());
		
	}

}
