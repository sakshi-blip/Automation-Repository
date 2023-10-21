package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipcart 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--disable-notifications");
	 WebDriver driver=new ChromeDriver(co);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 //launch flipkart
	 driver.get("https://www.flipkart.com/");
	 //close the pop up
	 driver.findElement(By.xpath("//span[text()='✕']")).click();
	 //pass value mobile to search box
	 driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Mobile");
	 //click on search icon
	 driver.findElement(By.xpath("//button[contains(@aria-label,'Brands and More')]")).click();
	 //print price of 2nd element
	 driver.findElement(By.xpath(""));
  }
}
