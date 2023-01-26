package starter.UI;

import net.serenitybdd.screenplay.targets.Target;

import java.util.function.Function;

public class SofwareSolutionsSections {

    public static final Function<String, Target> TitlePage = s -> Target.the("").locatedBy("//h1[normalize-space()='"+s+"']");

}
