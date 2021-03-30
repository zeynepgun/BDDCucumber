package com.swaglabs.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin is for reports
        plugin = {"pretty","html:target/site/cucumber-pretty.html", "json:target/cucumber.json"},

        snippets = CucumberOptions.SnippetType.CAMELCASE,
// specify step definition package path to connect with feature file
        glue = {"com/swaglabs/stepdefinitions"},

        features = {"src/test/resources/features"},

        tags = "@login",
        // checking if the steps are defined or not if false it will open browser
        dryRun = false

       // monochrome = true
)
public class TestRunner {

}
