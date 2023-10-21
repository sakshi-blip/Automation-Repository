package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText 
{
  public static void main(String[] args) 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/DELL/Desktop/wcsm9/link.html");
	//partial link text will work for partial as well as complete link text
	driver.findElement(By.partialLinkText("slenium")).click();
  }
}
