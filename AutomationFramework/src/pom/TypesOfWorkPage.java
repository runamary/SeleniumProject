package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesOfWorkPage {
	@FindBy(xpath="//span[@class='successmsg']")
	WebElement message;
	
	@FindBy(xpath="//span[text()='Create Type of Work']")
	WebElement createTypeOfWorkButton;
	
	@FindBy(xpath="//tr[td[a[text()='Java']]]//a[contains(text(),'delete')]")
    WebElement deleteLink;
	
	public TypesOfWorkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String displayMsg()
	{
		
		String msg=message.getText();
		return msg;
	}
	public void createTypeOfWorkBtn()
	{
		System.out.println("Create type of work button");
		createTypeOfWorkButton.click();
	}
	
	public boolean checkwork()
	{
	boolean disp = false;
	try{
		 disp=deleteLink.isDisplayed();
		
	}catch(Exception e)
	{
		System.out.println("sorry. Type of work is not available");
		System.out.println(disp);
	}
	return disp;
}
	public void delete()
	{
		System.out.println("Delete the delete link");
		deleteLink.click();
	}
	
	
}
