package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class TestNGDataProviderConcept {

	@Test(dataProvider = "getExcelData")
	public void test(String firstName, String lastname, String email, String password) {
		
		System.out.println("First Name is: " + firstName);
		System.out.println("Last Name is : "+lastname);
		System.out.println("Email is: " +email);
		System.out.println("Password is: " +password);

	}

	@DataProvider()
	public Object[][] getExcelData() {

		Object data[][] = ExcelUtility.getExcelData("info");
		return data;
	}
	
	
	//data provider to login for different set of data to log in in excel i can test scenario
	// <---with multiple test of data by using excel in the framework.

	
	
	
	
	
}
