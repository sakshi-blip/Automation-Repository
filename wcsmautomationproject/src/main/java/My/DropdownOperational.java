package My;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOperational 
{
   public static void main(String[] args) 
   {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://demoapps.qspiders.com/");
	 //click on quick start
	 driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
	 //click on dropdown
	 driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	 //click on multiselect dropdown
	 driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
	 //select initial for phno
	 WebElement phno = driver.findElement(By.id("phoneInput"));
	 Select sel1 = new Select(phno);
	 
	 //select country
	 WebElement cnt = driver.findElement(By.id("select-multiple-native"));
	 Select sel2 = new Select(cnt);
	 
	 //operational methods
	 System.out.println("Single Select dropdown:"+sel1.isMultiple());

	 System.out.println("Multi Single Select dropdown:"+sel2.isMultiple());
	 
	 //getoptions of sinlgle dropdown
//	 List<WebElement> opt1 = sel1.getOptions();
//	 
//	 for(WebElement ele:opt1)
//	 {
//		String optt1 = ele.getText();
//		System.out.println(optt1);
//	 }
	 
	 //getoptions of multi select
//	 List<WebElement> opt2 = sel2.getOptions();
//	 
//	 for(WebElement ele:opt2)
//	 {
//		 String optt = ele.getText();
//		 System.out.println(optt);
//	 }
	 
	 //getAllSelected options first select some options for it
//	 
	 for(int i=1;i<3;i++)
	 {
		 sel2.selectByIndex(i);
	 }
//	 List<WebElement> aso = sel2.getAllSelectedOptions();
//	 for(WebElement ele:aso)
//	 {
//		 String opt3 = ele.getText();
//		 System.out.println(opt3);
//	 }
	 
	 //get first selected
	// System.out.println(sel2.getFirstSelectedOption().getText());   //method chaining
	 
	 //getWrappedElements
	 
      System.out.println(sel1.getWrappedElement().getText());
      System.out.println(sel2.getWrappedElement().getText());
	 
	 
	 
	 
	 
   }
}
