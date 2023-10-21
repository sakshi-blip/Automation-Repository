package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2Faccounts%2Fedit%2F%3F__coig_login%3D1");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("123456");
	 driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();
	 
  }
}
