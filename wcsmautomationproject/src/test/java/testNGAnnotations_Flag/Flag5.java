package testNGAnnotations_Flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 
{
  @Test(description="login performed!!")
  public void loginMethod() 
  {
	  Reporter.log("Method 1 for login page",true);
  }
  @Test (description="UserCreated",dependsOnMethods="loginMethod")
  public void createUserMethod()
  {
	  Reporter.log("Method2 for users page",true);
  }
  @Test
  public void logoutMethod()
  {
	  Reporter.log("Method 3 for logout page",true);
  }
}
