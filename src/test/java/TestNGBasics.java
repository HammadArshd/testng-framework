import org.testng.annotations.*;

public class TestNGBasics {

/*

Sequence of execution:

Setup system property for chrome
launch chrome browser
login to app


enter URL - @BeforeMethod
google logo test - @Test IMO Alphabetically Picked
logout from app - @AfterMethod

enter URL - @BeforeMethod
Google Title Test - @Test IMO Alphabetically Picked
logout from app - @AfterMethod

enter URL - @BeforeMethod
searchTest - @Test IMO Alphabetically Picked
logout from app- @AfterMethod


deleteAllCookies
Close browser
generateTestReport

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

    @Test
    public void searchTest(){
        System.out.println("searchTest");
    }

    @Test
    public void googleLogoTest(){
        System.out.println("google logo test");
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
