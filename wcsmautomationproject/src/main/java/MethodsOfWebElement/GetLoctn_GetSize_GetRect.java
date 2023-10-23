package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLoctn_GetSize_GetRect
{
  public static void main(String[] args) 
  {
	  WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://demoapps.qspiders.com/");
	    //identify email text box
	    WebElement emailTB = driver.findElement(By.cssSelector("input#email"));
		//get the location
	    Point loc = emailTB.getLocation();
	    int xaxis = loc.getX();
	    int yaxis = loc.getY();
	    System.out.println("Location of emailtext box"+xaxis+":"+yaxis);
	    
	    //get size
	    Dimension size = emailTB.getSize();
	    int height = size.getHeight();
	    int width = size.getWidth();
	    System.out.println("Height and widht:"+height+":"+width );
	    
	    //get rect
	    
  }
}
