package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.Step.CheckoutPaymentStep;

public class CheckoutPaymentStepDef {

    @Steps
    CheckoutPaymentStep checkoutPaymentStep;

    @Then("checkout: overview page appear")
    public void checkoutOverviewPageAppear() {
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
}
