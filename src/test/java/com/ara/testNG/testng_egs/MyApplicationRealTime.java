package com.ara.testNG.testng_egs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class MyApplicationRealTime {
	
	 WebDriver driver;
//this is executed before any class or method and it will print the statement given here 	
@BeforeClass
	    public void startBrowser()
	    
	    {
	System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\webDriver\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	    	System.out.println("===== browser started======");
	    }
@Test
	public void startApp()
	{
//navigating to the given url
	driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
	
	//giving the timewait of 30 seconds
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//getting the current url
	String currentURL=driver.getCurrentUrl();
	//checking if the current url contains the given string or not
	Assert.assertTrue(currentURL.contains("auth/login"));
	//executes the given statement
	System.out.println("===== application loaded======");
	}


@Test(dependsOnMethods="startApp")

	public void loginApp()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//here in three lines it fills the username password and clicks on login button
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
	//agter login it checks if the webpage contains the admin tab button or not 
	boolean status=driver.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']/b")).isDisplayed();
	Assert.assertTrue(status);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//it prints this statement
	System.out.println("===== login successfull======");
	}


@Test(dependsOnMethods="loginApp")
	public void logoutApp() throws InterruptedException
	{
//here in last three lines it click on admin button then logout button
	driver.findElement(By.xpath(".//*[@id='welcome']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	
	//after logout the login page comes so it checks that if it can find the username field in the login page 
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='txtUsername']")).isDisplayed());
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	System.out.println("===== logout successful======");
	}
//it will be executed after every class and method
@AfterClass
public void closeBrowser()
{

	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.quit();
	System.out.println("===== browser closed======");
}
}