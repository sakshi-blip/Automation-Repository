package TakeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShotOfWebElement 
{
  public static void main(String[] args) throws InterruptedException, IOException 
  {
	  ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://www.bluestone.com/");
      Thread.sleep(2000);
      
      //handle pop up
      driver.findElement(By.id("denyBtn")).click();
      Thread.sleep(2000);
      //identify coins and perform mouse over
      WebElement c = driver.findElement(By.partialLinkText("Coins"));
      
      Actions act = new Actions(driver);
      act.moveToElement(c);
      
      driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
  
       //take screenshot of coins elemetn
      Thread.sleep(2000);
      
      WebElement CE = driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']"));
  
      File src = CE.getScreenshotAs(OutputType.FILE);
      File dest = new File("./ScreenShots/coinElement.png");
      
      Files.copy(src, dest);
      
      Thread.sleep(2000);
      driver.quit();
  }
}
