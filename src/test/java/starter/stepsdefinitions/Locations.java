package starter.stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;
import starter.UI.SectionsPage;
import starter.questions.LabelsSsQuestions;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class Locations {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @And("{actor} slick to the next option {}")
    public void slickNextOption(Actor actor, Integer clicks) throws InterruptedException {
        for (int i = 0; i <= clicks; i++) {
            Thread.sleep(2000);
            actor.attemptsTo(
                    Click.on(SectionsPage.SlickNextArrow).afterWaitingUntilEnabled(),
                    Click.on(SectionsPage.SlickNextArrow).afterWaitingUntilPresent(),
                    Click.on(SectionsPage.SlickNextArrow)
            );
        }
    }

    @When("{actor} click locations on each small section {}")
    public void clickSmallSection(Actor actor, String title) {
        actor.attemptsTo(
                Click.on(SectionsPage.LabelsLocations.apply(title))
        );
    }

    @Then("{actor} should see information about locations on the world")
    public void verifyLocationsPage(Actor actor) {
        OnStage.theActorInTheSpotlight()
                .should(
                        eventually(
                                seeThat(LabelsSsQuestions.getTextLocationPage(), CoreMatchers.equalTo("TEAM Lublin")))
                );
    }
}
