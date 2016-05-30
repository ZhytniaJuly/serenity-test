package serenitytest.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Created by дима on 27.05.2016.
 */


public class CoachPage extends PageObject {
    private By name = By.xpath("//div[@class='greenHeader']");

    public String getName() {
        return (find(name).getText());
    }

    public boolean coachNameIsPresentAtPersonalPage(String coach) {
        return find(name).getText().contains(coach);
    }
}