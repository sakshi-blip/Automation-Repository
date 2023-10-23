package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute_CSSValue_Tagname
{
	public static void main(String[] args) 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     //get attribute value of usernmae textbox i.e name attribute
	 WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	 String attributeValue = usnTB.getAttribute("class");
	 System.out.println(attributeValue);
	 
	 //get tje css property of username textbox i.e color
	 String cssValue = usnTB.getCssValue("width");
	 System.out.println(cssValue);
	 
	 //get the tagname of username text box
     String tag = usnTB.getTagName();
     System.out.println(tag);
	}

}
