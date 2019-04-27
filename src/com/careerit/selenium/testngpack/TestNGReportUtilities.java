package com.careerit.selenium.testngpack;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.Reporter;

public class TestNGReportUtilities {
	
	public static void reportLog(String logMessage){
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
		Calendar cal = Calendar.getInstance();
		String Timestamp = dateFormat.format(cal.getTime());
		String message =Timestamp+" : "+logMessage;
		
		Reporter.log(message);
	}

}
