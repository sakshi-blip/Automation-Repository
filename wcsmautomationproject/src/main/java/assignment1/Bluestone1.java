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

public class Bluestone1 
{
  public static void main(String[] args) throws InterruptedException, AWTException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.bluestone.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
	 
	 WebElement WJ = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	 
	 //action class
	 Actions act=new Actions(driver);
	 
	 act.moveToElement(WJ).perform();
	 
	 driver.findElement(By.xpath("//a[text()='Band']")).click();
	 
	 WebElement FB = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
	 
	 for(int i=1;i<3;i++)
	 {
		 act.doubleClick(FB).perform();
		 Thread.sleep(2000);
		 act.clickAndHold(FB).perform();
	 }
	 
	 Robot robot=new Robot();
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_C);
	 
	 
  }
}
