package My;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot 
{
   public static void main(String[] args) throws IOException 
   {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://demoapps.qspiders.com/");
	 driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
     TakesScreenshot ts = (TakesScreenshot)driver;
     File src = ts.getScreenshotAs(OutputType.FILE);
     File dest=new File("./Screenshots/Seleniums1.jpg");
     Files.copy(src, dest);
   }
}
