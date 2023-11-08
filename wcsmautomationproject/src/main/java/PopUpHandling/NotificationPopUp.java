package PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp 
{
 public static void main(String[] args) throws InterruptedException 
 {
      ChromeOptions CO = new ChromeOptions();
      CO.addArguments("--disable-notifications");
     WebDriver driver=new ChromeDriver(CO);
     driver.get("https://demoapps.qspiders.com");
     driver.findElement(By.xpath("//section[text()='Popups']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//section[text()='Notifications']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[text()='Notification']")).click();
     
     
      
 }
}
