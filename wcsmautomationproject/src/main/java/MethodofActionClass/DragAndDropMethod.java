package MethodofActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDropMethod 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Drag & Drop']/ancestor::div[@class='w-[100%]']")).click();
	
  }
}
