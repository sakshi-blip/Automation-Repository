package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laptoponflipkart 
{
   public static void main(String[] args) throws InterruptedException 
   {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 //launch flipkart
	 driver.get("https://www.flipkart.com/");
	 //handle the popup
	 driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
	 //search for laptop
	 Thread.sleep(2000);
	 driver.findElement(By.name("q")).sendKeys("Laptop");
	 Thread.sleep(2000);
	 //click on search icon
	 driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	 //select brand HP
	 driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();
	 //select processor i7
	 driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
	 //select OS windows 11
	 driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Windows 11')]")).click();
	 //select ratings 4 and above
	 driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
	 Thread.sleep(2000);
	 //allLaptops=driver.findElement(By.xpath(null))
			 ////div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']
   }
}
