package MethodofActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod 
{
  public static void main(String[] args) throws InterruptedException
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	//handle the popup
	driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
	Thread.sleep(2000);
	
	//click on watch and jewellery option
	WebElement WatchJewellery = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	
	//creare obj of actions class
	Actions act = new Actions(driver);
	act.moveToElement(WatchJewellery);
  }
}
