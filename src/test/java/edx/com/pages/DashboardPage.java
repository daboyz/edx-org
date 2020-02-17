package edx.com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;

@DefaultUrl("https://courses.edx.org")
public class DashboardPage extends PageObject {

    @FindBy(xpath="//span[@class='username']")
    private WebElementFacade userName;

    @FindBy(xpath="//div[@class='nav-links']//a[@class='tab-nav-link discover-new-link']")
    private WebElementFacade findCourses;

    @FindBy(xpath="//button[@class='action action-more']//text()='Python for Data Science'")
    private WebElementFacade pyContextMenu;

    @FindBy(xpath="//li[@id='actions-item-unenroll-1']")
    private WebElementFacade unenrollCtrl;

    @FindBy(xpath="//input[@value='Unenroll']")
    private WebElementFacade confirmUnenroll;

    @FindBy(xpath="//div[@aria-labelledby='unenrollment-modal-title']//button[@class='close-modal']")
    private WebElementFacade closeReasonPopup;

    @FindBy(xpath="//li[@class='course-item']//h3[@class='course-title']//a[text()='Python for Data Science']")
    private WebElementFacade coursePyDash;

    public String getUsername() {
        return userName.getText();
    }

    public void refreshPage() {
        findCourses.sendKeys(Keys.F5);
    }

    public void goToCourses() {
        clickOn(findCourses);
    }

    public void unenrollFromPyCourse() {
        clickOn(pyContextMenu);
        clickOn(unenrollCtrl);
        clickOn(confirmUnenroll);
        clickOn(closeReasonPopup);
    }

    public boolean checkForCourse(String course) {
        switch (course) {
            case "Python for Data Science":
                return coursePyDash.isPresent();
            default:
                System.out.println("Unknown parameter");
                return false;
        }
    }

}