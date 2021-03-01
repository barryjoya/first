package pageObj;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HotelPageObject extends Base {
	
	// We are following POM design pattern 
	// We are implementing PageFactory class 
	//we are using .initElement method to initialize the UI Elements 
	
	public HotelPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[contains(text(),'Sign in')]")
	private WebElement signIn;
	
	@FindBy (id = "email")
	private WebElement emailAddress;
	
	
	@FindBy (id = "passwd")
	private WebElement password;
	
	@FindBy (xpath = "//a[contains(text(),'Forgot your password?')]")
	private WebElement forgotPassword;
	
	
	@FindBy (xpath = "//button[@name ='SubmitLogin']/span")
	private WebElement signInButton;
	
	@FindBy(xpath="//h1[contains(text(),'My account')]")
	private WebElement myAccountText;
	
	
	public void signInMethod(String userName, String pass) {
		emailAddress.sendKeys(userName);
		password.sendKeys(pass);
		signInButton.click();
		
	}
	
	public void clickOnSignIn() {
		//signIn.sendKeys(Keys.ENTER); // sendKeys(Keys.Enter) is same thing as .click();
		signIn.click();
	}
	
	public boolean signInIsPresent() {
		return signIn.isDisplayed();
		
	}
	
	public boolean emailAddressIsPresent() {
		return emailAddress.isDisplayed();
	}
	
	
	public boolean passwordIsDisplayed() {
		return password.isDisplayed();
	}
	
	
	public boolean forgotPasswordLinkIsDisplayed() {
		return forgotPassword.isDisplayed();
	}
	
	public boolean signInIsDisplayed() {
		return signInButton.isDisplayed();
	}
	
	public boolean myAccountTextIsDisplayed() {
		return myAccountText.isDisplayed();
	}
	
	
	
	
	
	
	
	
//	public HotelPageObject() {
//		PageFactory.initElements(driver, this);
//	}
//	
//	@FindBy(xpath ="//span[contains(text(),'Sign in')]")
//	private WebElement signIn;
//	
//	@FindBy(id = "email")
//	private WebElement emailAddress;
//	
//	@FindBy(id ="passwd")
//	private WebElement password;
//	
//	@FindBy(xpath ="//a[contains(text(),'Forgot your password?')]")
//	private WebElement forgotPasswordLink;
//	
//	@FindBy(xpath ="//button[@name='SubmitLogin']/span")
//	private WebElement signInButton;
//	
//	@FindBy(xpath="//h1[contains(text(),'My account')]")
//	private WebElement myAccountText;
//	
//	
//	public void SignInMethod(String userName, String pass) {
//		emailAddress.sendKeys(userName);
//		password.sendKeys(pass);
//		signInButton.click();
//	}
//	
	

	
//	public boolean signInIsPresent() {
//		return signIn.isDisplayed();
//	}
//	
//	public boolean emailAddressIsPresent() {
//		return emailAddress.isDisplayed();
//	}
//	
//	public boolean passwordIsDisplayed() {
//		return password.isDisplayed();
//	}
//	
//	public boolean forgotPasswordLinkIsDisplayed() {
//		return forgotPasswordLink.isDisplayed();
//	}
//	
//	public boolean signInIsDisplayed() {
//		return signInButton.isDisplayed();
//	}
//	
//	public boolean myAccountTextIsDisplayed() {
//		return myAccountText.isDisplayed();
//	}

	
	// Whats jenkins? jobs is to trigger smoke every single day work day, jenkin will help us it will verify automatically
	// if the server is in good health and application is in order.  it does operate whenever we want to. it's like AC to set and sense the temperatur and start running.
	// it needs server the machine powerful RAM which process large of amount of data in shorter time. it's one 24/7 Jenkins is also awake. it links to gitHub repos. 
	// when it times for the regression test jenkin download the entire code from gitHub and run it to server. 
	
	// Smoketest , it only test the specific and very few  test cases wither determine if the application is in good shape.
	 //  <-- >Something is working or not everyday we need to know if our product is functioning. 
	   
	   
	// paralle execution means runing mutlitple test cases at same time within same browser or different browser. we can achive it by testNG.
	
	// Cross browser testing, runing same test cases in different browsers , chrome, IE, FF , Opera, Headless  , for example: TC 001
	
	
	
}
