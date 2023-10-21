package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp 
{
  public static void main(String[] args) throws InterruptedException 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the browser value:");
	String browserValue = sc.next();
	if(browserValue.equalsIgnoreCase("Chrome"))
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.close();
	  System.out.println("Chrome browser execution done");
	}
	else if(browserValue.equalsIgnoreCase("Edge"))
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		System.out.println("Edge browser execution done");
	}
	else
	{
		System.out.println("Wrong input given by user!!!!");
	}
  }
}
