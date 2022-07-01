package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.CheckoutItemStep;

public class CheckoutItemStepDef {

    @Steps
    CheckoutItemStep checkoutItemStep;


    @Given("user already add item to cart")
    public void userAlreadyAddItemToCart() {
        checkoutItemStep.addedItem();
    }

    @When("user click on checkout button")
    public void userClickOnCheckoutButton() {
        checkoutItemStep.clickCheckout();
    }

    @Then("checkout: your information should be appear")
    public void checkoutYourInformationShouldBeAppear() {
        checkoutItemStep.verifyCheckoutInfoPage();
    }

    @When("user fill first name with {string}")
    public void userFillFirstNameWith(String firstname) {
        checkoutItemStep.sendfirstname(firstname);
    }

    @And("user fill last name with {string}")
    public void userFillLastNameWith(String lastname) {
        checkoutItemStep.sendlastname(lastname);
    }

    @And("user fill zip postal code with {string}")
    public void userFillZipPostalCodeWith(String postcode) {
        checkoutItemStep.sendpostcode(postcode);
    }

    @And("user click on continue button")
    public void userClickOnContinueButton() {
        checkoutItemStep.clickContinue();
    }


    @Given("user already on Checkout: Your Information page")
    public void userAlreadyOnCheckoutYourInformationPage() {
        checkoutItemStep.addedItem();
        checkoutItemStep.clickCheckout();
        checkoutItemStep.verifyCheckoutInfoPage();
    }

    @When("user click on cancel button")
    public void userClickOnCancelButton() {
        checkoutItemStep.clickCancel();
    }


    @Then("return to cart page")
    public void returnToCartPage() {
        checkoutItemStep.verifyCartPage();
    }

    @When("user click on cart icon")
    public void userClickOnCartIcon() {
        checkoutItemStep.clickCartIcon();
    }

    @Then("error message will appear")
    public void errorMessageWillAppearBelow() {
        checkoutItemStep.verifyErrorMessage();
    }

    @Given("user already on cart page")
    public void userAlreadyOnCartPage() {
        checkoutItemStep.setCartPage();
    }

    @Then("checkout: your information appear")
    public void checkoutYourInformationAppear() {
        checkoutItemStep.verifyCheckoutInfoPage();
    }
}
