package starter.stepsdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import starter.questions.LabelsSsQuestions;
import starter.tasks.FillContactForm;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ContactSales {

    @When("{actor} scroll on the form Contact Sales")
    public void heScrollAllPage(Actor actor) {
        WebElement iframe = ThucydidesWebDriverSupport.getWebdriverManager().getCurrentDriver().findElement(By.cssSelector("#contact-section>iframe"));
        actor.attemptsTo(
                Switch.toFrame(iframe),
                Scroll.to(starter.UI.ContactSales.title)
        );
    }

    @When("{actor} fill the form")
    public void heFillTheForm(Actor actor) {
        actor.attemptsTo(
                FillContactForm.filedToSendKey(),
                Click.on(starter.UI.ContactSales.checkBoxPrivacyPolicy),
                Click.on(starter.UI.ContactSales.checkBoxAnnouncements),
                Click.on(starter.UI.ContactSales.buttonForm)
        );
    }

    @Then("{actor} should see a message with information to be contacted")
    public void validateFormSentSuccessfully(Actor actor) {
        OnStage.theActorInTheSpotlight()
                .should(
                        eventually(
                                seeThat(LabelsSsQuestions.getTitleContact(), CoreMatchers.equalTo(true)))
                );
    }
}

