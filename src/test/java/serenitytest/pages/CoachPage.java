package serenitytest.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Created by дима on 27.05.2016.
 */


public class CoachPage extends PageObject {
    private By fio = By.xpath("//div[@class='greenHeader']");
    private By course1 =  By.xpath("//div[3]/div/ul/li/a");

    public boolean coachNameIsPresentAtPersonalPage(String name) {
        return find(fio).getText().contains(name);
    }

    public boolean courseIsPresentAtPersonalPage(String course){
        return find(course1).getText().contains(course);

    }
}