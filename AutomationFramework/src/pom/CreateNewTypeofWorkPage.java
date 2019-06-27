package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTypeofWorkPage {
	
	@FindBy(id="name")
    WebElement nameTextbox;
	
	@FindBy(xpath="//input[contains(@value,'Create Type of Work')]")
	WebElement  createTypeOfWork;
	
	public CreateNewTypeofWorkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void name(String workname)
	{
		System.out.println("Enter the work name");
		nameTextbox.sendKeys(workname);
	}
	public void createNewTypeOfWork()
	
	{
	createTypeOfWork.click();	
	}
}
