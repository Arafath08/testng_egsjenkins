package Preserve_order;

import org.testng.annotations.Test;

public class preserve_order {

	@Test
	public void testCaseOne()
	{
	System.out.println("Im in testCaseOne - And in Regression Group");
	}
	@Test
	public void testCaseTwo(){
	System.out.println("Im in testCaseTwo - And in Regression Group");
	}
	@Test
	public void testCaseThree(){
	System.out.println("Im in testCaseThree - And in Smoke Test Group");
	}
	@Test
	public void testCaseFour(){
	System.out.println("Im in testCaseFour - And in Regression Group");
	}
	
	
}
