package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;
import starter.UI.SectionsPage;
import starter.questions.LabelsSsQuestions;
import utils.Constants;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class InnovativeITSoftwareServicesStepsDefinions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @And("{actor} verify the labels {} is visible for it services")
    public void verifyLabelsItServices(Actor actor, String label) {
        OnStage.theActorInTheSpotlight()
                .should(
                        eventually(
                                seeThat(LabelsSsQuestions.getLabelIt(label), CoreMatchers.equalTo(true)))
                );
    }

    @When("{actor} hover mouse it services action on each label {}")
    public void hoverLabels(Actor actor, String label) {
        actor.attemptsTo(
                Hover.over(SectionsPage.LabelsIT.apply(label))
        );
    }

    @Then("{actor} should see information it services about each label {}")
    public void seeLabelsInformation(Actor actor, String title) {
        if (title.equals("Software Development Outsourcing")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextSoftwareDevelopmentOutsourcing(), CoreMatchers.equalTo(Constants.SoftwareDevelopmentOutsourcing)))
                    );
        } else if (title.equals("AutomationServices")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextAutomationServices(), CoreMatchers.equalTo(Constants.AutomationServices)))
                    );
        } else if (title.equals("Software QA& Testing")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextSoftwareQATesting(), CoreMatchers.equalTo(Constants.SoftwareQATesting)))
                    );
        } else if (title.equals("MicrosoftServices")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextMicrosoftServices(), CoreMatchers.equalTo(Constants.MicrosoftServices)))
                    );
        } else if (title.equals("Professional ITConsulting")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextProfessionalITConsulting(), CoreMatchers.equalTo(Constants.ProfessionalITConsulting)))
                    );
        } else if (title.equals("DataAnalytics Services")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextDataAnalyticsServices(), CoreMatchers.equalTo(Constants.DataAnalyticsServices)))
                    );
        } else if (title.equals("Managed ITServices")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextManagedITServices(), CoreMatchers.equalTo(Constants.ManagedITServices)))
                    );
        }
    }

    @When("{actor} click it services on each small section {}")
    public void clickSmallSection(Actor actor, String title) {
        actor.attemptsTo(
                Click.on(SectionsPage.LabelsIT.apply(title))
        );
    }


}
