package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles 
{
  public static void main(String[] args) 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	Set<String> parenthandles=driver.getWindowHandles();
	System.out.println(parenthandles);
	
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	Set<String> allHandles = driver.getWindowHandles();
	for(String i:allHandles)
	{
		System.out.println(" " +i);
	}
  }
}
