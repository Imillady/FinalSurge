package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.RegisteredPage;
import utils.TestListener;

import static com.codeborne.selenide.Selenide.open;

@Listeners(TestListener.class)
public class RegisteredTest extends BaseTest {

    @Test (testName = "Успешный вход на сайт", description = "Валидный логин и пароль")
    public void test(){
        open("https://log.finalsurge.com/");
        RegisteredPage registeredPage = new RegisteredPage();
//        .login("standard_user", "secret_sauce");
//            assertEquals(
//                    productsPage.getTitle(),
//                    "Products",
//                    "Вход не выполнен");

        //        open("https://log.finalsurge.com/");
//        $(By.id("login_name")).val("atasdew@mail.ru");
//        $(By.id("login_password")).val("Frozent470");
//        $(By.xpath("//*[@class='btn btn-beoro-1']")).click();
//        $(By.className("user-info")).isDisplayed();

    }
}
