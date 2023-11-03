package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp 
{
  public static void main(String[] args) 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");
	
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.xpath("//section[text()='Javascript']")).click();
	driver.findElement(By.xpath("//a[text()='Confirm']")).click();
	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	Alert al = driver.switchTo().alert();
	al.dismiss();
	
	 
  }
}
