package edx.com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://courses.edx.org/course")
public class CoursePage extends PageObject {

    @FindBy(xpath="l//button[@data-value='current']")
    private WebElementFacade currentCourses;

    public int getCurrent() {
        return Integer.parseInt(currentCourses.getText());
    }


    public void search_for_course(String courseName) {
        //userSearch.type(courseName);
    }

    public void subscribe() {
        //subscribeButton.click();
    }

}