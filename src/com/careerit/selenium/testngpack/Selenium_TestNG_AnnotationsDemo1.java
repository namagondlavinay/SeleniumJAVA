package com.careerit.selenium.testngpack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium_TestNG_AnnotationsDemo1 {
	
	@BeforeTest
	public void loginToApplication(){
		System.out.println("Logging into Application");
	}
	
	@Test
	public void checkout_Testcase_01(){
		System.out.println("Execution of checkout_Testcase_01");
	}
	
	@Test
	public void checkout_Testcase_02(){
		System.out.println("Execution of checkout_Testcase_02");
	}
	
	@Test
	public void checkout_Testcase_03(){
		System.out.println("Execution of checkout_Testcase_03");
	}
	
	@Test
	public void checkout_Testcase_04(){
		System.out.println("Execution of checkout_Testcase_04");
	}
	
	@Test
	public void checkout_Testcase_05(){
		System.out.println("Execution of checkout_Testcase_05");
	}
	
	@AfterTest
	public void logOutFromApplication(){
		System.out.println("Logging out from application");
	}

}
