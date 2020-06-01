package test;

import org.testng.annotations.Test;

import pages.ApprovedTimesheets;
import pages.LoginPage;
import pages.TimesheetPage;

public class ApprovedTimesheetsTest extends Base{
	@Test(priority=1)
	  public void verifyCreateTimesheet() {
		  
		  LoginPage login=new LoginPage(driver);
		  login.setusername("carol");
		  login.setpassword("1q2w3e4r");
		  login.submitbuttonclick();
		  
		  TimesheetPage time=new TimesheetPage(driver);
		  time.timesheetclick();
		  
	  }  
	
	@Test(priority=2)
	public void approved() {
		  
		ApprovedTimesheets approve=new ApprovedTimesheets(driver);
		approve.approvedclick();
		approve.viewclick();
		approve.createtimesheetassertions();
	}	
}
