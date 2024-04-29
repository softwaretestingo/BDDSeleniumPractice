package utils;
import org.openqa.selenium.By;
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
	public void launchURL(String URL)
	{
		driver.get(URL);
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void doClick(By locator)
	{
		driver.findElement(locator).click();
	}
	public void doSubmit(By locator)
	{
		driver.findElement(locator).submit();;
	}
	public void doSendKeys(By locator, String value)
	{
		driver.findElement(locator).sendKeys(value);
	}
	public String getElementText(By locator)
	{
		String eleText = driver.findElement(locator).getText();
		return eleText;
	}
}