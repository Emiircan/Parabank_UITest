package StepDefinition;

import Pages.Locators;
import Utility.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInSteps {
    Locators locators = new Locators();

    @Given("Navigate to parabank page")
    public void navigateToParabankPage() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Enter username {string} and password {string} and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton(String arg0, String arg1) {
        locators.sendKeyFunc(locators.logUserName, arg0);
        locators.sendKeyFunc(locators.logPassword, arg1);
        locators.clickElementFunc(locators.logIn);
    }


    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        if (GWD.getDriver().getCurrentUrl().contains("https://parabank.parasoft.com/parabank/overview.htm"))
            locators.verifyContainsTextFunction(locators.controlLogIN, "Welcome");
        else
            locators.verifyContainsTextFunction(locators.controlCenterText, "The username and password could not be verified.");


    }

}
