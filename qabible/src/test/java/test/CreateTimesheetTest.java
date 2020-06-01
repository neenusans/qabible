package test;

import org.testng.annotations.Test;


import pages.CreateTimesheet;
import pages.LoginPage;
import pages.TimesheetPage;

public class CreateTimesheetTest extends Base {
	
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
  
  public void details() {
	  
	  CreateTimesheet create=new CreateTimesheet(driver);
	  create.createtimesheetclick();
	  create.skipclick();
	  create.alert();
	  create.selbranch();
	  create.selclient();
	  create.selworker();
	  create.seldivision();
	  create.setdate("28-05-2020");
	  create.selemployment();
	  create.seljob();
	  create.selcategory();
	  create.setpo_num("88306");
	  create.settimesheet_num("1234567");
	  create.clientclick();
	  create.scroll();
	  create.setdescription();
	  create.setfrequency();
	  create.setunit("1000");
	  create.setpay("45689");
	  create.setbill("2893730");
	  create.selwtr();
	  create.selawr();
	  create.selpension();
	  create.expenseclick();
	  create.adhocsel();
	  create.setexpunit("2000");
	  create.setexppay("45000");
	  create.setexpbill("2893000");
	  create.adddeductionclick();
	  create.seltype();
	  create.setamount("2893000");
	  create.saveclick();
	  create.createtimesheetassertions();
  }
}

