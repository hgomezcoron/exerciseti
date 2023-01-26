package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Hover;
import starter.UI.SectionsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HoverPage implements Task {
    private final String label;

    public HoverPage(String label) {
        this.label = label;
    }

    public static HoverPage toElement(String label){
        return instrumented(HoverPage.class, label);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Hover.over(SectionsPage.LabelsSS.apply(label))
        );
    }
}
