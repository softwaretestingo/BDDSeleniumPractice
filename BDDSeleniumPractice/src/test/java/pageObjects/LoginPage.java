package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	WebDriver driver;
	private By searchBox=By.name("search");
	private By searchBtn=By.xpath("//input[@name='search']/following-sibling::button");

	public void launchURL(String URL)
	{
		driver.get(URL);
	}
	public void searchProduct(String productName)
	{
		driver.findElement(searchBox).sendKeys(productName);
	}
	public void clickSearchBtn()
	{
		driver.findElement(searchBtn).click();
	}
}