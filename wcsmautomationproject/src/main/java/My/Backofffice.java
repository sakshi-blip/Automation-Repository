package My;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Backofffice 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--disable-notifications");
	 WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://backoffice.tmbill.com/#/");
	driver.findElement(By.name("email")).sendKeys("Sakshi");
	driver.findElement(By.name("password")).sendKeys("778899");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='nav-link router-link-exact-active router-link-active']")).click();
	
	
  }
}
