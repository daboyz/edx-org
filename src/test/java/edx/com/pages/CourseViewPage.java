package edx.com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://courses.edx.org/course")
public class CourseViewPage extends PageObject {

    @FindBy(xpath="//button//span[text()[contains(. ,'Enroll')]]")
    private WebElementFacade enrollBtn;

    @FindBy(xpath="//li/input[@name='audit_mode']")
    private WebElementFacade auditCourseBtn;

    @FindBy(xpath="//section[@class='dashboard-banner']")
    private WebElementFacade subscribeSuccessBanner;

    @FindBy(xpath="//span[@data-action-type='start']")
    private WebElementFacade startCourseBtn;

    @FindBy(xpath="//img[@class='logo']")
    private WebElementFacade dashboardNav;

    public void enroll() {
        enrollBtn.click();
        auditCourseBtn.click();
    }

    public String checkForStartBtn() {
        return startCourseBtn.getText().trim();
    }

    public void return_to_dashboard() {
        dashboardNav.click();
    }

}