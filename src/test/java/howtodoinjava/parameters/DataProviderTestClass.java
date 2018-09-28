package howtodoinjava.parameters;

import org.testng.annotations.Test;

public class DataProviderTestClass {
    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testMethod(String data)
    {
        System.out.println("Data is: " + data);
    }
}
