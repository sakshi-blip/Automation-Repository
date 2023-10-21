package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin 
{
  public static void main(String[] args) 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.id("email")).sendKeys("Admin");
	 driver.findElement(By.id("pass")).sendKeys("1234");
	 driver.findElement(By.name("login")).click();
  }
}
