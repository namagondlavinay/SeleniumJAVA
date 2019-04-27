package com.careerit.selenium.testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Selenium_TestNG_Groups1 {
	
	@Test (groups={"RegressionTest"})
	public void wikiPedia_TestCase_01(){
		WebDriver driver = null;
		try {
			TestNGReportUtilities.reportLog("Launching Chrome browser with - https://www.wikipedia.org/");
			//Initiate the WebDriver
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//Navigate to a Web Site
			driver.get("https://www.wikipedia.org/");
			//Locate web Element on a Web Page
			WebElement searchTextBox= driver.findElement(By.id("searchInput"));
			WebElement langDropdown= driver.findElement(By.id("searchLanguage"));
			WebElement searchButton=driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
			TestNGReportUtilities.reportLog("Enter India into Search Text Box");
			//Performing actions
			searchTextBox.sendKeys("India");
			Select langSelectbox=new Select(langDropdown);
			TestNGReportUtilities.reportLog("Selecting English from Language dropdown");
			langSelectbox.selectByValue("en");
			TestNGReportUtilities.reportLog("Clicking on Search icon");
			searchButton.click();
			//Anticipating browser response
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
			//Validation
			String headerText= driver.findElement(By.id("firstHeading")).getText();
			TestNGReportUtilities.reportLog("Reading header text from the content page - "+headerText);
			System.out.println("Header Text = "+headerText);
			driver.close();
			TestNGReportUtilities.reportLog("Closing the browser");
		} catch (Exception e) {
			driver.close();
			e.printStackTrace();
		}
	}
	
	@Test (groups={"RegressionTest"})
	public void wikiPedia_TestCase_02(){
		WebDriver driver = null;
		try {
			TestNGReportUtilities.reportLog("Launching Chrome browser with - https://www.wikipedia.org/");
			//Initiate the WebDriver
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//Navigate to a Web Site
			driver.get("https://www.wikipedia.org/");
			//Locate web Element on a Web Page
			WebElement searchTextBox= driver.findElement(By.id("searchInput"));
			WebElement langDropdown= driver.findElement(By.id("searchLanguage"));
			WebElement searchButton=driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
			TestNGReportUtilities.reportLog("Enter USA into Search Text Box");
			//Performing actions
			searchTextBox.sendKeys("USA");
			Select langSelectbox=new Select(langDropdown);
			TestNGReportUtilities.reportLog("Selecting English from Language dropdown");
			langSelectbox.selectByValue("en");
			TestNGReportUtilities.reportLog("Clicking on Search icon");
			searchButton.click();
			
			//Anticipating browser response
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
			//Validation
			String headerText= driver.findElement(By.id("firstHeading")).getText();
			TestNGReportUtilities.reportLog("Reading header text from the content page - "+headerText);
			System.out.println("Header Text = "+headerText);
			driver.close();
			TestNGReportUtilities.reportLog("Closing the browser");
		} catch (Exception e) {
			driver.close();
			e.printStackTrace();
		}
	}
	
	@Test (groups={"SmokeTest","RegressionTest"})
	public void wikiPedia_TestCase_03() throws Exception{
		WebDriver driver = null;
		try {
			TestNGReportUtilities.reportLog("Launching Chrome browser with - https://www.wikipedia.org/");
			//Initiate the WebDriver
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//Navigate to a Web Site
			driver.get("https://www.wikipedia.org/");
			//Locate web Element on a Web Page
			WebElement searchTextBox= driver.findElement(By.id("searchInput"));
			WebElement langDropdown= driver.findElement(By.id("searchLanguage"));
			WebElement searchButton=driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive-ajay']"));
			TestNGReportUtilities.reportLog("Enter Cricket into Search Text Box");
			//Performing actions
			searchTextBox.sendKeys("Cricket");
			Select langSelectbox=new Select(langDropdown);
			TestNGReportUtilities.reportLog("Selecting English from Language dropdown");
			langSelectbox.selectByValue("en");
			TestNGReportUtilities.reportLog("Clicking on Search icon");
			searchButton.click();
			//Anticipating browser response
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
			//Validation
			String headerText= driver.findElement(By.id("firstHeading")).getText();
			TestNGReportUtilities.reportLog("Reading header text from the content page - "+headerText);
			System.out.println("Header Text = "+headerText);
			driver.close();
			TestNGReportUtilities.reportLog("Closing the browser");
		} catch (Exception e) {
			driver.close();
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	@Test (groups={"RegressionTest","SmokeTest"})
	public void wikiPedia_TestCase_04(){
		WebDriver driver = null;
		try {
			TestNGReportUtilities.reportLog("Launching Chrome browser with - https://www.wikipedia.org/");
			//Initiate the WebDriver
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//Navigate to a Web Site
			driver.get("https://www.wikipedia.org/");
			//Locate web Element on a Web Page
			WebElement searchTextBox= driver.findElement(By.id("searchInput"));
			WebElement langDropdown= driver.findElement(By.id("searchLanguage"));
			WebElement searchButton=driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
			TestNGReportUtilities.reportLog("Enter Automation into Search Text Box");
			//Performing actions
			searchTextBox.sendKeys("Automation");
			Select langSelectbox=new Select(langDropdown);
			TestNGReportUtilities.reportLog("Selecting English from Language dropdown");
			langSelectbox.selectByValue("en");
			TestNGReportUtilities.reportLog("Clicking on Search icon");
			searchButton.click();
			//Anticipating browser response
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
			//Validation
			String headerText= driver.findElement(By.id("firstHeading")).getText();
			TestNGReportUtilities.reportLog("Reading header text from the content page - "+headerText);
			System.out.println("Header Text = "+headerText);
			driver.close();
			TestNGReportUtilities.reportLog("Closing the browser");
		} catch (Exception e) {
			driver.close();
			e.printStackTrace();
		}
	}
	
	@Test (groups={"RegressionTest"})
	public void wikiPedia_TestCase_05(){
		WebDriver driver = null;
		try {
			TestNGReportUtilities.reportLog("Launching Chrome browser with - https://www.wikipedia.org/");
			//Initiate the WebDriver
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//Navigate to a Web Site
			driver.get("https://www.wikipedia.org/");
			//Locate web Element on a Web Page
			WebElement searchTextBox= driver.findElement(By.id("searchInput"));
			WebElement langDropdown= driver.findElement(By.id("searchLanguage"));
			WebElement searchButton=driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
			TestNGReportUtilities.reportLog("Enter Selenium WebDriver into Search Text Box");
			//Performing actions
			searchTextBox.sendKeys("Selenium WebDriver");
			Select langSelectbox=new Select(langDropdown);
			TestNGReportUtilities.reportLog("Selecting English from Language dropdown");
			langSelectbox.selectByValue("en");
			TestNGReportUtilities.reportLog("Clicking on Search icon");
			searchButton.click();
			//Anticipating browser response
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
			//Validation
			String headerText= driver.findElement(By.id("firstHeading")).getText();
			TestNGReportUtilities.reportLog("Reading header text from the content page - "+headerText);
			System.out.println("Header Text = "+headerText);
			driver.close();
			TestNGReportUtilities.reportLog("Closing the browser");
		} catch (Exception e) {
			driver.close();
			e.printStackTrace();
		}
	}
	@Test (groups={"RegressionTest2"})
	public void wikiPedia_TestCase_06(){
		WebDriver driver = null;
		try {
			//Initiate the WebDriver
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//Navigate to a Web Site
			driver.get("https://www.wikipedia.org/");
			//Locate web Element on a Web Page
			WebElement searchTextBox= driver.findElement(By.id("searchInput"));
			WebElement langDropdown= driver.findElement(By.id("searchLanguage"));
			WebElement searchButton=driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
			//Performing actions
			searchTextBox.sendKeys("San Fansisco");
			Select langSelectbox=new Select(langDropdown);
			langSelectbox.selectByValue("en");
			searchButton.click();
			//Anticipating browser response
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
			//Validation
			String headerText= driver.findElement(By.id("firstHeading")).getText();
			System.out.println("Header Text = "+headerText);
			driver.close();
		} catch (Exception e) {
			driver.close();
			e.printStackTrace();
		}
	}
	@Test (groups={"RegressionTest2"})
	public void wikiPedia_TestCase_07(){
		WebDriver driver = null;
		try {
			//Initiate the WebDriver
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//Navigate to a Web Site
			driver.get("https://www.wikipedia.org/");
			//Locate web Element on a Web Page
			WebElement searchTextBox= driver.findElement(By.id("searchInput"));
			WebElement langDropdown= driver.findElement(By.id("searchLanguage"));
			WebElement searchButton=driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
			//Performing actions
			searchTextBox.sendKeys("Australia");
			Select langSelectbox=new Select(langDropdown);
			langSelectbox.selectByValue("en");
			searchButton.click();
			//Anticipating browser response
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
			//Validation
			String headerText= driver.findElement(By.id("firstHeading")).getText();
			System.out.println("Header Text = "+headerText);
			driver.close();
		} catch (Exception e) {
			driver.close();
			e.printStackTrace();
		}
	}

}
