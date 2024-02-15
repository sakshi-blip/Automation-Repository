package listenerPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLogin extends BaseTest
{
  @Test
  public void validLoginMethod() 
  {
	  String expectedLoginTitle="actiTIME-Login";
	  Assert.assertEquals(driver.getTitle(), expectedLoginTitle);
	  
	  driver.findElement(By.name("Username")).sendKeys("Admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
  }
}
