package starter.stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;
import starter.questions.LabelsSsQuestions;
import starter.tasks.SwitchTo;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TopGunLab {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Then("{actor} verify the labels {} is visible for Top Gun Labs")
    public void heVerifyTheLabelsLabelIsVisibleForTopGunLabs(Actor actor, String label) {
        OnStage.theActorInTheSpotlight()
                .should(
                        eventually(
                                seeThat(LabelsSsQuestions.getLabelTg(label), CoreMatchers.equalTo(true)))
                );
    }

    @When("{actor} click Top Gun Lab button section")
    public void clickSmallSection(Actor actor) {
        actor.attemptsTo(
                Click.on(starter.UI.TopGunLab.SeeMoreButton)
        );
    }

    @Then("{actor} should see information Top Gun Labs")
    public void validateNewPage(Actor actor) {
        actor.attemptsTo(
                SwitchTo.toNewTab()
        );
        OnStage.theActorInTheSpotlight()
                .should(
                        eventually(
                                seeThat(LabelsSsQuestions.getTitleTopGunLab(), CoreMatchers.equalTo(true))),
                        eventually(
                                seeThat(LabelsSsQuestions.getTextTopGunLab(), CoreMatchers.equalTo(true)))
                );
    }
}