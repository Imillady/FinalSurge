package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
     SelenideElement usernameField = $(By.id("login_name"));
     SelenideElement passwordField = $(By.id("login_password"));
     SelenideElement loginButton = $(By.xpath("//*[@class='btn btn-beoro-1']"));
    SelenideElement userWelcome = $(By.className("user-info"));

    // Метод для ввода логина
    public LoginPage enterUsername(String username) {
        usernameField.val(username);
        return this;
    }

    // Метод для ввода пароля
    public LoginPage enterPassword(String password) {
        passwordField.val(password);
        return this;
    }

    // Метод для нажатия кнопки входа
    public void clickLoginButton() {
        loginButton.click();// Возвращаем объект главной страницы
    }

    public boolean isUserLoggedIn() {
        // Проверка успешного входа
        return userWelcome.isDisplayed(); // Если имя пользователя видно, значит вход успешен
        }
    }



