package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  //store all web elements of login page
	@FindBy(name="username") private WebElement usnTB;
	@FindBy(name="pwd") private WebElement pswTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="remember") private WebElement keepLoggedInCheckBox;
	@FindBy(partialLinkText="Admin") private WebElement actiMindLink;
	@FindBy(partialLinkText="License") private WebElement licenseLink;

	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getUsnTB() 
	{
		return usnTB;
	}

	public WebElement getPswTB() 
	{
		return pswTB;
	}

	public WebElement getLoginButton() 
	{
			return loginButton;
	}
    
	public WebElement getKeepLoggedInCheckBox() 
    {
		return keepLoggedInCheckBox;
	}

	public WebElement getActiMindLink() 
	{
		return actiMindLink;
	}

	public WebElement getLicenseLink() 
	{
		return licenseLink;
	}
	
	//operational Methods
	public void ValidLogin(String validusn,String valpass)
	{
		usnTB.sendKeys(validusn);
		pswTB.sendKeys(valpass);
		loginButton.click();		
	}
	
	public void InvalidLogin(String invalidusn,String invalpass)
	{
		usnTB.sendKeys(invalidusn);
		pswTB.sendKeys(invalpass);
		loginButton.click();
		usnTB.clear();
	}
	
}
