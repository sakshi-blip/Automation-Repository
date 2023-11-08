package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStonee 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	//handle popup
	driver.findElement(By.id("denyBtn")).click();

	//switch control to frame
	WebElement frameElement = driver.findElement(By.id("fc_widget"));
	//driver.switchTo().frame(6);
	//driver.switchTo().frame("fc_widget");
	driver.switchTo().frame("frameElement");
	
	//click on chatbox
	driver.findElement(By.id("chat-icon")).click();
	
	//handle all text box present inside chatbox
	//all the text box are designed under main webpage so switch back to main webpage
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("chat-fc-name")).sendKeys("sakshi");
	
	driver.findElement(By.id("chat-fc-email")).sendKeys("sakshi@gmail.com");
	
	driver.findElement(By.id("chat-fc-phone")).sendKeys("9999999999");
	
  }
}
