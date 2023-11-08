package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qspiderPOpup 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://demoapps.qspiders.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//section[.='Popups']")).click();
	 driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
	 
	 WebElement BW = driver.findElement(By.id("fileInput"));
	 
	 //perform double click
	 Actions act = new Actions(driver);
	 act.doubleClick(BW).perform();
	 
  }
}
