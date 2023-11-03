package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod 
{
  public static void main(String[] args) throws InterruptedException 
  { //open url->access title
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	String titleofPage=driver.getTitle();
	System.out.println(titleofPage);
  }
}
