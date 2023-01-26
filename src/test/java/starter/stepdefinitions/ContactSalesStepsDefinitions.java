package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import starter.UI.ContactSales;
import starter.questions.LabelsSsQuestions;
import starter.tasks.CheckBoxForm;
import starter.tasks.FillContactForm;
import starter.tasks.SwitchTo;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ContactSalesStepsDefinitions {

    @When("{actor} scroll on the form Contact Sales")
    public void heScrollAllPage(Actor actor) {
        WebElement iframe = ThucydidesWebDriverSupport.getWebdriverManager().getCurrentDriver().findElement(By.cssSelector("#contact-section>iframe"));
        actor.attemptsTo(
                Switch.toFrame(iframe),
                Scroll.to(ContactSales.title)
        );
    }

    @When("{actor} fill the form")
    public void heFillTheForm(Actor actor) {
        actor.attemptsTo(
                FillContactForm.filedToSendKey(),
                Click.on(ContactSales.checkBoxPrivacyPolicy),
                Click.on(ContactSales.checkBoxAnnouncements),
                Click.on(ContactSales.buttonForm)
        );
    }

    @Then("{actor} should see a message with information to be contacted")
    public void validateFormSentSuccessfully() {

    }
}

