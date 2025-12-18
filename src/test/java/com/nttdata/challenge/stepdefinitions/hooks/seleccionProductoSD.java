package com.nttdata.challenge.stepdefinitions.hooks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class seleccionProductoSD {

    @Given("El Usuario inicia sesion")
    public void givenUserLogin() {

    }

    @And("El identifica dos productos disponibles en <lista Productos>")
    public void andIdentifiedProduct() {

    }

    @When("El hace click en el boton 'Add to Cart' en dos productos de <lista Productos>")
    public void whenClickButtonAddToCart() {

    }

    @Then("En el carro de compras se muestra un circulo rojo con el numero de items seleccionados")
    public void thenShopCardShowProductNumber() {

    }

    @And("El boton 'Add to Cart' de los productos seleccionados cambia a 'Remove'")
    public void andClickButtonAddToCart() {

    }


}
