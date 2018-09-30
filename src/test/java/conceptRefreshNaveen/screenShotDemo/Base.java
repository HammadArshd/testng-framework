package conceptRefreshNaveen.screenShotDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Base {

    public static WebDriver driver;
    public static void initialization(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

    public void failedTest(String testMethodName) {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(srcFile, new File("failShot_" + testMethodName + ".jpg"));
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
