package assignment1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class homayoss 
{
   public static void main(String[] args) throws InterruptedException, IOException 
   {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("http://omayo.blogspot.com/");
	 WebElement DT = driver.findElement(By.name("lname"));
	  Point loc = DT.getLocation();
	  int xaxis=loc.getX();
	  int yaxis=loc.getY();
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-40)+")");
      
      Thread.sleep(2000);
 	 File src = DT.getScreenshotAs(OutputType.FILE);
 	 File dest = new File("./Screenshots/DT.jpg");
     Files.copy(src, dest);
    }
}
