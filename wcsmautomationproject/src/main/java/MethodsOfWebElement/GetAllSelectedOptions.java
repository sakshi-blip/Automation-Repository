package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllSelectedOptions {

	public static void main(String[] args) 
	{
	 	   WebDriver driver=new ChromeDriver();
	      
	 	   
	 	   driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	 	   
	 	   //multiselect dropdown
	 	   driver.findElement(By.xpath(""));
	}

}
