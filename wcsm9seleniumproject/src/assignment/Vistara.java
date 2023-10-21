package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Vistara 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  //handle notification pop up in chrome 
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--disable-notifications");
	 WebDriver driver=new ChromeDriver(co);
	 driver.manage().window().maximize();
	 driver.get("https://www.airvistara.com/in/en");
	 Thread.sleep(2000);
	 driver.findElement(By.id("acceptAllBtn")).click();
	 driver.findElement(By.cssSelector("input[class='scombobox-display wcag-form-field ui-autocomplete-input valid']")).sendKeys("Pune");
  }
}
