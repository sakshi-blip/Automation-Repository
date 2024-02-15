package myWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
  /**
 * @param args
 */
public static void main(String[] args)
  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://demoapps.qspiders.com/");
	  //click on quick start
	  driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
	  //click on dropdown
	  driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	  //find dropdown web element
	  WebElement phno = driver.findElement(By.id("select1"));
	   	  
	  //use select clacc to handle static dropdown
	  Select sel1 = new Select(phno);
	  sel1.selectByIndex(2);
	  
	  //select Gender
	  WebElement gender = driver.findElement(By.id("select2")); //find web element
	  Select sel2=new Select(gender);                           //create select class object
	  sel2.selectByIndex(2);                          //call select class method(check why select by value not working)
	  
	  //Select Country
	  WebElement country = driver.findElement(By.id("select3"));
	  Select sel3 = new Select(country);
	  sel3.selectByIndex(7);	  
	  //select state
	  WebElement state = driver.findElement(By.id("select5"));
	  Select sel4 = new Select(state);
	  sel4.selectByIndex(1);
	  
	  //select city
	  WebElement city = driver.findElement(By.id("optionCity"));
	  Select sel5 = new Select(city);
	  sel5.selectByIndex(1);
	  
	  //select qty
	  WebElement qty = driver.findElement(By.id("select7"));
	  Select sel6 = new Select(qty);
	  sel6.selectByIndex(2);
	  
	  
	  
	  
	  
  }
}
