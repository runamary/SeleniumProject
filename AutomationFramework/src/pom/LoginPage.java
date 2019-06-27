package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="username")
	WebElement usernameTextbox;
	
	@FindBy(name="pwd")
	WebElement passwordTextBox;
	
	@FindBy(id="loginButton")
	WebElement loginButton;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	WebElement errorMsg;	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String uname)
	{
		usernameTextbox.sendKeys(uname);
		
	}
	public void password(String pwd)
	{
		passwordTextBox.sendKeys(pwd);
	}
    public void loginButton()
    {
    	loginButton.click();
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public String errorMessage()
    {
    	String msg = errorMsg.getText();
    	return msg;
    }
}
