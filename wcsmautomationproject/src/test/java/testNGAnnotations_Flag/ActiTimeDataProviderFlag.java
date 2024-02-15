package testNGAnnotations_Flag;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimeDataProviderFlag 
{
  @Test(dataProvider="TestData")
  public void invalidLoginMethod(String usn,String pass) 
  {
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("http://127.0.0.1/login.do;jsessionid=262fu33hdk4qb");
     
     driver.findElement(By.name("username")).sendKeys(usn);
	  driver.findElement(By.name("pwd")).sendKeys(pass);
	  driver.findElement(By.id("loginButton")).click();
  }
   @DataProvider(name="TestData")
   public Object[][] actiTimeTestDataMethod()
   {
	   Object[][] testData=new Object[5][2];
	   
	   testData[0][0]="ad_min";
	   testData[0][1]="mana_ger";
	   
	   testData[1][0]="admin123";
	   testData[1][1]="manager123";
	   
	   testData[2][0]="123admin";
	   testData[2][1]="2134manager";
	   
	   testData[3][0]="ad_min123";
	   testData[3][1]="mana_ger214";
	   
	   testData[4][0]="admi324n";
	   testData[4][1]="ma34nager";
	   
	   return testData;
   }
}
