package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * JUnit runner file. If you need to know how it works, there are comments in the examples-rest module
 * And don't skip modules!
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepdefs"
        },
        features = {"src/test/resources/features/"},
        plugin = {
                "pretty", "html:target/cucumber-reports",
                "json:target/cucumber-reports/cucumber.json"},
        tags = {"@test"}
)
public class RunSeleniumTest {
        /**
         * This is a JUnit annotation NOT Cucumber. It will be called after the end of the last scenario
         * and will close the geckodriver instance. Otherwise you will have an open instance after every execution.
         */
        @AfterClass
        public static void closeBrowser() throws IOException {
                Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
        }
}
