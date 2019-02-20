package com.ara.testNG.testng_egs;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class errorMessageVerification {

	
	@Test
	public void errormessage()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\webDriver\\chromedriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
	//getting the url of the gmail webpage
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().window().maximize();
		
//it clicks on the next button without filling the username
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
//go for x path of error element ie ---//div[contains(text(),'Enter an email or phone number')]
		//and stores that error in the string error1
		
		String error1=driver.findElement(By.xpath("//div[contains(text(),'Enter an email or phone number')]")).getText();
		//stores the same error manually in string error2
		String error2="Enter an email or phone number";
		//compares both the string values
		Assert.assertEquals(error1, error2);
		
		System.out.println("test 1 verified");
//validate the assert condition
		Assert.assertTrue(error1.contains("Enter an email"));
		
		System.out.println("this is also  verified");


	}
}