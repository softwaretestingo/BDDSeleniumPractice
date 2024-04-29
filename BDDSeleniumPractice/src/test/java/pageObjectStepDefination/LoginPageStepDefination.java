package pageObjectStepDefination;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.GenericUtils;
import utils.TestContextSetup;
public class LoginPageStepDefination {
	
	public WebDriver driver;
	public String productName;
	TestContextSetup testcontextsetup;
	String homePageURL="https://opencart.softwaretestingo.com/index.php?route=common/home";
	LoginPage loginPage;
	GenericUtils genericutils;
	
	//Constructor
	public LoginPageStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}
	
	@Given("User is on the OpenCart Landing Page")
	public void user_is_on_the_open_cart_landing_page() {
		loginPage=testcontextsetup.pageObjectManager.getLoginPage();
		genericutils = testcontextsetup.pageObjectManager.getGenericUtils();
		loginPage.launchURL(homePageURL);
		genericutils.maximizeBrowser();
	}
	@When("User Search {string} in the SearchBox")
	public void user_search_in_the_search_box(String productName) {
		testcontextsetup.productName=productName;
		loginPage.searchProduct(productName);
		loginPage.clickSearchBtn();
	}
}