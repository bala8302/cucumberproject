package io.cucumber.cucumber_archetype;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Feature/AppStart.feature"},glue={"io.cucumber.cucumber_archetype"},monochrome=true,plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json"})
public class RunCucumberTest {

}


