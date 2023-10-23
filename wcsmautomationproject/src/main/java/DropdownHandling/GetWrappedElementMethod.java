package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("file:///C:/Users/DELL/Desktop/wcsm9/dropdown.html");
	  WebElement dropDown1= driver.findElement(By.name("language"));
    
	  //handle dropdown
	  Select sel=new Select(dropDown1);
	  
	  //get all the options from dropdown by using getwrapped	  
	  WebElement allOps = sel.getWrappedElement();
	  System.out.println(allOps.getText());
	  
	  //get all options from dropdown by usinf getoptions method
	  List<WebElement> options = sel.getOptions();
	  for(WebElement opt:options)
	  {
		  Thread.sleep(2000);
		  if(opt.getText().equals("python"))
		  {
			  opt.click();
			  break;
		  }
	  }
  }
}
