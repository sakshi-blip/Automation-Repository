package synchronization;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkartq 
{
  public static void main(String[] args) throws InterruptedException 
  { 
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       //launch
       driver.get("https://www.flipkart.com/");
       //close the pop up
       driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
       //search
       driver.findElement(By.name("q")).sendKeys("iphone");
       //click on search
       driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
       String parentHandle = driver.getWindowHandle();
       //click on second suggetion
       driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
       Thread.sleep(2000);
       Set<String> allHandles=driver.getWindowHandles();
       for(String wh:allHandles)
       {
    	   if(!parentHandle.equals(wh))
    	   {
    		   driver.switchTo().window(wh);
    	   }
       }
       
       //select red color
       driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
       //select 128GB
       driver.findElement(By.xpath("//a[@class='_1fGeJ5 PP89tw']")).click();
       //enter pin code
       driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("411033");
       //click on check
       driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
       //click on add to cart
       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
       //click on remove
       driver.findElement(By.xpath("//div[@class='nZz3kj _1hNI6F']")).click();
       //click on remove
      // driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
  }
}
