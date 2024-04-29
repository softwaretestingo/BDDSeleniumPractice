package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestBase 
{
	WebDriver driver;
	public WebDriver WebDriverManager() 
	{
		if (driver == null) 
		{
			driver = new ChromeDriver();
		}
		return driver;
	}
}