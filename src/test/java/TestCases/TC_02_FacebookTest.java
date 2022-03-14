package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import PageClasses.HomePage;
import PageClasses.MyAccount;
import PageClasses.createAccountPage;
import PageClasses.facebook;
import PageClasses.signIn;

public class TC_02_FacebookTest extends TestBase{

	HomePage hp = null;
	signIn si = null;
	MyAccount ma=null;
	createAccountPage cap=null;
	facebook fb=null;
	
	@BeforeTest
	public void setup() throws IOException {
		loadProp();
		initlisation();
	}
	
	@Test
	public void goToFacebook() {
		hp=new HomePage();
		fb=hp.clickFacebook();
	}
	
	
}
