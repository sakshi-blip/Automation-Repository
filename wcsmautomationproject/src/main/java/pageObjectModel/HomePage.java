package pageObjectModel;

public class HomePage 
{
   public class HomePage
   {
	   //store all modules of homepage
	   @findBy(xpath="//div[text()='Time-Track']/following-sibling::div/img") private WebElement Time_Track_Module;
	   @findBy(xpath="//div[text()='Tasks']/following-sibling::img") private  WebElement Tasks_Module;
	   @findBy(xpath="//div[text()='Reports']/following-sibling::img") private WebElement Reports_Module;
	   @findBy(xpath="//div[text()='Users']/following-sibling::img")private WebElement Reports_Module;
	   @findBy(xpath="//div[text()='Work Schedule']/following-sibling::img")private WebElement Users_Module;
	   @findBy(xpath="//div[text()='Settings']/following-sibling::img")private WebElement Settings_Module;
	   @findBy(xpath="Logout") private WebElement Logout_Link;
	   
	   //initialization
	   
   }
}
