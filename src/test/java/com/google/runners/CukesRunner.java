package com.google.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin ={ "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},

        features = "src/test/resources/features",

        glue="com/google/stepdefinition",
        dryRun = false,


        //tags = "@googleapple"
            tags = "@googleamazon"


)
public class CukesRunner {

}