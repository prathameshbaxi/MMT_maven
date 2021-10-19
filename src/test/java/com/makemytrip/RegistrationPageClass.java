package com.makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegistrationPageClass {
   
	static WebElement webelem;
	static By loginbtn = By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]");
	
	public static WebElement Loginbtn(WebDriver driver) {
		webelem= driver.findElement(loginbtn);
		return webelem;
	
	}
}

