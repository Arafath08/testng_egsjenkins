package testNGtutorials;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class pageTitleVerification {

	@Test
	public void VerifyPageTitle()
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\webDriver\\chromedriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://learn-automation.com/");
		driver.manage().window().maximize();
		//it captures the title of the page and store in the title1 string
		String title1=driver.getTitle();
		System.out.println("THE TITLE IS"+title1);
		
		//manually we are storing the page title from page source in the string title2
		
		String title2="Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step";
		
		Assert.assertEquals(title1, title2);
		//Assert.assertEquals(title1, title2);
		//System.out.println("test completed");
		//Assert.assertTrue(title1.contains("WebDriver tutorial"));
		System.out.println("page title 1 verified");


	}
	
}
