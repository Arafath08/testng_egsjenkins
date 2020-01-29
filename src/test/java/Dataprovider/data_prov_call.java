package Dataprovider;

import org.testng.annotations.Test;

public class data_prov_call {

	@Test(dataProvider = "data-provider", dataProviderClass = DataProvider_wit_diff_class.class)
    public void testMethod(String u_name, String pass) 
    {
        System.out.println("Data is: " + u_name);
        System.out.println("Data is: " + pass);
    }
}
