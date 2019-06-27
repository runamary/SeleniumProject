package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.HomePage;
import pom.LoginPage;
import pom.TypesOfWorkPage;

public class Delete_Type_Of_Work_Test_Case extends BaseClass
{
      @Test
      public void deletework()
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
  			Thread.sleep(5000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
    	  TypesOfWorkPage tp = new TypesOfWorkPage(driver);
    	  boolean res=tp.checkwork();
    	  Assert.assertEquals(res,true,"Cannot delete the work");
    	  tp.delete();
    	  System.out.println("Handle popup - click on ok button");
    	  driver.switchTo().alert().accept();
    	  System.out.println("delete the work");
    	  String msg =tp.displayMsg();
    	  System.out.println(msg);
      }
}
