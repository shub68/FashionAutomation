package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import Base.TestBase;
import PageClasses.HomePage;
import PageClasses.MyAccount;
import PageClasses.createAccountPage;
import PageClasses.signIn;
import junit.framework.Assert;

public class TC_01_SigIn extends TestBase {

	HomePage hp = null;
	signIn si = null;
	MyAccount ma=null;
	createAccountPage cap=null;
	
	@BeforeTest
	public void setup() throws IOException {
		loadProp();
		initlisation();
	}

	@Test(priority = 1)
	public void loadHomePage() {
		hp = new HomePage();
		si = hp.clickSignIn();
	}

	@Test(priority = 2)
	public void onSignInPage() throws InterruptedException {
		Assert.assertEquals(si.checkSignInTextVisibility(), true);
		String msg=si.sendData(prop.getProperty("username"),prop.getProperty("password"));
		/*if(msg.equalsIgnoreCase("SignIn Successfull")) {
			
			ma=new MyAccount();
		
		}
		else if(msg.equalsIgnoreCase("SignIn UnsucessFull")) {
			cap=si.createAccount(prop.getProperty("newemail"));
			
		}*/
			
	}

	@AfterTest
	public void tearDown() {
		closeall();
	}

}
