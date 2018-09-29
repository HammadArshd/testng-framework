package conceptRefreshNaveen.retryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

//    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void googleTitleTest(){
        System.out.println("Google Title Test");
        Assert.fail();
    }

    @Test
    public void searchTest(){
        System.out.println("searchTest");
        Assert.fail();
    }

    @Test
    public void googleLogoTest(){
        System.out.println("google logo test");
    }
}
