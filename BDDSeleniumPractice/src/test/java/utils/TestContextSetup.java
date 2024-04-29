package utils;
import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;
public class TestContextSetup 
{
	public WebDriver driver;
	public String productName;
	public PageObjectManager pageObjectManager;
	TestBase testbase;
	GenericUtils genericutils;
	
	public TestContextSetup() {
		testbase=new TestBase();
		pageObjectManager=new PageObjectManager(testbase.WebDriverManager());
		genericutils=new GenericUtils(testbase.WebDriverManager());
	}
}