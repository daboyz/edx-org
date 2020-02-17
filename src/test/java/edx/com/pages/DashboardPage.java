package edx.com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://courses.edx.org")
public class DashboardPage extends PageObject {

    @FindBy(xpath="//span[@class='username']")
    private WebElementFacade userName;

    @FindBy(xpath="//a[@class=\"active tab-nav-link\" and text()='\n" +
            "            Courses\n" +
            "          ']")
    private WebElementFacade findCourses;

    public String getUsername() {
        return userName.getText();
    }

    public void goToCourses() {
        clickOn(findCourses);
    }
}