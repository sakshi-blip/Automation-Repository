package myWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
  public static void main(String[] args) 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://backoffice.tmbill.com/#/");
	  driver.findElement(By.id("email")).sendKeys("Sakshi");
	  driver.findElement(By.id("password")).sendKeys("778899");
  }
}
