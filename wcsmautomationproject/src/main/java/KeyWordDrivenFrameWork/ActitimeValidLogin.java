package KeyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActitimeValidLogin extends BaseTest
{
  public static void main(String[] args) throws IOException, InterruptedException 
  {
	BaseTest bt = new BaseTest(); //to launch and close the browser
	Flib flib = new Flib();
	bt.openBrowser();
	
	WebElement usnTB = driver.findElement(By.name("Usernmae"));
	usnTB.sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties","Username"));
	
	WebElement pwdTB = driver.findElement(By.name("psw"));
	pwdTB.sendKeys(flib.readDataFromProperty("/src/main/resources/config.properties","Password"));
	
	
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	bt.closeBrowser();
  }
}
