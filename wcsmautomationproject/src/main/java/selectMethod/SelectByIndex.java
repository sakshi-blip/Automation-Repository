package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex 
{
  public static void main(String[] args) throws InterruptedException 
  { //select by idex using single select dropdown
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/DELL/Desktop/wcsm9/dropdown.html");
	
	//search dropdown
	WebElement dropDown = driver.findElement(By.name("language"));
	
	Select sel = new Select(dropDown);
	Thread.sleep(2000);
	sel.selectByIndex(2);
		
  }
}
