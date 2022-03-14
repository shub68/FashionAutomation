package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class signIn extends TestBase{
	
	public signIn() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signInButton;
	
	@FindBy(xpath="//h3[text()='Already registered?']")
	private WebElement checkSignInText;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailId;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;
	
	
	@FindBy(xpath="//i[@class='icon-lock left']")
	private WebElement sigIn;
	
	
	@FindBy(xpath="//div[@class='alert alert-danger']//p")
	private WebElement sigInError;
	
	
	@FindBy(xpath="//input[@class='is_required validate account_input form-control']")
	private WebElement newEmail;
	
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement createAccountBtn;
	
	
	
	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSigIn() {
		return sigIn;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getCheckSignInText() {
		return checkSignInText;
	}
	
	public boolean checkSignInTextVisibility() {
		return getCheckSignInText().isDisplayed();
	}

	public String sendData(String uname, String pass) throws InterruptedException {
		emailId.sendKeys(uname);
		Thread.sleep(2000);
		password.sendKeys(pass);
		Thread.sleep(2000);
		signInButton.click();
		
		
		/*WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeSelected(checkSignInText));*/
		
		Thread.sleep(5000);
		
		/*if(sigInError.isDisplayed()) {
			
			return "SignIn UnsucessFull";
		}
		else {
			System.out.println("Hi");
			return "SignIn Successfull";
		}*/
		
		return null;
	}

	public createAccountPage createAccount(String email) {
		newEmail.sendKeys(email);
		createAccountBtn.click();
		return new createAccountPage();
		
	}
	
	
	
	

}
