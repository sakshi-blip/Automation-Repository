package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().setPosition(null);
	  driver.manage().window().fullscreen();
	  Thread.sleep(2000);
	  driver.manage().window().minimize();
	  
  }
}
