package MethodsOfWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetText 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 //open googole
	 driver.get("https://www.google.com/");
	 //move the control to active element i.e search box
	 driver.switchTo().activeElement().sendKeys("iphone");
	 Thread.sleep(2000);
	 //add explicit wait
	 //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 //get the all suggetions of iphone using list
	 List<WebElement> allIphone = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
     
	 //wait.until(ExpectedConditions.visibilityOfAllElements(allIphone));
	 Thread.sleep(2000);
	 for(WebElement phone:allIphone)
	 {
		 System.out.println("Suggetions:"+phone.getText());
	 }
  }
}
