package com.nttdata.challenge.stepdefinitions;


import com.nttdata.challenge.screenplay.tasks.LoginTask;
import com.nttdata.challenge.screenplay.tasks.OpenURLTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class ingresoSesionSD {




    @Given("El Usuario A abre la tienda Sauce")
    public void givenUserAOpenURL() {

        theActorCalled("User").wasAbleTo(OpenURLTask.openSauce());


    }

    @When("El ingresa {string} y {string}")
    public void whenUserSetUsernamePassword(String Username,String Password) {
            theActorCalled("User").wasAbleTo(LoginTask.loginTask(Username,Password));

    }

    @Then("El usuario logra ingresar a la direccion {string}")
    public void thenUserLogin(String URLFLAG) {



    }

}
