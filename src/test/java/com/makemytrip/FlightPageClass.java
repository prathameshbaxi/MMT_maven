package com.makemytrip;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FlightPageClass {
   
	static WebElement webelem;
	static By loginbtn = By.xpath("//*[@id='SW']/div[1]/div[1]/ul/li[3]"); //login button
	static By searchbtn = By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/p/a"); //search button
	static By viewpricesbtn = By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/div/div/div/div[2]/div[1]/div[2]/div[4]/div/button"); //view prices button
	static By booknowbtn = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/div/div/div/div[2]/div[3]/div/div[2]/div/div[3]/button");
	static By yesradiobtn = By.xpath("//*[@id='INSURANCE']/div/div[4]/div[1]/label/span[1]/span");

	//static By yesradiobtn = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/label[1]/input");
	
	static By reivewcontinuebtn = By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div[1]/form[1]/div[5]/button");
	//*[@id='mainSection_0']/div[5]/button
	
	//*[@id='review-continue']
	static By addadult = By.xpath("//*[@id='wrapper_ADULT']/div[2]/div[3]/button");
	static By firstnamepath = By.xpath("//*[@id='wrapper_ADULT']/div[2]/div[2]/div/div[2]/div/div/div[1]/div/input");
	
	static By lastnamepath = By.xpath("//*[@id='wrapper_ADULT']/div[2]/div[2]/div/div[2]/div/div/div[2]/div/input");
	static By gender = By.xpath("//*[@id='wrapper_ADULT']/div[2]/div[2]/div/div[2]/div/div/div[3]/div/div/label[1]");
	
	static By mobilenopath = By.xpath("//*[@id='Mobile No']/div/input");
	static By emailidpath = By.xpath("//*[@id='Email']/div/input"); 
	static By travellercontinuebtn = By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[1]/form/div[9]/div/div/button");
	static By confirmbtn = By.xpath("//*[@id='root']/div/div[2]/div[5]/div/div[2]/button");
	
	//*[@id="root"]/div/div[2]/div[5]/div/div[2]/button
	
	static By proceedtopaybtn = By.xpath("//*[@id='ACKNOWLEDGE_SECTION']/div/button");
	
	static By yesinsurancebtn = By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div[1]/form[1]/div[3]/div/div[4]/div[1]/label/span[2]/b");
	static By continueifyesinsurence = By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div[1]/form[1]/div[5]/button");
	static By continueifnoinsurance = By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div[1]/form[1]/div[4]/button");
	//*[@id="mainSection_0"]/div[5]/button
	/*...............review page variables */
	
	static By reviewcontinuebtn = By.xpath("//*[@id=\"review-continue\"]");
	//*[@id="review-continue"]
	static By reviewfirstname = By.xpath("//*[@id='MANUAL_3ea524b1-0504-4406-a3c9-91a9f187bef5']/div[2]/div/div[1]/div[1]/div/input");
	static By reviewlastname = By.xpath("//*[@id='MANUAL_3ea524b1-0504-4406-a3c9-91a9f187bef5']/div[2]/div/div[1]/div[2]/div/input");
	static By reviewgender = By.xpath("//*[@id='MANUAL_3ea524b1-0504-4406-a3c9-91a9f187bef5']/div[2]/div/div[1]/div[3]/div/div/label[1]");
	static By reviewcontinuebtn2 = By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[1]/form/div[7]/div/div/button");
	/*...............review page variables ends */
	
	
	
	public static WebElement Searchbtn(WebDriver driver) {
		webelem= driver.findElement(searchbtn);
		return webelem;
	
	}
	public static WebElement Loginbtn(WebDriver driver) {
		webelem= driver.findElement(loginbtn);
		return webelem;
	}
	public static WebElement Veiwpricebtn(WebDriver driver) {
		webelem= driver.findElement(viewpricesbtn);
		return webelem;
	}
	public static WebElement Booknowbtn(WebDriver driver) {
		webelem = driver.findElement(booknowbtn);
		return webelem;
	}
	
	public static WebElement Yesradiobtn(WebDriver driver) {
		webelem = driver.findElement(yesradiobtn);
		return webelem;
	}
	
	public static WebElement Continuebtn(WebDriver driver) {//inside "review your booking" page after clicking radio btn
		webelem = driver.findElement(reivewcontinuebtn);
		return webelem;
	}
	
	//Fill user details in Traveller and Addons section 
	
	public static WebElement Firstname(WebDriver driver) {
		webelem = driver.findElement(firstnamepath);
		return webelem;
	}
	
	public static WebElement Lastname(WebDriver driver) {
		webelem = driver.findElement(lastnamepath);
		return webelem;
	}
	
	public static WebElement Addadult(WebDriver driver) {
		webelem = driver.findElement(addadult);
		return webelem;
	}
	
	public static WebElement Gendre(WebDriver driver) {
		webelem = driver.findElement(gender);
		return webelem;
	}
	
	public static WebElement Mobileno(WebDriver driver) {
		webelem = driver.findElement(mobilenopath);
		return webelem;
	}
	
	public static WebElement Emailid(WebDriver driver) {
		webelem = driver.findElement(emailidpath);
		return webelem;
	}
	//^^User details Ends
	
	public static WebElement Travellercontinuebtn(WebDriver driver) {
		webelem = driver.findElement(travellercontinuebtn); //give explicit wait in testcase for review details page and then click confirm
		return webelem; 
	}
	
	public static WebElement Confirmbtn(WebDriver driver) {
		webelem = driver.findElement(confirmbtn);
		return webelem;
	}
	
	public static WebElement Proceedtopaybtn(WebDriver driver) {
		webelem = driver.findElement(proceedtopaybtn);
		return webelem;
	}
	
}

