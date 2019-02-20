package com.ara.testNG.testng_egs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class firstScript {
	//description will always be executed ti make the script look more meaningful
	@Test(priority=1,description="this test case wil give login")
	public void loginApplication()
	{
		//Assert.assertEquals(11,13);
//this will not be executed as the assert statement is failing
		System.out.println("i logged in ");
		Assert.assertEquals(11,12);
		
	}
	
	//negative priority is more prior then positive one 
	@Test(priority=-3,description="this test case will select menu")
	public void selectMenu()
	{
		System.out.println("menu selected");
		
	}
	@Test(priority=2,description="this test case wil help u in check out")
	public void checkOut()
	{
		System.out.println("checked out");
		
	}
}
//execute this script to see the output ,it will be more clear then