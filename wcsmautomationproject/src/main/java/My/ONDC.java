package My;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ONDC 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://buyer-app-preprod.ondc.org/login");
	 Thread.sleep(2000);
	 driver.findElement(By.name("email")).sendKeys("tmbillsakshi@gmail.com");
	 driver.findElement(By.name("password")).sendKeys("Sakshi@2001");
	 //driver.findElement(By.linkText("Login")).click();	    
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//p[text()='Login']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[text()='Select your address' and (@class='searchProductModal_formControl__auB4X')]")).click();
	 driver.findElement(By.xpath("//div[@class='px-3']")).click();
	 driver.findElement(By.xpath("//p[text()='Product' and (@class='searchProductModal_search_type_text__Tf2n8')]")).click();
	 driver.findElement(By.xpath("//p[text()='Provider']")).click();
	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Foodies World",Keys.ENTER);

	 driver.findElement(By.xpath("//p[text()='Foodies World']")).click();
	 for(int i=0;i<5;i++)
	 {
	 driver.findElement(By.xpath("//button[text()='Apply Filter']")).click();
	 Thread.sleep(2000);
	 }
	 driver.findElement(By.xpath("//button[text()='Apply Filter']")).click();
  }
}
