package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order 
{
  public static void main(String[] args) 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://order.tmbill.com/brand/s2/");
	 driver.findElement(By.className("ant-btn css-1vr7spz ant-btn-default BrandPage_orderNow____cEd")).click();
	 
  }
}
