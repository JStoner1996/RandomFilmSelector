package com.tsi.jake.stoner.program.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
features = "src/test/resources/Cucumber",
glue = "com.tsi.jake.stoner.program")

public class runCucumberTest {

}
