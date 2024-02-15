package testNGAnnotations_Flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 
{
  @Test(description="it is use to perform login!!")
  public void method1() 
  {
     Reporter.log("method1 for login page",true);
  }
  
  public void method2() 
  {
     Reporter.log("method2 for login page",true);
  }
  
  public void method3() 
  {
     Reporter.log("method3 for login page",true);
  }
}
