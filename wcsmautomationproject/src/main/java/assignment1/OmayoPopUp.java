package assignment1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoPopUp 
{
  public static void main(String[] args) 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("http://omayo.blogspot.com/");
	 
	 driver.findElement(By.id("alert1")).click();
	 Alert al = driver.switchTo().alert();
	 String txt = al.getText();
	 System.out.println(txt);
	 al.accept();
  }
}
