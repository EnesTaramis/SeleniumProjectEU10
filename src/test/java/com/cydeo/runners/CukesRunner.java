package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features ="src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false, //when true results will show snippets that are incomplete
        tags = "@FID10-389"
)
public class CukesRunner {
}
