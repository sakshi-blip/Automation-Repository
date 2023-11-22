package KeyWordDrivenFrameWork;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;

public class ActitimeValidLogin extends BaseTest
{
  public static void main(String[] args) throws FileNotFoundException 
  {
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	
	driver.findElement(By.name("usernmae")).sendKeys(flib.readDataFromProperty(""));
	driver.findElement(By.name("psw")).sendKeys(args);
	driver.findElement(By.id("loginButton")).click();
  }
}
