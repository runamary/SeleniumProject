package Testcases;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.LoginPage;

public class Valid_Login_Testcase extends BaseClass {
	
  @Test
  public void loginTestCase()
  {
	  String expectedTitle ="actiTIME - Enter Time-Track";
	  LoginPage lp1 = new LoginPage(driver);
	  lp1.username("admin");
	  lp1.password("manager");
	  lp1.loginButton();
	  try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  String actualTitle = driver.getTitle();
	  
	 // System.out.println(expectedTitle);
	  System.out.println(actualTitle);
	  Assert.assertEquals(actualTitle, expectedTitle, "Invalid Message");
  }
}
