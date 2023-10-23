package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption 
{

	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("file:///C:/Users/DELL/Desktop/wcsm9/dropdown.html");
	  WebElement dropDown1= driver.findElement(By.name("language"));

	  //handle the dropdown
	  Select sel=new Select(dropDown1);
	  
	  //select the option from dropdown
	  Thread.sleep(2000);
	  sel.selectByValue("python");
	  Thread.sleep(2000);
	  
	  //get the option which is selected first
	  WebElement firstOpt = sel.getFirstSelectedOption();
	  
	  //get the text of first option
	  System.out.println(firstOpt.getText());
	  
	  
	  driver.navigate().to("file:///C:/Users/DELL/Desktop/wcsm9/multiselectdropdown.html");
	  
	  //identify dropdown
	  WebElement dropDown2 = driver.findElement(By.name("cars"));
	  
	  //handle the multislect drop down
	  Select sel2=new Select(dropDown2);
	  

	  //select multiple option from multiselect dropdown
	  for(int i=5;i<8;i++)
	  {
		  Thread.sleep(2000);
          sel2.selectByIndex(i);		  
	  }
	  
	  //get the option which is selected first
	  Thread.sleep(2000);
	  System.out.println(sel2.getFirstSelectedOption().getTagName());
	}

}
