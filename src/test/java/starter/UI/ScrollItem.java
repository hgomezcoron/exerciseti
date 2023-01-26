package starter.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.function.Function;

public class ScrollItem {
    //static Target SCROLL_SS -> variable =  Target.the("search field").locatedBy("//h2[normalize-space()='+variable+']");
    public static Function<String, Target> SCROLL_SS = s -> Target.the("").locatedBy("//h2[normalize-space()='"+s+"']");


}
