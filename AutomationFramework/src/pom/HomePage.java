package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings']")
	WebElement settingsIcon;
	
	@FindBy(xpath="//a[text()='Types of Work']")
	WebElement typesOfWorkLink;
	
	@FindBy(id="logoutLink")
	WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void settings()
	{
		System.out.println("Click on Settings");
		settingsIcon.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
   public void typesOfWork()
   {
	   System.out.println("Click on Types of work");
	   typesOfWorkLink.click();
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   public void logout()
   {
	   System.out.println("Click on logout");
	   logout.click();
	   
   }
   
}
