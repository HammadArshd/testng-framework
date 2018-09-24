package allureFeature;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class StepAnnotationTest {

    StepAnnotation stepAnnotation = new StepAnnotation();

    @Test
    public void stepAnnotationDemoTest(){
        stepAnnotation.stepAnnotationDemo("wrongUsername", "wrongPassword");
    }

    @Test
    public void stepAnnotationDemo1Test(){
        stepAnnotation.stepAnnotationDemo1("wrongUsername");
    }
    @Test
    public void stepAnnotationDemo2Test(){
        stepAnnotation.stepAnnotationDemo2("wrongPassword");
    }
}
