package myWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoper 
{
    public static void main(String[] args) throws InterruptedException
    {
      	ChromeDriver driver = new ChromeDriver();
        wait = new WebDriverWait(driver,30);
      	
      	driver.manage().window().maximize();
      	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      	driver.get("https://www.shoppersstack.com/");
      	//click on login
      	WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
      	
      	//enter email
      	driver.findElement(By.id("Email")).sendKeys("sakshibd@gmail.com");
      	//enter pass
      	driver.findElement(By.id("Password")).sendKeys("Sakshi@SS1");
      	
      	
      	
      	
    }

	private static Object webDriverWait(ChromeDriver driver, Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}
}
