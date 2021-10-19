package com.makemytrip;

import org.testng.annotations.Test;
import com.makemytrip.RegistrationPageClass;


public class RegistrationTest extends Init{
  @Test
  public void click() throws Exception {

	RegistrationPageClass.Loginbtn(driver).click();
	RegistrationPageClass.Loginbtn(driver).click();
	
	  
  }
}
