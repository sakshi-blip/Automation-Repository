package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.instagram.com/accounts/login/?hl=en");
	  //identify username and pass values
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  //identify pass and pass the value
	  driver.findElement(By.name("password")).sendKeys("123456");
      //identify login button and click on it
	  driver.findElement(By.xpath("//div[text()='Log in']")).click();
  }
}
