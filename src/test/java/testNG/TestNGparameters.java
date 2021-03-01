package testNG;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGparameters {
	
	// parameters are testNG in framework and testing avoid the hard coding means pass the value of coding inside the code
	// we use data provider from excel if we have too many names 
	
	// instead 
	@Test(enabled = false) // it does disable the test case by using enabled = false
	@Parameters({"firstName","lastName"}) // parameters are testNG in framework and testing avoid the hard coding means pass the value of coding inside the code

	public void test(String fname, String lname) {
		
		System.out.println("first name: " +fname);
		System.out.println("last name: " +lname);
	}

}
