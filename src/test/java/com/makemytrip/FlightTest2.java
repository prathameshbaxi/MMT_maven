package com.makemytrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FlightTest2 {

	WebDriver driver;
	
	
	@Test
	public void reviewpage(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\LTI_training\\chromedrivernew\\chromedriver.exe");
		driver= new ChromeDriver();
		ChromeOptions chropt= new ChromeOptions();
		chropt.addArguments("disable notifications");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("URL=https://www.makemytrip.com/flights/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='SW']/div[1]/div[1]/ul/li[3]")).click(); //loginbtn click
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/label/p[1]")).click(); 
		//driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[4]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[5]/div[6]/div")).click();
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/p/a")).click(); //searchbtnclick
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
	}
	
}
