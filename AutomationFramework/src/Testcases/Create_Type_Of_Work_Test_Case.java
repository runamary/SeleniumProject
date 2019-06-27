package Testcases;

import org.testng.annotations.Test;

import pom.CreateNewTypeofWorkPage;
import pom.HomePage;
import pom.LoginPage;
import pom.TypesOfWorkPage;

public class Create_Type_Of_Work_Test_Case extends BaseClass{
  @Test
  public void creatework() 
  {
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
	  HomePage hp = new HomePage(driver);
	  hp.settings();
	  hp.typesOfWork();
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  TypesOfWorkPage tp = new TypesOfWorkPage(driver);
	  tp.createTypeOfWorkBtn();
	  
	  CreateNewTypeofWorkPage cn = new CreateNewTypeofWorkPage(driver);
	  cn.name("Java");
	  cn.createNewTypeOfWork();
	  String mssg=tp.displayMsg();
	  System.out.println(mssg);
	  
	  
	  
  }
}
