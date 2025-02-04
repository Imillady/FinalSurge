package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisteredPage {

    SelenideElement FirstNameField = $(By.id("create_first"));
    SelenideElement LastNameField = $(By.id("create_last"));
    SelenideElement EmailAddressField = $(By.id("create_email"));
    SelenideElement PasswordField = $(By.id("password_meter"));
    SelenideElement Re_typePasswordField = $(By.id("create_passwordmatch"));
    SelenideElement SignUpButton = $(By.xpath("//*[@href='register.cshtml?page_redirect=%2f']"));
    SelenideElement EmptyFirstName = $(By.xpath("//*[@for='create_first' and contains(@class, 'error')]"));
    SelenideElement EmptyLastName = $(By.xpath("//*[@for='create_last' and contains(@class, 'error')]"));
    SelenideElement EmptyEmailAddress = $(By.xpath("//*[@for='create_email' and contains(@class, 'error')]"));
    SelenideElement EmptyPassword = $(By.xpath("//*[@for='password_meter' and contains(@class, 'error')]"));
    SelenideElement EmptyRetypePassword = $(By.xpath("//*[@for='create_passwordmatch' and contains(@class, 'error')]"));
    SelenideElement CreateAccountButton = $(By.xpath("//*[@type='submit']"));
    SelenideElement PasswordError = $(By.xpath("//*[@class='alert alert-error']"));
    SelenideElement EmptyTimeZone = $(By.xpath("//*[@for='create_timezone' and contains(@class, 'error')]"));
    SelenideElement TimeZoneField = $(By.id("create_timezone"));

    public RegisteredPage clickSignUpButton() {
        SignUpButton.click();
        return this;
    }

    public void clickCreateAccountButton() {
        CreateAccountButton.click();
    }

    public RegisteredPage enterFirstName(String FirstName) {
        FirstNameField.val(FirstName);
        return this;
    }

    public RegisteredPage enterLastName(String LastName) {
        LastNameField.val(LastName);
        return this;
    }

    public RegisteredPage enterEmail(String Email) {
        EmailAddressField.val(Email);
        return this;
    }

    public RegisteredPage enterPassword(String Password) {
        PasswordField.val(Password);
        return this;
    }

    public RegisteredPage enterRe_typePassword(String Re_typePassword) {
        Re_typePasswordField.val(Re_typePassword);
        return this;
    }

    public String ErrorEmptyFirstName() {
        return EmptyFirstName.getText();
    }

    public String ErrorLastName() {
        return EmptyLastName.getText();
    }

    public String ErrorEmptyPassword() {
        return EmptyPassword.getText();
    }

    public String ErrorEmailAddress() {
        return EmptyEmailAddress.getText();
    }

    public String ErrorRetypePassword() {
        return EmptyRetypePassword.getText();
    }

    public String AlertPassword() {
        return PasswordError.getText();
    }

    public String ErrorTimeZone() {
        return EmptyTimeZone.getText();
    }

    public RegisteredPage selectTimeZone(String TimeZone) {
        TimeZoneField.selectOption(TimeZone);
        return this;
    }
}
