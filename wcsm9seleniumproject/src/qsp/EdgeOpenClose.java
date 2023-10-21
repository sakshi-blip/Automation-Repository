package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeOpenClose 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new EdgeDriver();
	System.out.println("Open");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	driver.close();
	System.out.println("close");
  }
}
