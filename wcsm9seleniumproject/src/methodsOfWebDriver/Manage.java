package methodsOfWebDriver;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(2000);
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //maximize the browser
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  //minimize the browser
	  driver.manage().window().minimize();
	  Thread.sleep(2000);
	  //fullscreen the browser
	  driver.manage().window().fullscreen();
	  Thread.sleep(2000);
	  //set size for the browser
	  Dimension targetSize = new Dimension(350,450);
	  driver.manage().window().setSize(targetSize);
	  
	  //set position
	  Point targetPosition = new Point(450,250);
	  driver.manage().window().setPosition(targetPosition);
  }
}
