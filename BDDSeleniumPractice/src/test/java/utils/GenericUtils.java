package utils;
import org.openqa.selenium.WebDriver;
public class GenericUtils 
{
	WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}