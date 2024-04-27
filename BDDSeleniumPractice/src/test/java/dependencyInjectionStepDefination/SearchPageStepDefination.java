package dependencyInjectionStepDefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import utils.TestContextSetup;
public class SearchPageStepDefination {
	
	public WebDriver driver;
	public String productName,product_Name;
	TestContextSetup testcontextsetup;
	
	//Constructor
	public SearchPageStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}
	
	@Then("{string} product Should be Displayed")
	public void product_should_be_displayed(String productName) {
		product_Name=testcontextsetup.driver.findElement(By.xpath("//div[@class='description']//a")).getText();
		System.out.println("Extracted Product Name Is: "+product_Name);
	}
	
	@Then("Validate Proudct Name")
	public void validate_proudct_name() {
		Assert.assertEquals(testcontextsetup.productName, product_Name);
		testcontextsetup.driver.quit();
	}
}
