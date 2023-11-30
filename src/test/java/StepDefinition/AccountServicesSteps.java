package StepDefinition;

import Pages.Locators;
import Utility.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class AccountServicesSteps {
    Locators locators=new Locators();

    @And("The type of account you want to open{string}")
    public void theTypeOfAccountYouWantToOpen(String arg0) {
        Select selectMenu= new Select(locators.accountType);
        selectMenu.selectByVisibleText(arg0);
    }

    @Then("The user has successfully opened a new account")
    public void theUserHasSuccessfullyOpenedANewAccount() {
        locators.verifyContainsTextFunction(locators.accountCont,"Congratulations, your account is now open.");
    }

    @And("Click on the element Action class")
    public void clickOnTheElementActionClass(DataTable items) {
        List<String> strButtons = items.asList(String.class);

        for (String strButton : strButtons) {
            WebElement element = locators.getWebElement(strButton);
            new Actions(GWD.getDriver()).moveToElement(element).click(element).build().perform();
        }
    }

    @Then("İnvoice payment has been made successfully")
    public void invoicePaymentHasBeenMadeSuccessfully() {
      locators.verifyContainsTextFunction(locators.billPayCont,"Bill Payment Complete");
    }

    @Then("Profile update has occurred")
    public void profileUpdateHasOccurred() {
        locators.verifyContainsTextFunction(locators.updatePCont,"Profile Updated");
    }

    @Then("Loan application process completed successfully")
    public void loanApplicationProcessCompletedSuccessfully() {
         locators.verifyContainsTextFunction(locators.loanContV,"Congratulations, your loan has been approved.");
    }

    @Then("The loan application process was not completed successfully")
    public void theLoanApplicationProcessWasNotCompletedSuccessfully() {
        locators.verifyContainsTextFunction(locators.loanContIV,"We cannot grant a loan in that amount with your available funds.");
    }
}
