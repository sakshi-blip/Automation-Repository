package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ty 
{
 public static void main(String[] args) throws InterruptedException 
 {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   Thread.sleep(2000);
   driver.close();
 }
}
