package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://www.jqueryui.com/droppable");
       
       //drag and drop are designed under frame tag switch the control to that frame
       WebElement frameElement = driver.findElement(By.xpath("//iFrame[@class='demo-frame']"));
       
       //switch the controls to frame
       //driver.switchTo().frame(0);
       //driver.switchTo().frame("demo-frame");
       driver.switchTo().frame(frameElement);
       
       //identify draggable and droppable web element
       WebElement draggable = driver.findElement(By.id("draggable"));
       WebElement droppable = driver.findElement(By.id("droppable"));
       
       //need to use actions class to frag and drop
       Actions action = new Actions(driver);
       Thread.sleep(2000);
       action.dragAndDrop(draggable, droppable).perform();
       
       
	}
}
