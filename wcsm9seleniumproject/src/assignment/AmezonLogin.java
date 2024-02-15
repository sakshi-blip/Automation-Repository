package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmezonLogin 
{
 public static void main(String[] args) throws InterruptedException 
 {
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("https://omayo.blogspot.com/");
     Thread.sleep(2000);
     
     driver.findElement(By.tagName("input")).sendKeys("sakshi");
     driver.findElement(By.tagName("password")).sendKeys("Badhe");
     
 }
}
