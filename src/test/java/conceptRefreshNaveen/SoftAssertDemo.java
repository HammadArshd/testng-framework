package conceptRefreshNaveen;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

//    SoftAssert softAssert = new SoftAssert();
//    Will create issues in failure results


    @Test
    public void demo(){
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Open Browser");
        Assert.assertEquals(true, true);

        System.out.println("Enter Username");
        System.out.println("Enter Password");
        System.out.println("Click on Sign In Button");
        Assert.assertEquals(true, true);


        System.out.println("validate Home Page");
        softAssert.assertEquals(true, false);


        System.out.println("go to deals page");
        System.out.println("create a deal");
        softAssert.assertEquals(true, false);

        System.out.println("go to contacts page");
        System.out.println("create a contact");
        softAssert.assertEquals(true, false);

        softAssert.assertAll();
    }

    @Test
    public void reWriteSoftAssertAllDemo(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Logout");
        softAssert.assertEquals(true, false);
//        softAssert.assertAll();
    }

    @AfterClass
    public void wrongApproachSoftAssertAllInTearDown(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("softAssert.assertAll() should not be handled here for all the tests in class. It will pass all the tests and will fail only this afterClass tearDown method.");
        softAssert.assertAll();
    }
}
