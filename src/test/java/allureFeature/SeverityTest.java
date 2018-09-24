package allureFeature;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class SeverityTest {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void severityAnnotationAllureTest(){
        System.out.println("Severity Annotation of Allure Demo");
    }

}
