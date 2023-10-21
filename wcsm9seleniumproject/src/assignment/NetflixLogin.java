package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin 
{
  public static void main(String[] args) 
  {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.netflix.com/in/login");
     driver.findElement(By.id("id_userLoginId")).sendKeys("Admin");
     driver.findElement(By.id("id_password")).sendKeys("1234");
     //syntax=tagname[attributename='attributevalue]
     //driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
     //syntax-tagname=[attributename^='starting char of attribute value']
     //driver.findElement(By.cssSelector("button[class^='btn']")).click(); 
     //syntax-tagname[AN*='it will be match any char of AV']
     driver.findElement(By.cssSelector("button[class*=login]")).click();
     
  }
}
