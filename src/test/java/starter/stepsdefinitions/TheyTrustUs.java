package starter.stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;
import starter.UI.SectionsPage;
import starter.questions.SectionInformationQuestions;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TheyTrustUs {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @And("{actor} verify the icon {} is visible")
    public void heVerifyTheIconIconNumberIsVisible(Actor actor,String icon) {
        OnStage.theActorInTheSpotlight()
                .should(
                        eventually(
                                seeThat(SectionInformationQuestions.getIconName(icon), CoreMatchers.equalTo(true)))
                );
    }

    @When("{actor} hover mouse action on each icon {}")
    public void heHoverMouseActionOnEachLabel(Actor actor, String icon) {
        actor.attemptsTo(
                Hover.over(SectionsPage.Trust_US_ICON.apply(icon))
        );
    }

    @Then("{actor} should see another color about each label {}")
    public void verifyChangeOfColor(Actor actor,String icon) {
        OnStage.theActorInTheSpotlight()
                .should(
                        eventually(
                                seeThat(SectionInformationQuestions.getIconNameAttributeCss(icon), CoreMatchers.equalTo("none")))
                );
    }



}
