package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.SelectedStatus;
import net.serenitybdd.screenplay.targets.Target;

public class CheckBoxForm implements Interaction {

    public final Target target;

    public CheckBoxForm(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean isSelected = actor.asksFor(SelectedStatus.of(target).asBoolean());
        if (!isSelected) actor.attemptsTo(Click.on(target));
    }
}
