package My;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolltill 
{
  public static void main(String[] args) 
  {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://demoapps.qspiders.com");
	 driver.findElement(null)
	 
  }
}
