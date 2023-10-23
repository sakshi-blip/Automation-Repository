package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexM 
{

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("file:///C:/Users/DELL/Desktop/wcsm9/multiselectdropdown.html");
      
      //find dropdown
      WebElement carName = driver.findElement(By.name("cars"));
      
      Select sel = new Select(carName);
      
      //select single option from multiselect dropdown
      
  //    sel.selectByIndex(2);
      
      //select multiple options from multiselect dropdown
      
      for(int i=0;i<=4;i++)
      {
    	  sel.selectByIndex(i);
    	  Thread.sleep(2000);
      }
    }

}
