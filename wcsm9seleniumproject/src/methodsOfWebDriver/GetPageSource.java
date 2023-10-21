package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource 
{
  public static void main(String[] args) 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	 String pagesource=driver.getPageSource();
	 System.out.println(pagesource);  // to get the source code of page
  }
}
