package starter.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.CheckoutPaymentStep;

public class CheckoutPaymentStepDef {

    @Steps
    CheckoutPaymentStep checkoutPaymentStep;

    @Then("checkout: overview page should be appear")
    public void checkoutOverviewPageShouldBeAppear() {
        checkoutPaymentStep.verifyCheckoutOverviewPage();
    }

    @And("item name will appear")
    public void itemNameWillAppear() {
        checkoutPaymentStep.itemName();
    }

    @And("item quantity will appear")
    public void itemQuantityWillAppear() {
        checkoutPaymentStep.itemQty();
    }

    @And("item payment information will appear")
    public void itemPaymentInformationWillAppear() {
        checkoutPaymentStep.paymentInfo();
    }

    @And("item shipping information will appear")
    public void itemShippingInformationWillAppear() {
        checkoutPaymentStep.shippingInfo();
    }

    @And("item total price will appear")
    public void itemTotalPriceWillAppear() {
        checkoutPaymentStep.total();
    }

    @And("user click on finish button")
    public void userClickOnFinishButton() {
        checkoutPaymentStep.clickFinish();
    }

    @Then("checkout completed")
    public void checkoutCompleted() {
        checkoutPaymentStep.verifyCompletePage();
    }

    @Given("user already on Checkout: Overview page")
    public void userAlreadyOnCheckoutOverviewPage() {
        checkoutPaymentStep.verifyCheckoutOverviewPage();
    }

    @When("user click on cancel button on overview")
    public void userClickOnCancelButtonOnOverview() {
        checkoutPaymentStep.clickCancel();
    }

    @Then("return to homepage")
    public void returnToHomepage() {
    }

    @When("user click on cart icon on overview")
    public void userClickOnCartIconOnOverview() {
        checkoutPaymentStep.clickCart();
    }
}
