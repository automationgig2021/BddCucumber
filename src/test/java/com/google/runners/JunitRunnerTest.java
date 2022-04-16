package com.google.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber.html", "summary"},
        glue = {"com.google.stepDefinitions","com.google.parameterType"},
        features = "src/test/resources/setpDef",
        monochrome = true
)
public class JunitRunnerTest {
    public JunitRunnerTest() {
    }
}
