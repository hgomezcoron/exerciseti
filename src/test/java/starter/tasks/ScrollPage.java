package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import starter.UI.ScrollItem;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ScrollPage implements Task{
    private final String section;

    public ScrollPage(String section) {
        this.section = section;
    }

    public static ScrollPage toElement(String section){
        return instrumented(ScrollPage.class, section);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ScrollItem.SCROLL_SS.apply(section))
        );
    }
}
