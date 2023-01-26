package starter.UI;

import net.serenitybdd.screenplay.targets.Target;

import java.util.function.Function;

public class Location {
    public static final Target TitlePage =
            Target.the("verify text location page").locatedBy("//h4[normalize-space()='TEAM Lublin']");
}
