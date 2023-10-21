package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{
  public static void main(String[] args) throws InterruptedException 
  { //how to close all browser without using quit()
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://omayo.blogspot.com/");
	 Thread.sleep(2000);
	 
	 String ParentAddr=driver.getWindowHandle();
	 
	 driver.findElement(By.partialLinkText("Open a popup window")).click();
	 Thread.sleep(2000);
	 Set<String> allHandles = driver.getWindowHandles();
	 for(String wh:allHandles)
	 {
		 TargetLocator switchTo=driver.switchTo();
		 Thread.sleep(2000);
		 switchTo.window(wh).close();
	 }
  }
}
