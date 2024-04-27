package searchProduct;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchIPhone {
	public WebDriver driver;
	public String productName,product_Name;

	@Given("User is on the OpenCart Landing Page")
	public void user_is_on_the_open_cart_landing_page()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/index.php?route=common/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User Search {string} in the SearchBox")
	public void user_search_in_the_search_box(String productName) {
		this.productName=productName;
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.xpath("//input[@name='search']/following-sibling::button")).click();
	}

	@Then("{string} product Should be Displayed")
	public void i_phone_product_should_be_displayed(String productName) {
		product_Name=driver.findElement(By.xpath("//div[@class='description']//a")).getText();
		System.out.println("Extracted Product Name Is: "+product_Name);
		
	}
	
	@Then("Validate Proudct Name")
	public void validate_proudct_name() {
		Assert.assertEquals(productName, product_Name);
		driver.quit();
	}
}