package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.CheckoutCompletePage;
import starter.Pages.CheckoutOverviewPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutPaymentStep {

    CheckoutOverviewPage checkoutOverviewPage;
    CheckoutCompletePage checkoutCompletePage;


    @Step
    public void verifyCheckoutOverviewPage(){
        String header = checkoutOverviewPage.getpaymentheader();
        assertTrue(header.equalsIgnoreCase("Checkout: Overview"));
    }

    @Step
    public void itemName(){
        String item = checkoutOverviewPage.getitemname();
        assertTrue(item.equalsIgnoreCase("Sauce Labs Backpack"));
    }

    @Step
    public void itemQty(){
        String qty = checkoutOverviewPage.getquantityitem();
        assertTrue(qty.equalsIgnoreCase("1"));
    }

    @Step
    public void paymentInfo(){
        String payment = checkoutOverviewPage.getpaymentinfo();
        assertTrue(payment.equalsIgnoreCase("SauceCard #31337"));
    }

    @Step
    public void shippingInfo(){
        String shipping = checkoutOverviewPage.getshippinginfo();
        assertTrue(shipping.equalsIgnoreCase("FREE PONY EXPRESS DELIVERY!"));
    }

    @Step
    public void total(){
        String totalitem = checkoutOverviewPage.getitemtotal();
        assertTrue(totalitem.equals("Item total: $29.99" ));

        String tax = checkoutOverviewPage.getitemtax();
        assertTrue(tax.equals("Tax: $2.40"));

        String price = checkoutOverviewPage.getpricetotal();
        assertTrue(price.equals("Total: $32.39"));
    }

    @Step
    public void clickFinish(){
        checkoutOverviewPage.clickfinishbutton();
    }

    @Step
    public void verifyCompletePage(){
        String header = checkoutCompletePage.getcompleteheader();
        assertTrue(header.equalsIgnoreCase("Checkout: Complete!"));
    }
}