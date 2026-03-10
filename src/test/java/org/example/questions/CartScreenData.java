package org.example.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.example.ui.CartScreen;

public class CartScreenData {
    public static Question<Boolean> hasProduct(String productName) {
        return actor -> Visibility.of(CartScreen.CART_ITEM_NAME.of(productName)).answeredBy(actor);
    }
}
