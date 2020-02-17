package edx.com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://courses.edx.org/course")
public class CoursePage extends PageObject {

    @FindBy(xpath="l//button[@data-value='current']")
    private WebElementFacade currentCourses;

    public int getCurrent() {
        return Integer.parseInt(currentCourses.getText());
    }
}