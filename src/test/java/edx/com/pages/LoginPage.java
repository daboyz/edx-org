package edx.com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://courses.edx.org/login")
public class LoginPage extends PageObject {

    @FindBy(id="login-email")
    private WebElementFacade userLogin;

    @FindBy(id="login-password")
    private WebElementFacade userPassword;

    @FindBy(xpath="//button[@type='submit']")
    private WebElementFacade loginButton;

    public void enter_credentials(String login, String password) {
        userLogin.type(login);
        userPassword.type(password);
    }

    public void press_login() {
        loginButton.click();
    }

    public String getUsername() {
        WebElementFacade usernameDisplay = find(By.xpath("//span[@class='username']"));
        return usernameDisplay.getText();
    }
}