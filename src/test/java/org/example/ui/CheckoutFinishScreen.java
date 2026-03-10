package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutFinishScreen {
    public static final Target COMPLETE_HEADER = Target.the("Mensaje de compra completada")
            .locatedBy(".complete-header");
}
