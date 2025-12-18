package com.nttdata.challenge.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/",
        tags="@login",
        glue= "com.nttdata.challenge.stepdefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTest {









}
