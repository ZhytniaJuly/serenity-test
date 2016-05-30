package serenitytest.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.model.ExamplesTable;
import serenitytest.steps.serenity.EndUserSteps;

public class Dictionary {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the SkillsUp home page")
    public void givenTheUserIsOnTheSkillsUpHomePage() {
        endUser.is_the_home_page();
    }

    @Given("the user is on  Team Page")
    public void givenTheUserIsOnTheTeamPage() {
        endUser.is_the_team_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @When ("the user switch to TeamPage")
    public void whenTheUserSwitchToTeamPage() {endUser.is_switch_to_team_page();}

    @When("click on coach $coach")
    public void whenUserSwitchToCoachPage(String сoach){endUser.is_switch_to_coach_page(сoach);}

    @Then ("see info $coach about coach on Coach Page")
    public void thenUserSeeInfoAboutCoach(String сoach){endUser.is_see_info_about_coach(сoach);}

    @Then ("the user should see <foundCoach>")
    public void thenUserShouldSeeFoundCoach (String foundCoach){endUser.should_see_coach(foundCoach);}



    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }
}
