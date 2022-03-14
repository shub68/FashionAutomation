package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
	

	public static WebDriver driver;
	public static Properties prop;
	

	public static void loadProp() throws IOException {
		FileInputStream file=new FileInputStream
				("C:\\Users\\User\\Desktop\\DOMINATORS\\FashionWebsiteAutomation\\src\\main\\java\\Base\\config.properties");
		prop=new Properties();
		prop.load(file);
	}

	public static void initlisation() {
		String Browser=prop.getProperty("browser");
		if(Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\driver\\chromedriver4.exe");
			
			ChromeOptions ch=new ChromeOptions();
			ch.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(ch);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			driver.manage().deleteAllCookies();
		}
	}
	
	public void closeall() {
		driver.close();
	}
}
