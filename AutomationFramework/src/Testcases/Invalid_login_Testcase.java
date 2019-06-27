package Testcases;

import org.testng.annotations.Test;

import pom.LoginPage;

public class Invalid_login_Testcase extends BaseClass{
  @Test
  public void invalidTestCase() 
  {
	  LoginPage lp1 = new LoginPage(driver);
	  lp1.username("abc");
	  lp1.password("xyz");
	  lp1.loginButton();
	  
	  try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  String errorM=lp1.errorMessage();
	  System.out.println(errorM);
	  
	  
  }
}
