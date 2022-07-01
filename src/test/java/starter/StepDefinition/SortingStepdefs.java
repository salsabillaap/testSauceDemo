package starter.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Step.SortingStep;

public class SortingStepdefs {

    SortingStep sortingstep;
    @Given("User already login")
    public void userAlreadyLogin() {
        sortingstep.LoginPage();

    }

    @When("click sorting button ZtoA")
    public void clickSortingButtonZtoA() {
        sortingstep.SortingButton();
    }

    @Then("Product sorting to ZtoA")
    public void productSortingToZtoA() {
//        sortingstep.getSorting();
    }
}
