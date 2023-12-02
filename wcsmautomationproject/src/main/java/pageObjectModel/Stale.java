package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://127.0.0.1/login.do;jsessionid=bf8h03cc55lp2");
	  
	  WebElement usnTB = driver.findElement(By.name("username"));
	  Thread.sleep(2000);
	  driver.navigate().refresh();
	  usnTB.sendKeys("admin");
  }
}
