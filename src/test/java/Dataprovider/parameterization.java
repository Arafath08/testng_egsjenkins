package Dataprovider;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {

	@Test
    @Parameters({"author","searchKey"})
    public void testParameterWithXML( String author,String searchKey) {
		System.out.println("Welcome ::::"+author+" Your search key is::::"+searchKey);
	}
	
}
