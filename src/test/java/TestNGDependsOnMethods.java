import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependsOnMethods {

    @Test
    public void loginTest(){
        System.out.println("print from loginTest");
        Assert.fail("all dependent tests will be ignored");
    }

    @Test(dependsOnMethods = "loginTest")
    public void homePageTest(){
        System.out.println("print from homePageTest()");
    }


    @Test(dependsOnMethods = "loginTest")
    public void searchPageTest(){
        System.out.println("print from searchPageTest()");
        Assert.fail();
    }
}
