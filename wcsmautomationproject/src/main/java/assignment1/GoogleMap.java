package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/");
	  
	  //click on google apps
	  driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	  
	  //before clicking on map switch controls to frame
	 //identofy the frame and store it as web element
	  WebElement frameElement = driver.findElement(By.name("app"));
	  
	// driver.switchTo().frame(0);  //by integer index value
	// driver.switchTo().frame("app");  //by string number or id
	 driver.switchTo().frame(frameElement);  //by webelement
	 
	 //click on google map
	 driver.findElement(By.xpath("//span[text()='Maps']")).click();
	  
	  
  }
}
