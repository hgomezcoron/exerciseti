package starter.UI;

import net.serenitybdd.screenplay.targets.Target;

public class InnovationIT {

    public static final Target SoftwareDevelopmentOutsourcing =
            Target.the("verify text section SoftwareDevelopmentOutsourcing").locatedBy("//p[contains(text(),'Turn your innovative ideas into robust enterprise ')]");

    public static final Target AutomationServices =
            Target.the("verify text section AutomationServices").locatedBy("//p[contains(text(),'Leverage robotic process automation (RPA) to impro')]");

    public static final Target SoftwareQATesting =
            Target.the("verify text section SoftwareQATesting").locatedBy("//p[contains(text(),'Software testing and quality assurance are crucial')]");

    public static final Target MicrosoftServices =
            Target.the("verify text section MicrosoftServices").locatedBy("//p[contains(text(),'Turn Microsoft technologies into a powerful and ac')]");

    public static final Target ProfessionalITConsulting =
            Target.the("verify text section ProfessionalITConsulting").locatedBy("//p[contains(text(),'Accelerate your journey to the future-ready digita')]");

    public static final Target DataAnalyticsServices =
            Target.the("verify text section DataAnalyticsServices").locatedBy("//p[contains(text(),'Your data is gold – that is, if you can successful')]");

    public static final Target ManagedITServices =
            Target.the("verify text section ManagedITServices").locatedBy("//p[contains(text(),'Rapidly evolving technology and business demands r')]");

}
