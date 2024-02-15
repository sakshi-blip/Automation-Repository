package My;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown 
{
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
	 //clikc on multiselect dropdown
	driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
	//findout dropdown on webpage
	WebElement cnt = driver.findElement(By.id("select-multiple-native"));
	
	Select sel = new Select(cnt);
	for(int i=0;i<5;i++)
	{
	 sel.selectByIndex(i);
	}
	//deselect canada
	//sel.deselectByIndex(2);
	
	//deselect all
//	sel.deselectAll();	
  }
}
