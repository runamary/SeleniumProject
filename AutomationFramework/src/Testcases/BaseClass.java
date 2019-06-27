package Testcases;

//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
 
  @BeforeClass
  public void precondn()
  {
	  driver = new FirefoxDriver();
	  driver.get("https://demo.actitime.com/login.do");
	  
  }

  @AfterClass
  public void postcondn() 
  {
	  try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.close();
	  System.out.println("-----------------");
  }

}
