package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.example.questions.CartScreenData;
import org.example.questions.CheckoutFinishScreenData;
import org.example.tasks.AddProductToCartTask;
import org.example.tasks.CompleteCheckoutInformationTask;
import org.example.tasks.FinishCheckoutTask;
import org.example.tasks.OpenShoppingCartTask;

public class MakePurchaseSD {

    private Actor usuario() {
        return OnStage.theActorInTheSpotlight();
    }

    @And("agrega el producto {string} al carrito")
    public void agregaElProductoAlCarrito(String productName) {
        usuario().attemptsTo(AddProductToCartTask.named(productName));
    }

    @And("al abrir el carrito verifica que está el producto {string}")
    public void alAbrirElCarritoVerificaQueEstáElProducto(String productName) {
        usuario().attemptsTo(
                OpenShoppingCartTask.open(),
                Ensure.that(CartScreenData.hasProduct(productName)).isTrue()
        );
    }

    @And("al finalizar la compra con la información nombre {string}, apellido {string} y código postal {string}")
    public void alFinalizarLaCompraConLaInformaciónNombreApellidoYCódigoPostal(String firstName, String lastName, String postalCode) {
        usuario().attemptsTo(CompleteCheckoutInformationTask.withData(firstName, lastName, postalCode),
                FinishCheckoutTask.finish());
    }

    @Then("verifica el mensaje de confirmación {string}")
    public void verificaElMensajeDeConfirmación(String msj) {
        usuario().attemptsTo(
                Ensure.that(CheckoutFinishScreenData.hasMessage(msj)).isTrue()
        );

    }

}