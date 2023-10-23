package MethodsOfWebElement;
//need to check 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	Thread.sleep(2000);
	WebElement usnTB = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
    usnTB.sendKeys("Admin");
    Thread.sleep(2000);
    usnTB.clear();
  }
}
