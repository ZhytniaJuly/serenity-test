package serenitytest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by дима on 11.06.2016.
 */
public class SearchPage extends PageObject {
    private By resultTitle = By.xpath(".//*[@id='xsltsearch_results']/div[position()>0]/p[1]/a");
    private By resultDescription = By.xpath(".//*[@id='xsltsearch_results']/div[position()>0]/p[2]");

    public List<String> resultListTitles() {
        List resultListTitles = new ArrayList();
        List<WebElementFacade> element = findAll(resultTitle);
        for (WebElement i : element) {
            resultListTitles.add(i.getText());
        }
        return resultListTitles;
    }

    public List<String> resultListDescriptions() {
        List resultListDescription = new ArrayList();
        List<WebElementFacade> element = findAll(resultDescription);
        for (WebElement i : element) {
            resultListDescription.add(i.getText());
        }
        return resultListDescription;
    }

    public boolean nameIsNotFound(String name) {
        try {
            find(resultTitle).getText().contains(name);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
