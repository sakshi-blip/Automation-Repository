package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpenClose 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();    //launch(create obj of browser class)
	  System.out.println("Open");
	  Thread.sleep(4000);                     //delay
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.manage().window().minimize();
	  
	 // Options win = driver.manage();
	 // Window max = win.window();
	 // max.maximize();
	  Thread.sleep(2000);
	  driver.close();                         //close

	  System.out.println("close");
  }
}
