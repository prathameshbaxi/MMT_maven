package com.makemytrip;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.makemytrip.FlightPageClass;


public class FlightTest extends Init{
	String currentHandle;
	String actual;
	
	
	
	@Test(priority = 0)
	public void loginbtnclick() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	FlightPageClass.Loginbtn(driver).click();
  }
	
	@Test(priority = 1)
	public void searchbtnclick() throws Exception {
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/label/p[1]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[5]/div[6]/div")).click();
		
		FlightPageClass.Searchbtn(driver).click();
		
  }
	@Test(priority = 2)
	public void viewpricesbtnclick() throws Exception {
		
		try{
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div/div[3]/button")).click();
			 //Since, no exception, so element is present
			}
			catch(NoSuchElementException e){
			 //Element is not present
				
			}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FlightPageClass.Veiwpricebtn(driver).click();
		
		
		
	}
	@Test(priority = 3)
	public void booknowbtnclick() {
		 currentHandle = driver.getWindowHandle();
		FlightPageClass.Booknowbtn(driver).click();
	
	}
	
	@Test(priority = 4)
	public void yesradiobtnclick() {
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	

	}
	
	
	@SuppressWarnings("deprecation")
	@Test(priority = 9)
	public void reviewcontinuebtnclick() throws Exception {
		String url2 = driver.getCurrentUrl();
		
		if(url2.startsWith("https://www.makemytrip.com/flight/review/")) {

			Reporter.log("Review Booking Page Appeared");
			driver.quit();
		}
		else if(url2.startsWith("https://www.makemytrip.com/flight/reviewDetails/")){
			System.out.println("COntinue your booking page");

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.cssSelector("div[class='componentContainer appendTop15'] div:nth-child(1) label:nth-child(1) span:nth-child(2)")).click();
		
			
		
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[normalize-space()='+ ADD NEW ADULT']")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@placeholder='First & Middle Name']")).sendKeys(firstname);
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);
			driver.findElement(By.xpath("//div[@class='selectTab ']//label[1]")).click();
			driver.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys(mobileno);
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(emailid);
			driver.findElement(By.xpath("//div[@class='emailIds-dropdown']")).click();
			//driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();	
	}
	}
	@Test(priority = 10)
	public void continuebtnclick() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();	
		
	}
	
	//user details --> Convert to one group later
	@Test(enabled = false)
	public void firstnamefill() {
		FlightPageClass.Firstname(driver).sendKeys(firstname);
		Reporter.log("First Name");
	}
	@Test(enabled = false)
	public void lastnamefill() {
		FlightPageClass.Lastname(driver).sendKeys(lastname);
		Reporter.log("Last Name");
	}
	
	@Test(enabled = false)
	public void gendrelabelclick() {
		FlightPageClass.Gendre(driver).click();
		Reporter.log("Click on Gender Btn");
	}
	
	@Test(enabled = false)
	public void mobilenofill() {
		FlightPageClass.Mobileno(driver).sendKeys(mobileno);
		Reporter.log("Mobile No.");
	}
	
	@Test(enabled = false)
	public void emailidfill() {
		FlightPageClass.Emailid(driver).sendKeys(emailid);
		driver.findElement(By.xpath("//*[@id='Email']/div/div/div")).click();
	}
	//^User details filling block ends
	
	@Test(enabled = false)
	public void travellercontinuebtnclick() {
		FlightPageClass.Travellercontinuebtn(driver).click();
	}
	
	@Test(priority = 11)
	public void confirmbtnclick() throws Exception { //inside review details block
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[normalize-space()='CONFIRM']")).click();
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);			
		//driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Please']")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Please']")).click();
			
			
		
	
//		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[normalize-space()='Proceed to pay']")).click();
	}
	
	@Test(priority = 12)
	public void yespleaseandcontinue() {
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Please']")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		FlightPageClass.Proceedtopaybtn(driver).click();
	}
	
	@Test(priority = 13)
	public void proceedtopaybtnclick() {
	
		FlightPageClass.Proceedtopaybtn(driver).click();
	}
	
}
