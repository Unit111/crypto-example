package stepdefs;

import com.google.inject.Inject;
import com.unit1.core.CryptocompareTasks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ExampleStepDefs {

    private CryptocompareTasks cryptocompareTasks;

    @Inject
    public ExampleStepDefs (final CryptocompareTasks cryptocompareTasks) {
        this.cryptocompareTasks = cryptocompareTasks;
    }

    @Given("^a user opens the target page$")
    public void userOpensPage() {
        final String examplePage = "https://www.cryptocompare.com/coins/wand/overview/ETH";
        cryptocompareTasks.openPage(examplePage);
    }

    @When("^the user scrapes the page$")
    public void userScrapesThePage() {
        cryptocompareTasks.clickTab("ICO");
        for (final String element : cryptocompareTasks.scrapeInfo()) {
            System.out.println("RESULT: " + element);
        }
        cryptocompareTasks.closeBrowser();
    }
}
