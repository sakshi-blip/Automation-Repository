package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName 
{
  public static void main(String[] args) 
  {
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.switchTo().activeElement().sendKeys("joey tribbiani",Keys.ENTER);	 
	 driver.findElement(By.className("lNPNe")).click();
  }  
}