package test;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TimesheetPage;

public class TimesheetTest extends Base {
  @Test
  public void verifyTimeSheet() {
	  
	  LoginPage login=new LoginPage(driver);
	  login.setusername("carol");
	  login.setpassword("1q2w3e4r");
	  login.submitbuttonclick();
	  
	  TimesheetPage time=new TimesheetPage(driver);
	  time.timesheetclick();
	  time.verifypagetitle();
  }
}
