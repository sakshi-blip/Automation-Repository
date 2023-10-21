package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtext 
{
  public static void main(String[] args) 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/search?gs_ssp=eJzj4tDP1TfITc9OV2A0YHRg8GJLzE2sys8DAELoBhw&q=amazon&rlz=1C1CHBF_enIN1044IN1045&oq=amez&gs_lcrp=EgZjaHJvbWUqFQgCEC4YChiDARjHARixAxjRAxiABDIGCAAQRRg5MgYIARBFGEAyFQgCEC4YChiDARjHARixAxjRAxiABDIPCAMQABgKGIMBGLEDGIAEMg8IBBAAGAoYgwEYsQMYgAQyDwgFEAAYChiDARixAxiABDIPCAYQABgKGIMBGLEDGIAEMgQIBxAF0gEIMjgyN2owajSoAgCwAgA&sourceid=chrome&ie=UTF-8");
	 //using text()
	 driver.findElement(By.xpath("//span[text()='Amazon Great Indian Festival - Starts 8th October']")).click();
	 
  }
}
