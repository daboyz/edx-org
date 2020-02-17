package edx.com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;


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

}