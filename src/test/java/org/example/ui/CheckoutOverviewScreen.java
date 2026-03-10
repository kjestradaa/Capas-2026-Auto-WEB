package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutOverviewScreen {
    public static final Target FINISH_BUTTON = Target.the("Botón finalizar compra")
            .locatedBy("#finish");
}
