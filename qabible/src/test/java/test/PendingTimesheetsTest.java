package test;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PendingTimesheets;
import pages.TimesheetPage;

public class PendingTimesheetsTest extends Base {
	
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
	  public void pend() throws InterruptedException {
		  
		  PendingTimesheets pending=new PendingTimesheets(driver);
		  pending.viewclick();
		  driver.navigate().back();
		  pending.editclick();
		  pending.clientclick();
		  pending.scroll();
		  pending.saveclick();
		  Thread.sleep(1000);
		  pending.createtimesheetassertions();
		  pending.pendingclick();
		  pending.updateclick();
		  pending.updatealert();
		  pending.pendingclick();
		  pending.approveclick();
		  pending.generatepayslip();
		  pending.payslipalert();
		  pending.generateinvoice();
		  pending.invoicealert();
}
}
