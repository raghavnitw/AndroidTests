package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
	
	private AppiumDriver<AndroidElement> driver;
	private static final Logger logger = Logger.getLogger(LoginPage.class.getName());

	@Before
	public void LoginTest() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "192.168.56.101:5555");
		capabilities.setCapability("app", "/Users/raghavender.m/Documents/fk-dev/GitRepos/fk-ekl-port-application/app/build/outputs/apk/app-debug.apk");
		capabilities.setCapability("appPackage", "com.flipkart.android.portapplication");
		capabilities.setCapability("appActivity", "com.flipkart.android.portapplication.activity.LoginActivity");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		/*AndroidDriver wd = null;
		try {
			wd = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Given("^Airport app is opened$")
	public void airport_app_is_opened() throws Throwable {
		logger.log(Level.INFO, "Airport App is opened");
	}

	@When("^I give login id as '(.+)'$")
	public void i_give_login_id_as(String arg1) throws Throwable {
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/TextInputLayout[1]/android.widget.EditText[1]")).clear();
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/TextInputLayout[1]/android.widget.EditText[1]")).sendKeys(arg1);
		logger.log(Level.INFO, "Given Login Id as "+arg1);
	}

	@When("^I give password as '(.+)'$")
	public void i_give_password_as_e_f(String arg1) throws Throwable {
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/TextInputLayout[2]/android.widget.EditText[1]")).clear();
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/TextInputLayout[2]/android.widget.EditText[1]")).sendKeys(arg1);
		logger.log(Level.INFO, "Given Password as "+arg1);
	}
	
	@When("^I click on login button$")
	public void clickLoginButton(){
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
		logger.log(Level.INFO, "Clicked on Login button");
	}

	@Then("^I see that login is '(.+)'$")
	public void i_see_that_login_is_success(String arg1) throws Throwable {
	    
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}

}
