package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.ui.CheckoutOverviewScreen;

public class FinishCheckoutTask implements Task {

    public static FinishCheckoutTask finish() {
        return Tasks.instrumented(FinishCheckoutTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckoutOverviewScreen.FINISH_BUTTON, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckoutOverviewScreen.FINISH_BUTTON)
        );
    }
}