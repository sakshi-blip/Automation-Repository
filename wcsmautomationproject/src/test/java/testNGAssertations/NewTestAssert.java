package testNGAssertations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTestAssert 
{
  @Test
  public void assertMethod() 
  {
    Reporter.log("Launch Browser!!",true);
    Reporter.log("Launch WebApplication by using url",true);
    Reporter.log("Verify and validate the login page",true);
    
    //apply soft assert
    SoftAssert sa = new SoftAssert();
    sa.assertEquals(true, true);
    Reporter.log("Login Performed!!",true);
    
    Reporter.log("Verify and validate the home page!!",true);
    //Apply hard assert
    Assert.assertEquals(true, false);
    Reporter.log("User Created!!",true);
    Reporter.log("Tast Created",true);
  }
}
