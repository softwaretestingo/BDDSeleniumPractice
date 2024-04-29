package pageObjectStepDefination;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import utils.GenericUtils;
import utils.TestContextSetup;
public class MyAccountPageStepDefination {
	
	public WebDriver driver;
	public String productName;
	TestContextSetup testcontextsetup;
	String homePageURL="https://opencart.softwaretestingo.com/index.php?route=common/home";
	HomePage homePage;
	MyAccountPage myaccountpage;
	GenericUtils genericutils;
	
	//Constructor
	public MyAccountPageStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		myaccountpage=testcontextsetup.pageObjectManager.getMyAccountPage();
		genericutils=testcontextsetup.pageObjectManager.getGenericUtils();
	}
	
	@Then("My Account Page Should be Displayed")
	public void my_account_page_should_be_displayed() {
	    String eleText=genericutils.getElementText(myaccountpage.myAccount);
	    Assert.assertEquals(myaccountpage.myAccountTitle, eleText);
	}
	@Then("Close the Browser")
	public void close_the_browser() {
	    genericutils.closeBrowser();
	}
}