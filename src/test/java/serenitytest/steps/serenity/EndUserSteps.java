package serenitytest.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.CoachPage;
import serenitytest.pages.MainPage;
import serenitytest.pages.TeamPage;
import static org.junit.Assert.assertTrue;
public class EndUserSteps extends ScenarioSteps {

    MainPage mainPage;
    CoachPage coachPage;
    TeamPage teamPage;

    @Step
    public void enters(String keyword) {
        mainPage.enterKeywords(keyword);
    }

    @Step
    public void starts_search() {
        mainPage.lookupTerms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(mainPage.getDefinitions(), hasItem(containsString(definition)));
    }



//
    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
    @Step
    public void is_the_home_page() {
        mainPage.open();
    }

    @Step
    public void is_switch_to_team_page() {
        mainPage.openTeamPageByLink();
    }

    @Step
    public void is_switch_to_coach_page(String coach) {
        teamPage.openCoachPage(coach);
    }

    @Step
    public void is_see_info_about_coach(String coach) {
        coachPage.coachNameIsPresentAtPersonalPage(coach);
    }

    @Step
    public void should_see_coach(String foundCoach) {
        assertTrue(teamPage.checkThatPersonIsPresented(foundCoach));
    }

    @Step
    public void is_the_team_page() {
        teamPage.open();
    }


}