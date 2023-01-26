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

public class EmpowerYourCareer {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("{actor} click Empower Your Career button section")
    public void clickSmallSection(Actor actor) {
        actor.attemptsTo(
                Click.on(starter.UI.EmpowerYourCareer.SeeAllOffersButton)
        );
    }

    @Then("{actor} should see information Empower Your Career")
    public void validateNewPage(Actor actor) {
        actor.attemptsTo(
                SwitchTo.toNewTab()
        );
        OnStage.theActorInTheSpotlight()
                .should(
                        eventually(
                                seeThat(LabelsSsQuestions.getTitleEmpowerYourCareer(), CoreMatchers.equalTo(true))),
                        eventually(
                                seeThat(LabelsSsQuestions.getTextEmpowerYourCareer(), CoreMatchers.equalTo(true)))
                );
    }
}
