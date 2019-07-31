/*package com.ara.testNG.testng_egs;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Assert_type {

	String class_Name = "Soft_Hard_Assert";

	Assertion hardAssert = new Assertion();

	SoftAssert softAssert = new SoftAssert();

@Test
public void hardAssertMethod() {

		hardAssert.assertTrue(true == true);

		hardAssert.assertEquals("Soft_Hard_Assert", "Soft_Hard_Assert");

		hardAssert.assertEquals(class_Name, "Soft_Hard_Assert");
		System.out.println("hardAssertMethod Successfully passed!");
}

@Test
public void softAssertionMethod() {
		softAssert.assertTrue(true == true);

		softAssert.assertEquals("Soft_Hard_Assert", "Soft_Hard_Assert");

		softAssert.assertEquals(class_Name, "Soft_Hard_Assert");

		System.out.println("softAssertionMethod Successfully passed!");

		softAssert.assertAll();
}
}*/

package com.ara.testNG.testng_egs;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_type {

	@Test
	public void softAssert(){
		SoftAssert softAssertion= new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertTrue(false);
		System.out.println("softAssert Method Was Executed");
	}
	
	@Test
	public void hardAssert(){
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Was Executed");
	}
	@Test
	public void test1(){
	try{
	Assert.assertTrue(2>1);
	System.out.println("Assertion passed in Test 1");
	
	Assert.assertFalse(1<0);
	System.out.println("Assertion passed in Test 1");
	Assert.assertEquals(false, false);
	System.out.println("Assertion passed in Test 1");
	} catch(AssertionError ae){
	ae.printStackTrace();
	}
	}
	@Test
	public void test2(){
	try{
	Assert.assertTrue(2<1);
	System.out.println("Assertion Failed in Test 2");
	
	Assert.assertFalse(1>0);
	System.out.println("Assertion Failed in Test 2");
	Assert.assertEquals("Sample", "Sample");
	System.out.println("Assertion passed in Test 2");
	} catch(AssertionError ae){
	ae.printStackTrace();
	}
	}
}