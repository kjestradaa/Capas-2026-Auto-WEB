package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class InventoryScreen {
    public static final Target ADD_PRODUCT_BUTTON = Target.the("Botón agregar producto al carrito")
            .locatedBy("#add-to-cart-{0}");
    public static final Target SHOPPING_CART_LINK = Target.the("Botón carrito de compras")
            .locatedBy(".shopping_cart_link");
}