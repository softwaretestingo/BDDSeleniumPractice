package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage 
{	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//Variables
	public String loginPageURL="https://opencart.softwaretestingo.com/index.php?route=account/login";
	
	
	//Locators
	public By emailID= By.xpath("//input[@name='email']");
	public By password= By.xpath("//input[@name='password']");
	public By loginBtn= By.xpath("//button[contains(text(),'Login')]");
	
	//Actions
	
	
	
}
