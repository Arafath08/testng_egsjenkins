package com.ara.testNG.testng_egs;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/* import org.testng.asserts.SoftAssert;  for the soft assert 
 * import org.testng.Assert; for the assert
 * run all the scripts as testng not with the java
 * 
 * */


public class assertionMethod {

	//the @Test includes all the code written in this method to the testng
	@Test
	public void Test1()
	{
		Assert.assertEquals(4,2,"hello it is not equal");
		//here only the comment hello it is not equal will be printed as the condition is failing to print
		System.out.println("test 1 completed");
	}


	@Test
	public void Test2()
	{
		Assert.assertEquals(4,4,"hello it is equal");
		//here the comments will not be printed as it satisfy the assertequal condition 
		System.out.println("test 2 completed");

	}
	
	@Test
	public void Test3()
	{
		Assert.assertEquals("hello","hello","it will not print this");
		System.out.println("test 3 completed");

	}
	@Test
	public void Test4()
	{
		String str="azmat ali";
		//Assert.assertTrue is checking if the string here is contained in str or not
		Assert.assertTrue(str.contains("azmat"));
		System.out.println("test 4 completed");

	}
	//soft asseert,here if the assert function is failing also then the print statement is printed
	@Test
	public void softAssert()
	{
		SoftAssert assertion=new SoftAssert();
		
		System.out.println("test 5 started");
		
		assertion.assertEquals(11, 12,"THIS HAS FAILED");
		//above condition is failing then also the below print statement will be printed
		System.out.println("test 5 completed");
		
		assertion.assertAll();

	}
}
