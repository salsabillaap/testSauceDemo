package starter.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.AddItemStep;

public class AddItemStepDefinition {
    @Steps
    AddItemStep addItemStep;

    @Given("user already login")
    public void user_already_login(){
        addItemStep.loginPage();
    }

    @When("user click add to cart button on item")
    public void user_click_add_to_cart_button_on_item() {
        addItemStep.clickAddButton();
    }

    @Then("number of item will appear in cart button")
    public void number_of_item_will_appear_in_cart_button() {
        addItemStep.verifyItemNumber();
    }

    @When("user click cart button")
    public void user_click_cart_button() {
        addItemStep.clickCartButton();
    }

    @Then("item has added in cart page")
    public void item_has_added_in_cart_page() {
        addItemStep.verifyCartPage();
        addItemStep.verifyItemName();
    }
}
