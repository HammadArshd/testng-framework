package allureFeature;

import io.qameta.allure.Step;

public class StepAnnotation {

    @Step("Login Step with username: {0}, password: {1}, for method: {method} step...")
    public void stepAnnotationDemo (String username, String password){
        System.out.println(username);
        System.out.println(password);
    }

    @Step("Verify username: {0} step...")
    public void stepAnnotationDemo1 (String expectedText) {
        System.out.println(expectedText);
    }

    @Step("Verify verifyLoginPassword: {0} step...")
    public void stepAnnotationDemo2 (String expectedText) {
        System.out.println(expectedText);
    }
}
