package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public class MakePurchaseSD {

    private Actor usuario() {
        return OnStage.theActorInTheSpotlight();
    }

    @And("agrega el producto {string} al carrito")
    public void agregaElProductoAlCarrito(String productName) {

    }

    @And("al abrir el carrito verifica que está el producto {string}")
    public void alAbrirElCarritoVerificaQueEstáElProducto(String productName) {

    }

    @And("al finalizar la compra con la información nombre {string}, apellido {string} y código postal {string}")
    public void alFinalizarLaCompraConLaInformaciónNombreApellidoYCódigoPostal(String firstName, String lastName, String postalCode) {

    }

    @Then("verifica el mensaje de confirmación {string}")
    public void verificaElMensajeDeConfirmación(String msj) {

    }

}