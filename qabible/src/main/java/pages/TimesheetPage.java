package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class TimesheetPage {
	
	WebDriver driver;
	@FindBy(linkText="TimeSheet")
	private WebElement timesheet;
	
public TimesheetPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

public void timesheetclick() {
	
	timesheet.click();
}
public void verifypagetitle() {
	
	String expectedtitle="Timesheets";
	String actualtitle=driver.getTitle();
	SoftAssert s1=new SoftAssert();
	s1.assertEquals(actualtitle, expectedtitle);
	s1.assertAll();

}

}
