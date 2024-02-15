package myWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ONDC2 
{
  public static void main(String[] args) throws InterruptedException 
  {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://buyer-app-preprod-v2.ondc.org");
	//enter email
	driver.findElement(By.name("email")).sendKeys("tmbillsakshi@gmail.com");
	//enter pass
	driver.findElement(By.id("password")).sendKeys("Sakshi@2001");
	//click on login
    driver.findElement(By.xpath("//p[text()='Login']")).click();
    //click on add address
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@class='PrivateSwitchBase-input css-1m9pwf3']")).click();    
	//click on food &Beverages
	driver.findElement(By.xpath("//div[@class='jss38']")).click();
	Thread.sleep(2000);
	//click on foodies world
	driver.findElement(By.xpath("//div[text()='Foodies World']")).click();
	//add to cart
	driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	//click on cart
	driver.findElement(By.xpath("//p[text()='Cart']")).click();
	//click on checkout
	driver.findElement(By.xpath("//button[text()='Checkout']")).click();
	
	
  }
}
