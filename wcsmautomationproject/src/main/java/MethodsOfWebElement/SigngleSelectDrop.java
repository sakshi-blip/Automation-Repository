package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SigngleSelectDrop
{

	public static void main(String[] args) 
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get(null);
	  
	  //identify dropdawn
	  //=driver.findElement(By.id(""));
	  
	  //identify country dropdown
	  
	  
	  //identify state dropdawn
	  //WebElement dropDown3 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"))args;
      //Select sel3 = new select(dropDown3);
      //sel3.selectByVisibleText("Maharashtra");
	  
	  driver.findElement(By.xpath("//select[text()='Dropdawn'"));
	}

}
