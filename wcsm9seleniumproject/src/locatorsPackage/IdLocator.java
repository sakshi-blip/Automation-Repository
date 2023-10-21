package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator 
{
  public static void main(String[] args) 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/DELL/Desktop/wcsm9/we.html");
	 driver.findElement(By.id("i1")).sendKeys("Admin");
	 driver.findElement(By.id("i2")).sendKeys("1234");
	 driver.findElement(By.tagName("button")).click();
  }
}
