package com.nttdata.challenge.screenplay.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.Keys;

import static com.nttdata.challenge.screenplay.UI.loginInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task{

    private static final EnvironmentVariables env= SystemEnvironmentVariables.createEnvironmentVariables();
    private final String name;
    private final String password;


    public LoginTask(String name, String password){


        this.name=name;
        this.password=password;

    }

    @Override
    public <T extends Actor> void performAs(T actor){



        actor.attemptsTo(
                Click.on(USERNAME),
                Enter.theValue(name).into(USERNAME),
                Click.on(PASS),
                Enter.theValue(password).into(PASS),
                Click.on(LOGINBUT)
        );

    }

    public static LoginTask loginTask(String name,String password){

        return new LoginTask(name, password);
    }


}
