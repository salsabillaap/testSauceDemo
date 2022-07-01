package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.saucedemo.com/checkout-complete.html")
public class CheckoutCompletePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]")
    WebElement completeheader;

    public String getcompleteheader(){
        return completeheader.getText();
    }
}