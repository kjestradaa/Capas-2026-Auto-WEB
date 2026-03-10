package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.actions.Click;
import org.example.ui.CartScreen;
import org.example.ui.CheckoutInformationScreen;
import org.example.ui.CheckoutOverviewScreen;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

public class CompleteCheckoutInformationTask implements Task {
    private final String firstName;
    private final String lastName;
    private final String postalCode;

    public CompleteCheckoutInformationTask(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public static CompleteCheckoutInformationTask withData(String firstName, String lastName, String postalCode) {
        return Tasks.instrumented(CompleteCheckoutInformationTask.class, firstName, lastName, postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartScreen.CHECKOUT_BUTTON),
                WaitUntil.the(CheckoutInformationScreen.FIRST_NAME_FIELD, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(firstName).into(CheckoutInformationScreen.FIRST_NAME_FIELD),
                Enter.theValue(lastName).into(CheckoutInformationScreen.LAST_NAME_FIELD),
                Enter.theValue(postalCode).into(CheckoutInformationScreen.POSTAL_CODE_FIELD),
                Click.on(CheckoutInformationScreen.CONTINUE_BUTTON),
                WaitUntil.the(CheckoutOverviewScreen.FINISH_BUTTON, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
        );
    }
}