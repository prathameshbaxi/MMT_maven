package com.makemytrip;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Init {
	
		public  String browser;
		public  String url;
		public String firstname;
		public String lastname;
		public String mobileno;
		public String emailid;
	    static  WebDriver driver;

@BeforeSuite
public void setup() throws Exception {
	  
	  FileInputStream finput =	new FileInputStream("src\\test\\resources\\config.properties"); 
	  Properties prop = new Properties();
	  prop.load(finput);
	  
	  browser= prop.getProperty("browser");
	  furl = prop.getProperty("FURL");
	  firstname = prop.getProperty("firstname");
	  lastname = prop.getProperty("lastname");
	  mobileno = prop.getProperty("mobileno");
	  emailid = prop.getProperty("emailid");
	  
	  Reporter.log("Setting up "+browser+" with"+ url);
	  
	  finput.close();
	  
}
//D:\LTI_training\chromedrivernew
@BeforeTest
public void invoker() {
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	driver= new ChromeDriver();
	ChromeOptions chropt= new ChromeOptions();
	chropt.addArguments("disable notifications");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
//	  switch(browser) {
//	      case "chrome":
//		  {
//			    System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
//			    driver= new ChromeDriver();
//			    ChromeOptions chropt= new ChromeOptions();
//				chropt.addArguments("disable notifications");
//				driver.manage().window().maximize();
//				break;
//		  }
//		  
//		  case "firefox":
//		  {
//			    System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
//			    driver= new FirefoxDriver();
//				break;
//		  }
//	  
//	  }
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.get(url);
}



@AfterSuite
public void tearDown() throws Exception {
	Thread.sleep(2000);	//Change to implicit wait afterwards
	//driver.close();
}





}
