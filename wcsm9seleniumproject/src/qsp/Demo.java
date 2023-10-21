package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
{
  public static void main(String[] args) 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://backoffice.tmbill.com/");
	  String loginPageTitle=driver.getTitle();
	  System.out.println(loginPageTitle);
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");	
	  driver.findElement(By.name("Login")).click();
  } 
}
