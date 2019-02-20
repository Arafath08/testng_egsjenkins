package com.ara.testNG.testng_egs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Flipkart {

	public static WebDriver driver;
	public static String driverPath = "C:\\workspace\\tools\\selenium\\";
	public static String sBookKey = "Selenium";
	private static final String sSearchBox = "fk-top-search-box";
	private static final String sSearchResult = "//li[contains(text(),'in')]//span";
	private static final String sBookName = "(//a[contains(.,'" + sBookKey + "')])[last()]";
	private static final String sAddToCart = "(//input[contains(@value,'Add to Cart')])[1]";
	private static final String sViewCartXPath = "(//a[contains(.,'view cart')])[1]";

	public static void initWebDriver(String URL) throws InterruptedException {

		// Setting up Chrome driver path.
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\webDriver\\chromedriver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		// Launching Chrome browser.
		
		driver.get(URL);
		driver.manage().window().maximize();
	}

	public static void main(String[] args) throws InterruptedException {

		initWebDriver("http://www.flipkart.com");

		flipkartLogin();

		driver.findElement(By.id(sSearchBox)).sendKeys(sBookKey);

		WebElement searchResult = getElement(By.xpath(sSearchResult));
		searchResult.click();

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sBookName))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sAddToCart))).click();

		getElement(By.xpath(sViewCartXPath)).click();
		getElement(By.cssSelector("form[id='view-cart-form'] button")).click();
		getElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("test@testmail.com");

		// pause for a second and close the browser.
		Thread.sleep(1000);
		endSession();
	}

	public static WebElement getElement(final By locator) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver arg0) {
				return arg0.findElement(locator);
			}

		});

		return element;
	}

	public static void flipkartLogin() {
		driver.findElement(By.linkText("Log In")).click();

		// TBD: Fill your username/password of flipkart.
		getElement(By.cssSelector("input[placeholder='Enter email/mobile']")).sendKeys("arafath08051995@gmail.com");
		getElement(By.cssSelector("input[placeholder='Enter password']")).sendKeys("Neruppuda");
		getElement(By.cssSelector("input[value='Login'][class='submit-btn login-btn btn']")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TBD: Auto-generated catch block.
			e.printStackTrace();
		}
	}

	public static void endSession() {
		driver.close();
		driver.quit();
	}
}