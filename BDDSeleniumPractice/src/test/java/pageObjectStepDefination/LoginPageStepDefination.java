package pageObjectStepDefination;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.GenericUtils;
import utils.TestContextSetup;
public class LoginPageStepDefination {
	
	public WebDriver driver;
	TestContextSetup testcontextsetup;
	GenericUtils genericutils;
	LoginPage loginpage;
	
	//Constructor
	public LoginPageStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		loginpage=testcontextsetup.pageObjectManager.getLoginPage();
		genericutils=testcontextsetup.pageObjectManager.getGenericUtils();
	}
	
	@Given("User is on the Login page")
	public void user_is_on_the_login_page() throws InterruptedException {
	    genericutils.launchURL(loginpage.loginPageURL);
	    genericutils.maximizeBrowser();
	    Thread.sleep(3000);
	}
	@When("^User eneters the (.+) and (.+) credentials$")
	public void user_eneters_the_and_credentials(String username, String password) {
	    System.out.println("UserName Is: "+username);
	    System.out.println("Password Is: "+password);
	    genericutils.doSendKeys(loginpage.emailID, username);
	    genericutils.doSendKeys(loginpage.password, password);
	}
	@When("Click the Login Button")
	public void click_the_login_button() {
		genericutils.doSubmit(loginpage.loginBtn);
	}
}