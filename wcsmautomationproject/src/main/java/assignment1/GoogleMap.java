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
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.google.com/");
	 driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	 
	 //before clicking on map switch controls to frame
	 //identofy the frame and store it as web element
	 WebElement frameElement = driver.findElement(By.name("app"));
	 
	 Thread.sleep(2000);
//	 driver.switchTo().frame(0);
//	 driver.switchTo().frame("app");
	 driver.switchTo().frame(frameElement);
	 Thread.sleep(2000);
	 
	 //click on google map
	 driver.findElement(By.xpath("//span[text()='Maps']")).click();
	 
	 
  }
}
