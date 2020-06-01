package test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;
import pages.LoginPage;
import utility.ExcelData;


public class LoginTest extends Base {
  @Test(dataProvider = "logintestdata")
  public void verifylogin(String username,String password) throws InterruptedException {
	  LoginPage login=new LoginPage(driver);
	  login.clearusername();
	  login.clearpassword();
	  login.userenablecheck();
	  login.passenablecheck();
	  login.setusername(username);
	  login.setpassword(password);
	  login.submitbuttonclick();
	  Thread.sleep(1000);
	  login.verifypagetitle();
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://www.qabible.in/payrollapp/");
  }
  @DataProvider
  public Object[][] logintestdata() throws BiffException, IOException, InvalidFormatException {
	  Object[][] data = ExcelData.getDataFromSheet("G:\\notes\\Selenium\\qabiblelogin.xlsx");
	  return data;
  }
  

}
