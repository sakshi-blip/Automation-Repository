package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator 
{
  public static void main(String[] args) 
  {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/DELL/Desktop/wcsm9/link.html");
	    //it will work only for complete link text
	    driver.findElement(By.linkText("sleniumLink")).click();	    
  }
}
