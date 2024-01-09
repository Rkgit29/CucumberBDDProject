package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/loginpage.feature",
                glue = {"com.facebook.stepsDefinitions"},
                tags = "@tag1",
                dryRun = false,
                monochrome = true,
      plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber.json"})


public class LoginRunnersteps extends AbstractTestNGCucumberTests{







}
