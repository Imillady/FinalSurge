package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.RegisteredPage;

public class BaseTest {

    LoginPage loginPage = new LoginPage();
    RegisteredPage registeredPage = new RegisteredPage();

    @BeforeMethod
    public void setUp(){
        Configuration.baseUrl = "https://log.finalsurge.com/";
        Configuration.browser = "Edge";
        Configuration.timeout = 10000;
        Configuration.clickViaJs = true;
    }
}
