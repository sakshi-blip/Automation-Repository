package listenerPackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest 
{
   static WebDriver driver;
   
   @BeforeMethod
   public void setUp()
   {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("http://127.0.0.1/login.do;jsessionid=2chj9jo5ebw8j");	 
   }
   
   public void failedSsMethod(String failedMethodName)
   {
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   File dest = new File("./Screenshots/"+failedMethodName+".png");
	   try
	   {
		   Files.copy(src, dest);
	   }
	   catch(Exception e)
	   {
		   
	   }
	   
	   
   }
}
