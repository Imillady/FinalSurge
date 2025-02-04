package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    SelenideElement usernameField = $(By.id("login_name"));
    SelenideElement passwordField = $(By.id("login_password"));
    SelenideElement loginButton = $(By.xpath("//*[@class='btn btn-beoro-1']"));
    SelenideElement userWelcome = $(By.className("user-info"));

    public LoginPage enterUsername(String username) {
        usernameField.val(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        passwordField.val(password);
        return this;
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean isUserLogIn() {
        return userWelcome.isDisplayed();
    }
}



