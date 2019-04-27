package com.careerit.selenium.testngpack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlPackage;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class RunTestNGProgramatically {
	
	public static void main(String[] args) {
		
		XmlSuite suite = new XmlSuite();
		suite.setName("CareerIT Automation Test");
		suite.setParallel("methods");
		suite.setThreadCount(5);
		
		
		XmlTest test = new XmlTest(suite);
		test.setName("CareerIT Regression Test");
		
		
		/*List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("com.careerit.selenium.testngpack.Selenium_TestNG_ReportsDemo"));
		test.setXmlClasses(classes);*/
		//Map<String,String> parameters=new HashedMap<String,String>();

		//parameters.put("environment", "DEV");
		//parameters.put("browser", "Firefox");
		
		String[] groupArray={"RegressionTest","SmokeTest"};
		
		List<String> testGroupList = new ArrayList<String>();
		testGroupList.addAll(Arrays.asList(groupArray));

		test.setIncludedGroups(testGroupList);
		//test.setParameters(parameters);
		
		String packages="com.careerit.selenium.testngpack";
		List<XmlPackage> testPackageList = new ArrayList<XmlPackage>();
		testPackageList.add(new XmlPackage(packages));
		//  testPackageList.addAll(Arrays.asList(packages.split(",")));
		test.setPackages(testPackageList);
		
				
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		
		System.out.println(suite.toXml().toString());
		
		TestNG tng = new TestNG();
		
		tng.setXmlSuites(suites);
		tng.run();
		
	}

}
