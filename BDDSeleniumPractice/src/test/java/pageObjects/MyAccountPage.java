package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class MyAccountPage 
{	
	WebDriver driver;
	public MyAccountPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public By myAccount= By.xpath("//h2[contains(text(),'My Account')]");
	public By myOrder= By.xpath("//h2[contains(text(),'My Orders')]");
	public String myAccountTitle= "My Account";
}
