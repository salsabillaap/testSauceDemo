package starter.Step;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import starter.Pages.CartPage;
import starter.Pages.CheckoutInfoPage;
import starter.Pages.ItemPage;
import starter.Pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutItemStep {

    CheckoutInfoPage checkoutInfoPage;
    LoginPage loginPage;
    ItemPage itemPage;
    CartPage cartPage;

    @Step
    public void addedItem(){
        loginPage.open();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();

        itemPage.clickAddButton();
        String itemNumber = itemPage.getItemNumber();
        Assert.assertTrue(itemNumber.equalsIgnoreCase("1"));

        itemPage.clickCartButton();
        String headerPage = cartPage.getCartHeader();
        Assert.assertTrue(headerPage.equalsIgnoreCase("Your Cart"));

        String itemName = cartPage.getItemName();
        Assert.assertTrue(itemName.equalsIgnoreCase("Sauce Labs Backpack"));
    }

    @Step
    public void clickCheckout(){
        cartPage.clickCheckoutButton();
    }

    @Step
    public void verifyCheckoutInfoPage(){
        String header  = checkoutInfoPage.getCheckoutInfoHeader();
        assertTrue(header.equalsIgnoreCase("Checkout: Your Information"));
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

        String cartheader = cartPage.getCartHeader();
        assertTrue(cartheader.equalsIgnoreCase("Your Cart"));
    }

    @Step
    public void verifyErrorMessage(){
        assertTrue(checkoutInfoPage.getErrorMessage().equalsIgnoreCase("error: first name is required"));
    }
}
