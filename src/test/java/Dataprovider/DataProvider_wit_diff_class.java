package Dataprovider;

import org.testng.annotations.DataProvider;

public class DataProvider_wit_diff_class {
	 @DataProvider(name = "data-provider")
	    public static Object[][] dataProviderMethod() 
	    {
		 Object[][] data=new Object[2][2];
		 data[0][0] ="sampleuser1";
			data[0][1] = "abcdef";

			// 2nd row
			data[1][0] ="testuser2";
			data[1][1] = "zxcvb";
			return data;
	    }
}
