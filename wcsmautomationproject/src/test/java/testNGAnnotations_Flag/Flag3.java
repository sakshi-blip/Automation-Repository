package testNGAnnotations_Flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(invocationCount = 10)
  public void method1()
  {
     Reporter.log("Login!!");
  }
}
