package conceptRefreshNaveen;

import core.DriverBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestWithPriority extends DriverBase {

    @BeforeMethod
    public void setUp(){
        setUpDriver();
        System.out.println("@BeforeMethod - setUp()");
    }

    @Test(priority = 1)
    public void googleTitleTest(){
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("@Test - googleTitleTest() - priority = 1");
    }

    @Test(priority = 2)
    public void googleLogoTest(){
        Assert.assertTrue(driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed());
        System.out.println("@Test - googleLogoTest() - priority = 2");
    }

    @Test(priority = 3)
    public void gmailLinkTest(){
        Assert.assertTrue(driver.findElement(By.linkText("Gmail")).isDisplayed());
        System.out.println("@Test - mailLinkTest() - priority = 3");
    }

    @Test(priority = 4)
    public void mailLinkTest(){
        Assert.assertTrue(driver.findElement(By.linkText("mail")).isDisplayed());
        System.out.println("@Test - mailLinkTest() - priority = 4");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("@AfterMethod - tearDown()");
        driver.quit();
    }
}
