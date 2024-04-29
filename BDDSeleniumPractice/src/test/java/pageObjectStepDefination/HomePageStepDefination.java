package pageObjectStepDefination;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utils.GenericUtils;
import utils.TestContextSetup;
public class HomePageStepDefination {
	
	public WebDriver driver;
	public String productName;
	TestContextSetup testcontextsetup;
	String homePageURL="https://opencart.softwaretestingo.com/index.php?route=common/home";
	HomePage homePage;
	GenericUtils genericutils;
	
	//Constructor
	public HomePageStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}
	
	@Given("User is on the OpenCart Landing Page")
	public void user_is_on_the_open_cart_landing_page() {
		homePage=testcontextsetup.pageObjectManager.getHomePage();
		genericutils = testcontextsetup.pageObjectManager.getGenericUtils();
		homePage.launchURL(homePageURL);
		genericutils.maximizeBrowser();
	}
	@When("User Search {string} in the SearchBox")
	public void user_search_in_the_search_box(String productName) {
		testcontextsetup.productName=productName;
		homePage.searchProduct(productName);
		homePage.clickSearchBtn();
	}
}