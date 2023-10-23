package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.instagram.com/accounts/login/?hl=en");
	   Thread.sleep(2000);
	   WebElement usnTB=driver.findElement(By.name("username"));
	   usnTB.sendKeys("username");
	   WebElement pswTB = driver.findElement(By.xpath("//input[@aria-label='Password']"));
	   pswTB.sendKeys("123456");
	   WebElement btn = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	   btn.click();
   }
}
