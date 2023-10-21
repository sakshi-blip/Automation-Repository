package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	//1)tagname[AN='AV']
	driver.findElement(By.cssSelector("input[class='oxd-input oxd-input--active']")).sendKeys("Admin");
	Thread.sleep(2000);
	//2)tagname[AN^=beg char of AV']
	driver.findElement(By.cssSelector("input[class^='oxd']"));
	//3)tagname[AN$='end char of AV']
    driver.findElement(By.cssSelector("input[class$='active']"));
    //4)tagname[AN*='any char of AV']
    driver.findElement(By.cssSelector("input[class*='nput-']"));
  }
}
