package testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opencart.softwaretestingo.com/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("freelancer@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("freelancer");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).submit();
		Thread.sleep(3000);
		String eltext=driver.findElement(By.xpath("//h2[contains(text(),'My Account')]")).getText();
		System.out.println(eltext);
	}

}
