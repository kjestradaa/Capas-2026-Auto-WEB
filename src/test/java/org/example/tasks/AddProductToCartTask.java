package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.example.ui.InventoryScreen;

public class AddProductToCartTask implements Task {
    private final String productName;

    public AddProductToCartTask(String productName) {
        this.productName = productName;
    }

    public static AddProductToCartTask named(String productName) {
        return Tasks.instrumented(AddProductToCartTask.class, productName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String product = productName.toLowerCase().replace(" ", "-");
        actor.attemptsTo(
                Click.on(InventoryScreen.ADD_PRODUCT_BUTTON.of(product))
        );
    }
}