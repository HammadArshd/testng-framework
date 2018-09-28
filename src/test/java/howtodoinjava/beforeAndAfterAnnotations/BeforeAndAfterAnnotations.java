package howtodoinjava.beforeAndAfterAnnotations;

import org.testng.annotations.*;

public class BeforeAndAfterAnnotations {

    @Test
    public void testCase() {
        System.out.println("===== Executing actual test ======");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite: The annotated method will be run before all tests in this suite have run.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite: The annotated method will be run after all tests in this suite have run.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the test tag is run.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the test tag have run.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass: The annotated method will be run after all the test methods in the current class have been run.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod: The annotated method will be run after all the test methods in the current class have been run.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod: The annotated method will be run after each test method.");
    }

//    ToDo: @BeforeGroups	The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
//    ToDo: @AfterGroups	The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
}
