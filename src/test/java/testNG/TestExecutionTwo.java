package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import core.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObj.HotelPageObject;
import utilities.DriverUtility;

public class TestExecutionTwo extends Base {

	
	// the main concept is how to run two test Cases at the same time.
	
	
	
	
HotelPageObject hotelpb = new HotelPageObject();
	
	@BeforeMethod
	public void beforeMethod () {
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
//		driver.get(getURL());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(getURL());
		logger.info("browser opened successfully");
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
		//tearDown();
		logger.info("browser closed");
	}
	
//	@AfterTest
//	 public void afterTest() {
//	 System.out.println("Closing the browser ");
//	 driver.close();
//	}
//	
	@Test
	@Parameters({"userName","password"})
	public void loginToHotelTest(String userName, String password) {
		hotelpb = new HotelPageObject();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(hotelpb.signInIsPresent());
		hotelpb.clickOnSignIn();
	    softAssert.assertTrue(hotelpb. emailAddressIsPresent());
	    softAssert.assertTrue(hotelpb. passwordIsDisplayed());
	    softAssert.assertTrue(hotelpb. forgotPasswordLinkIsDisplayed());
	    softAssert.assertTrue(hotelpb. signInIsDisplayed());
	    DriverUtility.screenShot();
	    hotelpb.signInMethod(userName, password);
	    //hotelpb.signInMethod(userName, password);
	    softAssert.assertTrue(hotelpb. myAccountTextIsDisplayed());
	    softAssert.assertAll();
	    DriverUtility.screenShot();
	    
	    
	}
	
	
	
	
	
	
	
	
}
