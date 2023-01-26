package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;
import starter.UI.SectionsPage;
import starter.UI.SofwareSolutionsSections;
import starter.navigation.NavigateTo;
import starter.questions.LabelsSsQuestions;
import starter.questions.SectionInformationQuestions;
import starter.tasks.HoverPage;
import starter.tasks.ScrollPage;
import utils.Constants;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TITestStepsDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} is researching the webpage Team International on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.teamInternationalHomePage());
    }

    @When("{actor} scroll on the section {}")
    public void heScrollAllPage(Actor actor, String section) {
        actor.attemptsTo(
                ScrollPage.toElement(section)
        );
    }

    @Then("{actor} should see information about each section {}")
    public void heShouldSeeInformationAboutEachSection(Actor actor, String title) {
        if (title.equals("Innovative")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(SectionInformationQuestions.getTextInnovative_IT(), CoreMatchers.equalTo(Constants.Innovative_IT_Text)))
                    );
        } else if (title.equals("trust us")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(SectionInformationQuestions.getTextTrustUs(), CoreMatchers.equalTo(Constants.Trust_US)))
                    );
        } else if (title.equals("Locations")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(SectionInformationQuestions.getTextLocations(), CoreMatchers.equalTo(Constants.Locations)))
                    );
        } else if (title.equals("Gun Lab")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(SectionInformationQuestions.getTextGun_Lab(), CoreMatchers.equalTo(Constants.Top_Gun)))
                    );
        } else if (title.equals("Career")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(SectionInformationQuestions.getTextCareer(), CoreMatchers.equalTo(Constants.Empower)))
                    );
        } else if (title.equals("Sales")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(SectionInformationQuestions.getTextSales(), CoreMatchers.equalTo(Constants.Contact)))
                    );
        }

    }


    @Then("{actor} should see information about each label {}")
    public void seeLabelInformation(Actor actor, String title) {
        if (title.equals("Logistics & Transportation")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextLogistics(), CoreMatchers.equalTo(Constants.Logistics)))
                    );
        } else if (title.equals("Oil & Gas")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextOil(), CoreMatchers.equalTo(Constants.Oil)))
                    );
        } else if (title.equals("Telecom")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextTelecom(), CoreMatchers.equalTo(Constants.Telecom)))
                    );
        } else if (title.equals("Technology & Innovation ")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextTechnology(), CoreMatchers.equalTo(Constants.Technology)))
                    );
        } else if (title.equals("Financial Services")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextFinancial(), CoreMatchers.equalTo(Constants.Financial)))
                    );
        } else if (title.equals("Healthcare & Life Sciences")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextHealthcare(), CoreMatchers.equalTo(Constants.Healthcare)))
                    );
        } else if (title.equals("Travel & Hospitality ")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextTravel(), CoreMatchers.equalTo(Constants.Travel)))
                    );
        } else if (title.equals("Retail & Ecommerce")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextRetail(), CoreMatchers.equalTo(Constants.Retail)))
                    );
        } else if (title.equals("Digital Marketing")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(LabelsSsQuestions.getTextDigital(), CoreMatchers.equalTo(Constants.Digital)))
                    );
        }

    }

    @And("Verify each test")
    public void verifyEachTest() {

    }


    @And("{actor} verify the labels {} is visible")
    public void verifyTheLabels(Actor actor, String label) {
        OnStage.theActorInTheSpotlight()
                .should(
                        eventually(
                                seeThat(LabelsSsQuestions.getButtonExpensesVisible(label), CoreMatchers.equalTo(true)))
                );
    }

    @When("{actor} hover mouse action on each label {}")
    public void heHoverMouseActionOnEachLabel(Actor actor, String label) {
        actor.attemptsTo(
                HoverPage.toElement(label)
        );
    }


    @When("{actor} click on each small section {}")
    public void heClickOnEachSmallSectionSmallSection(Actor actor, String title) {
        actor.attemptsTo(
                Click.on(SectionsPage.LabelsSS.apply(title))
        );
    }

    @Then("{actor} should see information about each small section {}")
    public void validateNewPage(Actor actor, String title) {
        OnStage.theActorInTheSpotlight()
                .should(
                        eventually(
                                seeThat(LabelsSsQuestions.getLogisticsTransportationTextPage(title), CoreMatchers.equalTo(true)))
                );
    }
}
