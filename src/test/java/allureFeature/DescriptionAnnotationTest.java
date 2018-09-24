package allureFeature;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class DescriptionAnnotationTest {

    @Description("Test Description: Additional description can be added with @Description annotation")
    @Test(description = "This test elaborate the behaviour of @Description annotation.")
    public void descriptionAnnotationTest(){
        System.out.println("Focus on Description in allure report's test overview section.");
    }

    @Description("Test Description: Login test with wrong username and wrong password.")
    @Test(description = "Invalid Login Scenario with wrong username and password.")
    public void meaningfulDescriptionTest(){
        System.out.println("Invalid Login Scenario with wrong username and password.");
    }
}
