package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.RegisteredPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    RegisteredPage registeredPage = new RegisteredPage();
    LoginPage loginPage = new LoginPage();
    String user = System.getProperty("user",utils.PropertyReader.getProperty("user"));
    String password = System.getProperty("password",utils.PropertyReader.getProperty("password"));

    @BeforeMethod
    public void setUp() {
        Configuration.baseUrl = "https://log.finalsurge.com/";
        Configuration.timeout = 10000;
        Configuration.clickViaJs = true;
    }

    @AfterMethod(alwaysRun = true)
    public void dropdown() {
        getWebDriver().quit();
    }
}
