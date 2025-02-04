package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestListener;

import static com.codeborne.selenide.Selenide.open;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    @Test(testName = "Успешный вход на сайт", description = "Валидный логин и пароль")
    public void SuccessfulLogin() {
        open("https://log.finalsurge.com/");
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("atasdew@mail.ru")
                .enterPassword("Frozent470")
                .clickLoginButton();
        Assert.assertTrue(loginPage.isUserLoggedIn(), "Вход не выполнен.");
    }
}
