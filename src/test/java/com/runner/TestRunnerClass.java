package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@BookHotel"),features={"src\\test\\resources"},publish = true,
glue=("com.stepdefinition"),dryRun=true,stepNotifications =true,snippets = SnippetType.CAMELCASE)

public class TestRunnerClass {

}
