package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class createAccountPage extends TestBase{
	
	public createAccountPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath="//div[@class='radio']")
	WebElement title;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement days;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement months;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement years;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement add_fname;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement add_lname;
	
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	
	@FindBy(xpath="//select[@id='id_state']")
	WebElement state;
	
	
	@FindBy(xpath="//input[@id='postcode']")
	WebElement postcode;
	
	
	@FindBy(xpath="//select[@id='id_country']")
	WebElement country;
	
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement mobile;
	
	
	@FindBy(xpath="//input[@id='alias']")
	WebElement alias_address;
	
	
	
	@FindBy(xpath="//li[@class='facebook']")
	WebElement facebook;
	
	public facebook clickFacebook() {
		facebook.click();
		return new facebook();
		
	}
	
}
