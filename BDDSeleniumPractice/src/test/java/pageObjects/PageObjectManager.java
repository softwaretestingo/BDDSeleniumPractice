package pageObjects;
import org.openqa.selenium.WebDriver;

import utils.GenericUtils;
public class PageObjectManager 
{
	WebDriver driver;
	public HomePage homePage;
	public LoginPage loginPage;
	public MyAccountPage myaccountpage;
	public SearchPage searchPage;
	public GenericUtils genericutils;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public HomePage getHomePage()
	{
		homePage = new HomePage(driver);
		return homePage;
	}
	public LoginPage getLoginPage()
	{
		loginPage=new LoginPage(driver);
		return loginPage;
	}
	public MyAccountPage getMyAccountPage()
	{
		myaccountpage=new MyAccountPage(driver);
		return myaccountpage;
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