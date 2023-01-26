package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwitchTo implements Task {

    public static SwitchTo toNewTab(){
        return instrumented(SwitchTo.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toNewWindow()
        );
    }
}
