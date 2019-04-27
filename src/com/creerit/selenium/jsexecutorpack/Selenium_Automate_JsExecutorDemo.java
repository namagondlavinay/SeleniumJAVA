package com.creerit.selenium.jsexecutorpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Automate_JsExecutorDemo {
	
	public static void main(String[] args) {
		
		//Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
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
		
		//firstProduct.click();
		
		WebElement productName=driver.findElement(By.xpath("//div[@class='_1HmYoV _35HD7C'][2]/div[2]//a//div[@class='_3wU53n']"));
		
		System.out.println("Name of the First Product "+productName.getText());
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy (0,document.body.scrollHeight)");
		
		//Horizontal scrolling
		//js.executeScript("window.scrollBy (500,0)");
		
		/*WebElement FifthproductName=driver.findElement(By.xpath("//div[@class='_1HmYoV _35HD7C'][2]/div[5]//a//div[@class='_3wU53n']"));
		
		System.out.println("Name of the Fourth Product "+FifthproductName.getText());*/
		
		WebElement address= driver.findElement(By.xpath("//span[text()='Registered Office Address:']/following::div[@class='_3aS5mM _2V3TtE']"));
		
		System.out.println("Address = "+address.getText());
		
	}

}
