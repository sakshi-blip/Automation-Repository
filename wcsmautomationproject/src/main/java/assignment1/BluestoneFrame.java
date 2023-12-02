package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneFrame
{
  public static void main(String[] args) throws InterruptedException
  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.bluestone.com/");
	  
	  //handle hidden division pop up
	  driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
	
	  Thread.sleep(2000);
	  //find the frame
	  WebElement frameElement = driver.findElement(By.id("fc_widget"));
	  
	  //switch the controls to frame
	  //driver.switchTo().frame(0);
	  //driver.switchTo().frame("fc_frame");
	  driver.switchTo().frame(frameElement);
	  
	  //click on chat icon
	  driver.findElement(By.id("chat-icon")).click();
	  
	  //all the text box are designed under main webpage so switch back to main webpage
	  Thread.sleep(2000);
		
	  driver.switchTo().defaultContent();
		
	  //enter the details by finding ewbelement
	  driver.findElement(By.id("chat-fc-name")).sendKeys("Sakshi");
	  driver.findElement(By.id("chat-fc-email")).sendKeys("sakshi@gmail.com");
	  driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
	  driver.findElement(By.xpath("//a[@class='fc-button']")).click();
	  
  }
}
