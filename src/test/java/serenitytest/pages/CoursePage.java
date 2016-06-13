package serenitytest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by дима on 27.05.2016.
 */


public class CoursePage extends PageObject {

    private By courseDescription = By.className("text");

    public List<String> getCourseDescriptions() {
        List<String> descriptionList = new ArrayList();
        List<WebElementFacade> element = findAll(courseDescription);
        for (WebElement i : element) {
            descriptionList.add(i.getText());
        }
        return descriptionList;
    }
}