package TakeScreenShotPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://demoapps.qspiders.com/");
	 //click on quick start
	 driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
	 driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
	 
	 //explict type casting in javascript executer
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 Thread.sleep(2000);
	 //handle disabled name text box
	 jse.executeScript("document.getElementById('name').value='sakshi'");
	 Thread.sleep(2000);
	 //handle disabled email text box
	 jse.executeScript("document.getElementById('email').value='sakshi@gmail.com'");
	 Thread.sleep(2000);
	 //handle disabled password text box
	 jse.executeScript("document.getElementById('password').value='sakshi123'");
	 
	 //click on disable register button
	 WebElement disabledRegisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
	  
	 if(disabledRegisterButton.isDisplayed())
	 {
		 jse.executeScript("arguments[0].click()",disabledRegisterButton);
		 System.out.println("Click");
	 }
	 else
	 {
		 System.out.println("Not Clicked");
     }
	 
  }
}
