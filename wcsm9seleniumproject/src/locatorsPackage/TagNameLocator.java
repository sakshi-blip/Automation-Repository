package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator
{
  public static void main(String[] args) 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/DELL/Desktop/wcsm9/we.html");
	 //identofy usernameTB and pass input as admin
	 driver.findElement(By.tagName("input")).sendKeys("admin");
	 driver.findElement(By.tagName("input")).sendKeys("Manager");
	 driver.findElement(By.id("i2")).sendKeys("Manager");
	 driver.findElement(By.tagName("Button")).click();
  }
}
