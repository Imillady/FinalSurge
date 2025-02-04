package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestListener;

import static com.codeborne.selenide.Selenide.open;

@Listeners(TestListener.class)
public class RegisteredTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test(testName = "Ошибка при регистрации с пустыми полями")
    public void ErrorSingUpEmptyField() {
        open("https://log.finalsurge.com/");
        registeredPage.clickSignUpButton();
        registeredPage.clickCreateAccountButton();
        softAssert.assertEquals(registeredPage.ErrorEmptyFirstName(), "This field is required.",
                "Нет сообщния, что поле FirstName нужно заполнить");
        softAssert.assertEquals(registeredPage.ErrorLastName(), "This field is required.",
                "Нет сообщния, что поле LastName нужно заполнить");
        softAssert.assertEquals(registeredPage.ErrorEmptyPassword(), "This field is required.",
                "Нет сообщния, что поле Password нужно заполнить");
        softAssert.assertEquals(registeredPage.ErrorEmailAddress(), "This field is required.",
                "Нет сообщния, что поле Email нужно заполнить");
        softAssert.assertEquals(registeredPage.ErrorRetypePassword(), "This field is required.",
                "Нет сообщния, что поле Re-type Password нужно заполнить");
        softAssert.assertAll();
    }

    @Test(testName = "Ошибка при регистрации с другим паролем в Re-type")
    public void ErrorSingUpDiferentRe_type() {
        open("https://log.finalsurge.com/");
        registeredPage.clickSignUpButton()
                .enterFirstName("Иван")
                .enterLastName("Иванович")
                .enterEmail("atasdew@mail.ru")
                .enterPassword("1")
                .enterRe_typePassword("2")
                .clickCreateAccountButton();
        Assert.assertEquals(registeredPage.AlertPassword(), "Error: *Please enter a Password value with at " +
                        "least one number, lower-case letter, and upper-case letter between 7 and 15 characters in length.",
                "Нет сообщния, что поле Password и (или) Re-type не верно заполнены");
    }

    @Test(testName = "Ошибка при регистрации с паролем c недопустимым кол-вом символов",
            description = "Допустимое кол-во символов в пароле 7-15")
    public void ErrorSingUpCharacters() {
        open("https://log.finalsurge.com/");
        registeredPage.clickSignUpButton()
                .enterFirstName("Иван")
                .enterLastName("Иванович")
                .enterEmail("atasdew@mail.ru")
                .enterPassword("123456")
                .enterRe_typePassword("123456")
                .clickCreateAccountButton();
        Assert.assertEquals(registeredPage.AlertPassword(), "Error: *Please enter a Password value with at " +
                        "least one number, lower-case letter, and upper-case letter between 7 and 15 characters in length.",
                "Нет сообщния, что поле Password и (или) Re-type не верно заполнены");
    }

    @Test(testName = "Ошибка при регистрации с незаполненым полем Time Zone ")
    public void ErrorSingUpEmptyTimeZone() {
        open("https://log.finalsurge.com/");
        registeredPage.clickSignUpButton()
                .selectTimeZone("Select...")
                .clickCreateAccountButton();
        Assert.assertEquals(registeredPage.ErrorTimeZone(), "This field is required.",
                "Нет сообщния, что поле Re-type Password нужно заполнить");
    }
}

