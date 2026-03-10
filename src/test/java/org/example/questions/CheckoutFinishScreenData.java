package org.example.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.example.ui.CheckoutFinishScreen;

public class CheckoutFinishScreenData {
    public static Question<Boolean> hasMessage(String expectedMessage) {
        return actor -> Text.of(CheckoutFinishScreen.COMPLETE_HEADER).answeredBy(actor).equals(expectedMessage);
    }
}
