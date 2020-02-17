package edx.com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://courses.edx.org")
public class DashboardPage extends PageObject {

    @FindBy(xpath="//span[@class='username']")
    private WebElementFacade userName;

    public String getUsername() {
        return userName.getText();
    }
}