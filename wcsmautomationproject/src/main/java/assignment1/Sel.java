package assignment1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel 
{
  public static void main(String[] args) throws InterruptedException, AWTException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.selenium.dev/");
	 Thread.sleep(2000);
	 WebElement RC = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
	 Thread.sleep(2000);
	 
	 //create actions class
	 Actions act = new Actions(driver);
	 
	 Thread.sleep(2000);
	 act.contextClick(RC).build().perform();
	 
	 //create robot class
	 Robot robot=new Robot();
	// robot.keyPress(KeyEvent.VK_PAGE_UP);
	 
	 for(int i=0;i<10;i++)
	 {
		 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		 robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(1000);
	 }
	 
  }
}
