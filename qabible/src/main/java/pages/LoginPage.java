package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class LoginPage {

	WebDriver driver;
	SoftAssert s1=new SoftAssert();
	@FindBy(name="LoginForm[username]")
	private WebElement user;
    
    @FindBy(name="LoginForm[password]")
	private WebElement pass;
	
	@FindBy(how = How.NAME, using = "login-button") 
	private WebElement submit;
   
public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
public void setusername(String username) {
		
		user.sendKeys(username);
	}
public void clearusername() {
		
		user.clear();
	}
public void setpassword(String password) {
		
		pass.sendKeys(password);
	}
public void clearpassword() {
		
		pass.clear();
	}
public void submitbuttonclick() {
		
		submit.submit();
    }
public void verifypagetitle() {
	
	String expectedtitle="Payroll Application";
	String actualtitle=driver.getTitle();
	//SoftAssert s1=new SoftAssert();
	s1.assertEquals(actualtitle, expectedtitle,"Title not verified");
	s1.assertAll();

}
public void userenablecheck() {
	boolean fuser=user.isEnabled();
	//SoftAssert s1=new SoftAssert();
	s1.assertTrue(fuser);
	s1.assertAll();

}
public void passenablecheck() {
	boolean fpass=pass.isEnabled();
	s1.assertTrue(fpass);
	s1.assertAll();

}

	}
