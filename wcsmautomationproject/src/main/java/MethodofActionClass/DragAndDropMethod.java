package MethodofActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Drag And Drop']")).click();
	driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
	
	//store all drag element
	WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	WebElement src2 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	WebElement src3 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	WebElement src4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	
	//store all drop element
	 WebElement t1 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
	 WebElement t2 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
	 WebElement t3 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
	 WebElement t4 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
	 
	 Actions act=new Actions(driver);
	 
	 act.dragAndDrop(src1, t1).perform();
	 Thread.sleep(2000);
	 act.dragAndDrop(src2, t2).perform();
	 Thread.sleep(2000);
	 act.dragAndDrop(src3, t3).perform();
	 Thread.sleep(2000);
	 act.dragAndDrop(src4, t4).perform();
	 Thread.sleep(2000);
	 
	 
  }
}
