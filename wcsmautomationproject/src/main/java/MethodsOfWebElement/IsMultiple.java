package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMultiple {

	public static void main(String[] args) 
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://demoapps.qspiders.com");
	  
	  driver.findElements(By.xpath("//section[text()='Dropdown']")).click();
	  
	  //single select dropdown
	  WebElement dropdown = driver.findElement(By.xpath("//label[text()='Phone Number']"));
	  
	  Select sel=new Select(dropdown);
	  
	  //we read list by using for loop
	  for(int i=0;i<allOps.size();i++)
	  {
		  String opt=allOps.get(i).getText();
		  Thread.sleep(2000);
		  System.out.println(opt1);
	  }
	  //we read list by using for each loop
	  for(WebElement op:allops)
	  {
		  String opt1=op.getText();
		  Thread.sleep(2000);
		  System.out.println(opt1);
	  }
	  

	}

}
