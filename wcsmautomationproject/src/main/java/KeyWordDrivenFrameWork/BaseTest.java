package KeyWordDrivenFrameWork;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib
{
    static WebDriver driver;
	public void openBrowser() throws FileNotFoundException
	{
		Flib flib = new Flib();
		String browserValue=flib.readDataFromProperty("./src/main/resources/config.properties","Browser");
	    String url = readDataFromProperty("./src/main/resources/config.properties","Url");
		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Browser Value is Invalid");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	public void closeBrowser()
	{
		driver.quit();
	}
   
}
