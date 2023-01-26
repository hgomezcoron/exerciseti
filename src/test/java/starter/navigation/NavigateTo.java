package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable teamInternationalHomePage() {
        return Task.where("{0} opens the TeamInternational home page",
                Open.browserOn().the(TeamInternationalPage.class));
    }
}
