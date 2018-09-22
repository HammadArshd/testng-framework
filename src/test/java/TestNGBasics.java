import org.testng.annotations.*;

public class TestNGBasics {

/*

Sequence of execution:

1. Setup System Property for Chrome
2. launchBrowser
3. login to app
4. enter URL
5. Google Title Test
6. logout from app
7. Close Browser
8. deleteAllCookies
9. generateReport

 */

    @BeforeSuite
    public void setup(){
        System.out.println("Setup system property for chrome");
    }

    @BeforeTest
    public void launchBrowser(){
        System.out.println("launch chrome browser");
    }

    @BeforeClass
    public void login(){
        System.out.println("login to app");
    }

    @BeforeMethod
    public void enterURL(){
        System.out.println("enter URL");
    }

    @Test
    public void googleTitleTest(){
        System.out.println("Google Title Test");
    }

    @AfterMethod
    public void logout(){
        System.out.println("logout from app");
    }

   @AfterClass
    public void deleteAllCookies(){
        System.out.println("deleteAllCookies");
    }

    @AfterTest
    public void closeBrowser(){
        System.out.println("Close browser");
    }

    @AfterSuite
    public void generateTestReport(){
        System.out.println("generateTestReport");
    }
}
