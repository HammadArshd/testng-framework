package conceptRefreshNaveen.screenShotDemo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {

    // This belongs to ITestListener and will execute only when the test is pass

    public void onTestSuccess(ITestResult result) {

    }

    // This belongs to ITestListener and will execute only on the event of fail test

    public void onTestFailure(ITestResult result) {
        System.out.println("Failed Test");
        failedTest(result.getMethod().getMethodName());
    }

    // This belongs to ITestListener and will execute before the main test start (@Test)

    public void onTestStart(ITestResult result) {
    }

    // This belongs to ITestListener and will execute only if any of the main test(@Test) get skipped

    public void onTestSkipped(ITestResult result) {
    }

}
