package finalMock;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class FinalTask 
{
   public static void main(String[] args) 
   {
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/");
	  
	  //switch controls to active elements
	  driver.switchTo().activeElement().sendKeys("iphone");
	  
	  driver.findElement(null); 
   }
}
