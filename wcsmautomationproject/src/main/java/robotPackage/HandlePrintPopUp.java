package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePrintPopUp 
{
  public static void main(String[] args) throws InterruptedException, AWTException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.selenium.dev/");

	 //crreate robot class
	 Robot robot = new Robot();
	 
	 //press cntr+p
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_P);
	 Thread.sleep(2000);
	 
	 //release cntr+p
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_P);
     Thread.sleep(2000);
     
	 //handle print pop up
	 robot.keyPress(KeyEvent.VK_TAB);
	 robot.keyRelease(KeyEvent.VK_TAB);
	 
	 Thread.sleep(2000);
	 driver.quit();
  }
}
