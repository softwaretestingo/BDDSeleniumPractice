package dependencyInjectionStepDefination;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;
public class LoginPageStepDefination {
	
	public WebDriver driver;
	public String productName;
	TestContextSetup testcontextsetup;
	
	//Constructor
	public LoginPageStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}
	
	@Given("User is on the OpenCart Landing Page")
	public void user_is_on_the_open_cart_landing_page() {
		testcontextsetup.driver = new ChromeDriver();
		testcontextsetup.driver.manage().window().maximize();
		testcontextsetup.driver.get("https://opencart.softwaretestingo.com/index.php?route=common/home");
		testcontextsetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@When("User Search {string} in the SearchBox")
	public void user_search_in_the_search_box(String productName) {
		testcontextsetup.productName=productName;
		testcontextsetup.driver.findElement(By.name("search")).sendKeys(productName);
		testcontextsetup.driver.findElement(By.xpath("//input[@name='search']/following-sibling::button")).click();
	}
}
