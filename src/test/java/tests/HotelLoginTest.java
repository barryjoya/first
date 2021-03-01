package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import core.Base;
import pageObj.HotelPageObject;
import utilities.DriverUtility;

public class HotelLoginTest extends Base {
	// testNG is simpler in terms of coding than cucumber in cucumber we have to write scenario, scenario outline, then we have to create step defintion, 
	// in testNG we use one class we can write multiple test cases within the same class. 
	
	//first. I need to declare  an object of HotelPageObj
	
	HotelPageObject hotelpb = new HotelPageObject();
	
	@BeforeMethod
	public void beforeMethod () {
		initializeDriver(); 
		logger.info("browser opened successfully");
	}
	
	@AfterMethod
	public void afterMethod() {
		tearDown();
		logger.info("browser closed");
	}
	
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
	
	
	
	
	
	
	
	
//	
//	HotelPageObject hotelpb;
//	
//	@BeforeMethod
//	public void beforeMthod() {
//		initializeDriver();
//		logger.info("Browser opened Successfully");
//		
//	}
//	
//	@AfterMethod
//	public void afterMethod() {
//		tearDown();
//		logger.info("Browser closed");
//	}
//	
//	
//	@Test 
//	@Parameters({"userName","password"})
//	public void loginToHotelTest(String userName,String password) {
//		
//		hotelpb = new HotelPageObject();
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertTrue(hotelpb.signInIsPresent());
//		hotelpb.clickOnSignIn();
//		softAssert.assertTrue(hotelpb.emailAddressIsPresent());
//		softAssert.assertTrue(hotelpb.passwordIsDisplayed());
//		softAssert.assertTrue(hotelpb.forgotPasswordLinkIsDisplayed());
//		softAssert.assertTrue(hotelpb.signInIsDisplayed());
//		DriverUtility.screenShot();
//		hotelpb.signInMethod(userName, password);
//		softAssert.assertTrue(hotelpb.myAccountTextIsDisplayed());
//		softAssert.assertAll();
//		DriverUtility.screenShot();
//	}
//	
	
	
	
	

}



