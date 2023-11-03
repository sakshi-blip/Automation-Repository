package TakeScreenShotPackage;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotWay1 
{
  public static void main(String[] args) 
  {
     //directly create the object of browser specific classes
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://demoapps.qspiders.com/");
	  
	  //
	  
  }
}
