package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CreateTimesheet {
	
	WebDriver driver;
	SoftAssert s1=new SoftAssert();
	@FindBy(linkText="Create Timesheet")
	private WebElement createtimesheet;
	
	@FindBy(xpath="//button[text()='Skip']")
	private WebElement skip;
	
	@FindBy(name="Timesheet[branch_id]")
	private WebElement branch;
	
	@FindBy(xpath="//span[@id='select2-timesheet-client_id-container']")
	private WebElement clientarrow;
	
	@FindBy(xpath="//li[@id='select2-timesheet-client_id-result-4m8y-3' or text()='Middleton Grove']")
	private WebElement client;
	
	@FindBy(xpath="//span[@id='select2-timesheet-worker_id-container']")
	private WebElement workerarrow;
	
	@FindBy(xpath="//li[@id='select2-timesheet-worker_id-result-foi6-3' or text()='Luminita  Buzea']")
	private WebElement worker;
	
	@FindBy(name="Timesheet[division_id]")
	private WebElement division;
	
	@FindBy(id="timesheet-date")
	private WebElement date;
	
	@FindBy(xpath="//select[@id='timesheet-employment_type' and @name='Timesheet[employment_type]' and @class='form-control']")
	private WebElement employment;
	
	@FindBy(xpath="//select[@name='Timesheet[description]' or @id='timesheet-description']")
	private WebElement job;
	
	@FindBy(xpath="//select[@name='Timesheet[category]' or @id='timesheet-category']")
	private WebElement category;
	
	@FindBy(xpath="//input[@name='Timesheet[po_number]']")
	private WebElement po_num;
	
	@FindBy(xpath="//input[@name='Timesheet[timesheet_number]']")
	private WebElement timesheet_num;
	
	@FindBy(xpath="//input[@id='timesheet-direct_client']")
	private WebElement directclient;
	
	@FindBy(xpath="//select[@id='rate-0-type_id']")
	private WebElement description;
	
	@FindBy(xpath="//select[@id='rate-0-frequency']")
	private WebElement frequency;
	
	@FindBy(xpath="//input[@id='rate-0-units']")
	private WebElement unit;
	
	@FindBy(xpath="//input[@id='rate-0-pay' or name='Rate[0][pay]' and @class='form-control tm-class']")
	private WebElement pay;
	
	@FindBy(xpath="//input[@id='rate-0-bill' or name='Rate[0][bill]']")
	private WebElement bill;
	
	@FindBy(xpath="//input[@id='rate-0-wtr']")
	private WebElement wtr;
	
	@FindBy(xpath="//input[@id='rate-0-awr']")
	private WebElement awr;
	
	@FindBy(xpath="//input[@id='rate-0-pension']")
	private WebElement pension;
	
	@FindBy(xpath="//button[@class='pull-right add-item1 btn btn-success btn-xs']")
	private WebElement expense;
	
	@FindBy(xpath="//select[@id='expense-0-type_id']")
	private WebElement expenseadhoc;
	
	@FindBy(xpath="//input[@id='expense-0-units']")
	private WebElement expenseunit;
	
	@FindBy(xpath="//input[@id='expense-0-pay']")
	private WebElement expensepay;
	
	@FindBy(xpath="//input[@id='expense-0-bill']")
	private WebElement expensebill;
	
	@FindBy(xpath="//button[@class='pull-right add-item2 btn btn-success btn-xs']")
	private WebElement adddeduction;
	
	@FindBy(xpath="//select[@id='deduction-0-type']")
	private WebElement type;
	
	@FindBy(xpath="//input[@id='deduction-0-amount' or name='Deduction[0][amount]']")
	private WebElement dedamount;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement savebutton;
	
	@FindBy(xpath="//table[@id='w0']//tbody//tr[1]//td")
	private WebElement tablenum;
	
	@FindBy(xpath="//table[@id='w0']//tbody//tr[2]//td")
	private WebElement tableclient;
	
	@FindBy(xpath="//table[@id='w0']//tbody//tr[3]//td")
	private WebElement tableworker;
	
public CreateTimesheet(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
public void createtimesheetclick() {
	
	createtimesheet.click();
}
public void skipclick() {
	
	skip.click();
}
public void alert() {
	
	Alert alert=driver.switchTo().alert();
	alert.accept();

}
public void selbranch() {
	
	Select drop1=new Select(branch);
	drop1.selectByIndex(1);
}
public void selclient() {
	clientarrow.click();
	client.click();
}
public void selworker() {
	
	workerarrow.click();
	worker.click();
}
public void seldivision() {
	
	Select drop4=new Select(division);
	drop4.selectByIndex(1);
}
public void setdate(String datevalue) {
	
	date.sendKeys(datevalue);
}
public void selemployment() {
	
	Select drop5=new Select(employment);
	drop5.selectByIndex(2);
}
public void seljob() {
	
	Select drop6=new Select(job);
	drop6.selectByVisibleText("Support Worker");
}
public void selcategory() {
	
	Select drop7=new Select(category);
	drop7.selectByVisibleText("Employee");
}
public void setpo_num(String ponum) {
	
	po_num.sendKeys(ponum);
}
public void settimesheet_num(String timenum) {
	
	timesheet_num.sendKeys(timenum);
}
public void clientclick() {
	
	directclient.click();
}
public void scroll() {
    JavascriptExecutor js = (JavascriptExecutor) driver;  
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
}

public void setdescription() {
	
	Select drop8=new Select(description);
	drop8.selectByVisibleText("Saturday Night");
}
public void setfrequency() {
	
	Select drop9=new Select(frequency);
	drop9.selectByIndex(2);
}
public void setunit(String unitval) {
	
	unit.sendKeys(unitval);
}
public void setpay(String payval) {
	
	pay.sendKeys(payval);
}
public void setbill(String billval) {
	
	bill.sendKeys(billval);
}
public void selwtr() {
	
	wtr.click();
}
public void selawr() {
	
	awr.click();
}
public void selpension() {
	
	pension.click();
}
public void expenseclick() {
	
	expense.click();
}
public void adhocsel() {
	
	Select drop10=new Select(expenseadhoc);
	drop10.selectByIndex(2);
}
public void setexpunit(String expunitval) {
	
	expenseunit.sendKeys(expunitval);
}
public void setexppay(String exppayval) {
	
	expensepay.sendKeys(exppayval);
}
public void setexpbill(String expbillval) {
	
	expensebill.sendKeys(expbillval);
}
public void adddeductionclick() {
	
	adddeduction.click();
}
public void seltype() {
	
	Select drop11=new Select(type);
	drop11.selectByIndex(2);
}
public void setamount(String amount) {
	
	dedamount.sendKeys(amount);
}
public void saveclick() {
	
	savebutton.submit();
}
public void createtimesheetassertions() {
	
	String expectednum="1234567";
	String actualnum=tablenum.getText();
	s1.assertEquals(actualnum, expectednum);
	
	String expectedclient="1234567";
	String actualclient=tableclient.getText();
	s1.assertEquals(actualclient, expectedclient);
	
	String expectedworker="1234567";
	String actualworker=tableworker.getText();
	s1.assertEquals(actualworker, expectedworker);
	
	s1.assertAll();
}






	

}
