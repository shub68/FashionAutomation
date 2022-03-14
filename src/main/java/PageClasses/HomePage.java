package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement HomesignInButton;

	public WebElement getHomesignInButton() {
		return HomesignInButton;
	}
	
	public signIn clickSignIn() {
		HomesignInButton.click();
		return new signIn();
	}
	
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}

}
