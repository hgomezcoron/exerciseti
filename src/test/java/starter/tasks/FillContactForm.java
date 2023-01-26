package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.UI.ContactSales;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillContactForm implements Task {


    public static FillContactForm filedToSendKey(){
        return instrumented(FillContactForm.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Hans").into(ContactSales.fieldName),
                SendKeys.of("Gomez").into(ContactSales.fieldLastName),
                SendKeys.of("TI").into(ContactSales.fieldCompany),
                SendKeys.of("TI@gmail.com").into(ContactSales.fieldEmail),
                SendKeys.of("+57111111").into(ContactSales.fieldPhone),
                SendKeys.of("Test for TI company").into(ContactSales.fieldMessage)
        );
    }
}
