package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://backoffice.tmbill.com");
	 
	 String urlofloginpage=driver.getCurrentUrl();
	 System.out.println(urlofloginpage);
	 Thread.sleep(2000);
	 
	 driver.findElement(null);
  }
}
