package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.TestListener;

import static com.codeborne.selenide.Selenide.open;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    @Test(testName = "Успешный вход на сайт")
    public void SuccessfulLogin() {
        open("https://log.finalsurge.com/");
        loginPage.enterUsername(user)
                .enterPassword(password)
                .clickLoginButton();
        Assert.assertTrue(loginPage.isUserLogIn(), "Вход не выполнен.");
    }
}
