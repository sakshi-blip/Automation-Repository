package MethodofActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://demoapps.qspiders.com/");
	 driver.findElement(By.xpath("//section[text()='Button']")).click();
	 driver.findElement(By.partialLinkText("Double Click")).click();
	 
	 WebElement b1 = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
	 WebElement b2 = driver.findElement(By.xpath("(//button[text()='Yes'])[2]"));
	 WebElement b3 = driver.findElement(By.xpath("//button[text()='1']"));
	 Actions act=new Actions(driver);
	 
	 act.doubleClick(b1).perform();
	 Thread.sleep(2000);
	 act.doubleClick(b2).perform();
	 Thread.sleep(2000);
	 act.doubleClick(b3).perform();
	 }
}
