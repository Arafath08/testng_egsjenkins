package testNGtutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class myApplication {
	
@Test
	public void startApp()
	{
		System.out.println("starting app");
		Assert.assertEquals(11, 12);
	}

//this method id dependent on the startApp method
@Test(dependsOnMethods="startApp")

	public void loginApp()
	{
		System.out.println("logged in");
	}

//this method id dependent on the loginApp method
//if the first method is failing then the all methods will be skipped

@Test(dependsOnMethods="loginApp")
	public void logoutApp()
	{
		System.out.println("logged out");
	}
}