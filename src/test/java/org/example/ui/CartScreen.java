package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartScreen {
    public static final Target CART_ITEM_NAME = Target.the("Producto en el carrito")
            .locatedBy("//div[@class='cart_item']//div[@class='inventory_item_name' and text()='{0}']");
    public static final Target CHECKOUT_BUTTON = Target.the("Botón checkout")
            .locatedBy("#checkout");
}
