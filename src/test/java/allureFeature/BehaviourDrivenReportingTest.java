package allureFeature;

import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Regression Tests")
@Feature("Login Tests")
public class BehaviourDrivenReportingTest {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Story("Invalid username and password login test.")
    public void severityAnnotationAllureTest(){
        System.out.println("Behaviour Drive Reporting Demo with @Epic, @Feature, @Story");
    }

}
