package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ApprovedTimesheets {
	WebDriver driver;
	SoftAssert s1=new SoftAssert();
	
	@FindBy(xpath="//a[text()='Approved Timesheets']")
	private WebElement approved;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-eye-open']")
	private WebElement view;
	
	@FindBy(xpath="//table[@id='w0']//tbody//tr[2]//td")
	private WebElement tableclient;
	
public ApprovedTimesheets(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
public void approvedclick() {
	
	approved.click();
}
public void viewclick() {
	
	view.click();
}
public void createtimesheetassertions() {
	
	
	
	String expectedclient="The Vines";
	String actualclient=tableclient.getText();
	s1.assertEquals(actualclient, expectedclient);
	
	
	
	s1.assertAll();
}

}
