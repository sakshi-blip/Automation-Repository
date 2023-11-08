package PopUpHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp 
{
   public static void main(String[] args) throws AWTException 
   {
	   WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
				
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        
   	    robot.keyPress(KeyEvent.VK_D);
   	    robot.keyRelease(KeyEvent.VK_D);
   	 
   	    robot.keyPress(KeyEvent.VK_M);
   	    robot.keyRelease(KeyEvent.VK_M);
   	 
	    robot.keyPress(KeyEvent.VK_I);
	    robot.keyRelease(KeyEvent.VK_I);
	    
	    robot.keyPress(KeyEvent.VK_N);
	    robot.keyRelease(KeyEvent.VK_N);
   
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    
	    robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        
   	    robot.keyPress(KeyEvent.VK_D);
   	    robot.keyRelease(KeyEvent.VK_D);
   	 
   	    robot.keyPress(KeyEvent.VK_M);
   	    robot.keyRelease(KeyEvent.VK_M);
   	 
	    robot.keyPress(KeyEvent.VK_I);
	    robot.keyRelease(KeyEvent.VK_I);
	    
	    robot.keyPress(KeyEvent.VK_N);
	    robot.keyRelease(KeyEvent.VK_N);
	    
	    
   
   }
}
