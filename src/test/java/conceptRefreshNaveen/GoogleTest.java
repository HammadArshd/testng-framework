package conceptRefreshNaveen;

import core.DriverBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest extends DriverBase {

    @BeforeMethod
    public void setUp(){
        setUpDriver();
        System.out.println("@BeforeMethod - setUp()");
    }

    @Test
    public void googleTitleTest(){
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("@Test - googleTitleTest()");
    }

    @Test
    public void googleLogoTest(){
        Assert.assertTrue(driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed());
        System.out.println("@Test - googleLogoTest()");
    }

    @Test
    public void gmailLinkTest(){
        Assert.assertTrue(driver.findElement(By.linkText("Gmail")).isDisplayed());
        System.out.println("@Test - mailLinkTest()");
    }

    @Test
    public void mailLinkTest(){
        Assert.assertTrue(driver.findElement(By.linkText("mail")).isDisplayed());
        System.out.println("@Test - mailLinkTest()");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("@AfterMethod - tearDown()");
        driver.quit();
    }
}
