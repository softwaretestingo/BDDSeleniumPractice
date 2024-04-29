package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By IphoneProductTitle=By.xpath("//div[@class='description']//a");
	
	public String getProductName()
	{
		return driver.findElement(IphoneProductTitle).getText();
	}	
}