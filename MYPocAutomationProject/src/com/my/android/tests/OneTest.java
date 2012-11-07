package com.my.android.tests;

import java.util.Collection;

import junit.framework.TestCase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;





public class OneTest extends TestCase {

private static final WebDriver IEDriverServer = null;




	public void testmyMobileFireFox() throws Exception {
		String BASE_URL = "http://m.cnn.com/";
		//Create new driver for Firefox (Web)
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit mobile cnn Site via Windows IE browser
		driver.get("http://www.cnn.com/");

		// Find the Log In button element by its name
		WebElement element = driver.findElement(By.partialLinkText("Log In"));

		// Click Log In button
		element.click();

		//Exit the test
		driver.quit();
		
		System.out.println("Done");
	}

//	public void testcnnMobileAndroid() throws Exception {
//		//Create new driver for Android Simulator
//		WebDriver driver = new AndroidDriver();
//
//		// And now use this to visit mobile cnn Site via Android
//		driver.get("http://m.cnn.com/");
//
//		// Find the Log In button element by its name
//		WebElement element = driver.findElement(By.name("app.headers.hboxHomeheader.btnlogoutHomeevent_"));
//
//		// Click Log In button
//		element.click();
//
//		//Exit the test
//		driver.quit();
//	}	

//public void testIeExplorer(){
//	
//	WebDriver driverIE = null ;
//	System.setProperty("webdriver.ie.driver","C:\\nativedriver\\myPocAutomationProject\\z ;
//	try{
//	driverIE = new InternetExplorerDriver() ;
//	}catch(Exception e){
//	System.out.println("catch");
//		e.printStackTrace() ;
//	}
//	
//	driverIE.get("http://www.google.com") ;
//	 
//	driverIE.switchTo().alert() ;
//	WebElement e = driverIE.findElement(By.id("Ask me later")); 
//	e.click();  // This action loads a modal window that is not handled 
//		
//			driverIE.findElement(By.partialLinkText("Log In"));
//
//System.out.println("Done");
	
	
	
	}
//}
