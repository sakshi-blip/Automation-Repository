package synchronization;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myntra 
{
   public static void main(String[] args) 
   {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	 //launch myntra
	 driver.get("https://www.myntra.com/");
	 //search for shoes
	 driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
	 //click on search icon
	 driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	 //
     String parentHandle = driver.getWindowHandle();
	 //select second suggetion
	 driver.findElement(By.xpath("(//img[@class='img-responsive'])[2]")).click();
	 Set<String> allHandles=driver.getWindowHandles();
     for(String wh:allHandles)
     {
  	   if(!parentHandle.equals(wh))
  	   {
  		   driver.switchTo().window(wh);
  	   }
     }	 
	 //select size 7
	 driver.findElement(By.xpath("(//p[@class='size-buttons-unified-size'])[2]")).click();
	 //enter pin code
	 driver.findElement(By.xpath("//input[@class='pincode-code']")).sendKeys("413709");
	 //click on check
	 driver.findElement(By.xpath("//input[contains(@class,'pincode-check')]")).click();
	 //click on add to bag
	 driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite pdp-wh')]")).click();
	 //creat object for webDriver wait
	 //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='GO TO BAG']"))).click();
	 
	 //click on go to bag
	 driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	 
	 
	 //click on remove
	 driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
	 //click on remove
	 driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
   }
}
