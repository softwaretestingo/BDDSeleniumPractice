package pageObjects;
import org.openqa.selenium.WebDriver;

import utils.GenericUtils;
public class PageObjectManager 
{
	WebDriver driver;
	public LoginPage loginPage;
	public SearchPage searchPage;
	public GenericUtils genericutils;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage getLoginPage()
	{
		loginPage = new LoginPage(driver);
		return loginPage;
	}
	
	public SearchPage getSearchPage()
	{
		searchPage=new SearchPage(driver);
		return searchPage;
	}
	public GenericUtils getGenericUtils()
	{
		genericutils = new GenericUtils(driver);
		return genericutils;
	}
}