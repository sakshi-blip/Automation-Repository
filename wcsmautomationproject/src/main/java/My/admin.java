package My;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class admin 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://admin.techmainstay.in");
	  //enter username
	  Thread.sleep(2000);
	  driver.findElement(By.id("email")).sendKeys("deepawaykhinde95@gmail.com");
	  //enter pass
	  Thread.sleep(2000);
	  driver.findElement(By.id("password")).sendKeys("TMBill$#@!");
	  //click on login
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	  driver.switchTo();
	  
	  
	  
   }
}
