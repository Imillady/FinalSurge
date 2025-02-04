package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.RegisteredPage;

import static utils.AllureUtils.takeScreenshot;

public class BaseTest {
    WebDriver driver;
    RegisteredPage registeredPage = new RegisteredPage();
    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void setUp() {
        Configuration.baseUrl = "https://log.finalsurge.com/";
        Configuration.timeout = 10000;
        Configuration.clickViaJs = true;
    }

    @AfterMethod(alwaysRun = true)
    public void dropdown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            takeScreenshot(driver);
        }
    }
}
