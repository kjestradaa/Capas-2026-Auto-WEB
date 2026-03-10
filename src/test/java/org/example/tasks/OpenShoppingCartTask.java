package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.example.ui.InventoryScreen;

public class OpenShoppingCartTask implements Task {

    public static OpenShoppingCartTask open() {
        return Tasks.instrumented(OpenShoppingCartTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InventoryScreen.SHOPPING_CART_LINK)
        );
    }
}
