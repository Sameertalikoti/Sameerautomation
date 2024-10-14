package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Features/login.feature"}, glue= {"Steps"}, monochrome =  true, dryRun =false)

public class testRunner {

}
