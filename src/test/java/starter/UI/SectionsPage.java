package starter.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.function.Function;

public class SectionsPage {
    public static final Target Innovative_IT =
            Target.the("verify text section Innovative_IT").locatedBy("//p[contains(text(),'Discover intelligent IT and software solutions to ')]");
    public static final Target Trust_US =
            Target.the("verify text section Trust_US").locatedBy("//div[@id='logo-partners-2']//img[@alt='test 4']");
    public static final Function<String, Target> Trust_US_ICON = s -> Target.the("").locatedBy("//div[@id='"+s+"']//img[@alt='test 4']");

    public static final Target Locations =
            Target.the("verify text section Locations").locatedBy("//p[contains(text(),'TEAM provides international IT solutions from stra')]");
    public static final Target Top_Gun =
            Target.the("verify text section Top_Gun").locatedBy("//p[contains(text(),'TEAM’s Top Gun Lab provides free IT and software d')]");
    public static final Target Empower =
            Target.the("verify text section Empower").locatedBy("//p[contains(text(),'We believe that a great workplace connects talente')]");
    public static final Target Contact =
            Target.the("verify text section Contact").locatedBy("//p[contains(text(),'We believe that a great workplace connects talente')]");

    public static final Function<String, Target> LabelsSS = s -> Target.the("").locatedBy("//h3[normalize-space()='"+s+"']");

    public static final Function<String, Target> LabelsTG = s -> Target.the("").locatedBy("//h4[normalize-space()='"+s+"']");

    public static final Function<String, Target> LabelsIT = s -> Target.the("").locatedBy("//p[normalize-space()='"+s+"']");

    public static final Function<String, Target> LabelsLocations = s -> Target.the("").locatedBy("(//a[normalize-space()='learn more'])"+s+"");

    public static final Target Logistics =
            Target.the("verify text section Logistics").locatedBy("//p[contains(text(),'Build your end-to-end digital supply chain to driv')]");

    public static final Target Oil =
            Target.the("verify text section Oil").locatedBy("//p[contains(text(),'Harness digital solutions and data to accelerate p')]");

    public static final Target Telecom =
            Target.the("verify text section Telecom").locatedBy("//p[contains(text(),'Empower your organization to quickly and effective')]");

    public static final Target Technology =
            Target.the("verify text section Technology").locatedBy("//p[contains(text(),'Bring your transformational innovations to life an')]");

    public static final Target Financial =
            Target.the("verify text section Financial").locatedBy("//p[contains(text(),'Adapt more quickly to evolving competitive threats')]");

    public static final Target Healthcare =
            Target.the("verify text section Healthcare").locatedBy("//p[contains(text(),'Accelerate the creation and delivery of your life-')]");

    public static final Target Travel =
            Target.the("verify text section Travel").locatedBy("//p[contains(text(),'Leverage our intelligent IT and software solutions')]");

    public static final Target Retail =
            Target.the("verify text section Retail").locatedBy("//p[contains(text(),'Harness innovative IT solutions and data to build ')]");

    public static final Target Digital =
            Target.the("verify text section Digital").locatedBy("//p[contains(text(),'Accelerate lead generation with innovative, data-d')]");

    public static final Target SlickNextArrow =
            Target.the("verify text section Digital").locatedBy("//img[@class='arrow-btn next slick-arrow']");

}
