package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutInformationScreen {
    public static final Target FIRST_NAME_FIELD = Target.the("Campo nombre")
            .locatedBy("#first-name");
    public static final Target LAST_NAME_FIELD = Target.the("Campo apellido")
            .locatedBy("#last-name");
    public static final Target POSTAL_CODE_FIELD = Target.the("Campo código postal")
            .locatedBy("#postal-code");
    public static final Target CONTINUE_BUTTON = Target.the("Botón continuar")
            .locatedBy("#continue");
}
