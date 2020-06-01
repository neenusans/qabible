package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class PendingTimesheets {
	WebDriver driver;
	SoftAssert s1=new SoftAssert();
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-eye-open']")
	private WebElement view;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-pencil']")
	private WebElement edit;
	
	@FindBy(xpath="//input[@id='timesheet-direct_client']")
	private WebElement directclient;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement savebutton;
	
	@FindBy(xpath="//a[text()='Pending Timesheets']")
	private WebElement pendingtimesheet;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-check']")
	private WebElement update;
	
	@FindBy(xpath="//button[text()='Approve Timesheets']")
	private WebElement approve;
	
	@FindBy(xpath="//button[text()='Generate Playslip']")
	private WebElement payslip;
	
	@FindBy(xpath="//button[text()='Generate Invoice']")
	private WebElement invoice;
	
	@FindBy(xpath="//table[@id='w0']//tbody//tr[5]//td")
	private WebElement tableclientexp;
	
public PendingTimesheets(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
public void viewclick() {
	
	view.click();
}
public void editclick() {
	
	edit.click();
}
public void clientclick() {
	
	directclient.click();
}
public void scroll() {
    JavascriptExecutor js = (JavascriptExecutor) driver;  
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
}
public void saveclick() {
	
	savebutton.submit();
}
public void pendingclick() {
	
	pendingtimesheet.click();
}
public void updateclick() {
	
	update.click();
}
public void updatealert() throws InterruptedException {
	
	Alert alert=driver.switchTo().alert();
	alert.accept();
	driver.switchTo().defaultContent();
    }
public void approveclick() {
	
	approve.click();
}
public void generatepayslip() {
	
	payslip.click();
}
public void payslipalert() throws InterruptedException {
	
	Alert alert1=driver.switchTo().alert();
	alert1.accept();
	driver.switchTo().defaultContent();
    Thread.sleep(9000);
	Alert alert2=driver.switchTo().alert();
	alert2.accept();
}
public void generateinvoice() {
	
	invoice.click();
}
public void invoicealert() throws InterruptedException {
		
		Alert alert3=driver.switchTo().alert();
		alert3.accept();
		driver.switchTo().defaultContent();
	    Thread.sleep(9000);
		Alert alert4=driver.switchTo().alert();
		alert4.accept();
	}
public void createtimesheetassertions() {
	
	
	String expecteddirectclient=tableclientexp.getText();
	pendingtimesheet.click();
	view.click();
	String actualdirectclient=tableclientexp.getText();
	s1.assertEquals(actualdirectclient, expecteddirectclient);
	
	
	
	s1.assertAll();
}

 

}
