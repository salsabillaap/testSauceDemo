package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.CheckoutInfoPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutItemStep {

    CheckoutInfoPage checkoutInfoPage;

    @Step
    public void verifyCheckoutInfoPage(){
        String header  = checkoutInfoPage.getCheckoutInfoHeader();
        assertTrue(header.equalsIgnoreCase("information"));
    }
    @Step
    public void sendfirstname(String firstname){
        checkoutInfoPage.fillfirstname(firstname);
    }

    @Step
    public void sendlastname(String lastname){
        checkoutInfoPage.filllastname(lastname);
    }

    @Step
    public void sendpostcode(String postcode){
        checkoutInfoPage.fillpostcode(postcode);
    }

    @Step
    public void clickContinue(){
        checkoutInfoPage.clickContinueButton();
    }


    @Step
    public void clickCancel(){
        checkoutInfoPage.clickCancelButton();
    }

    @Step
    public void clickCartIcon(){
        checkoutInfoPage.clickCartIcon();
    }

    @Step
    public void verifyErrorMessage(){
        String actualfirst = checkoutInfoPage.getErrorMessage();
        assertTrue("Error: First Name is required".contains(actualfirst));

        String actuallast = checkoutInfoPage.getErrorMessage();
        assertTrue("Error: Last Name is required".contains(actuallast));

        String actualpost = checkoutInfoPage.getErrorMessage();
        assertTrue("Error: Postal Code is required".contains(actualpost));
    };
}
