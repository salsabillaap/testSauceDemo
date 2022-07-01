package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class ItemPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    WebElement addButton;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    WebElement itemNumber;

    @FindBy(id = "shopping_cart_container")
    WebElement cartButton;


    public void clickAddButton(){
        addButton.click();
    }

    public String getItemNumber(){
        return itemNumber.getText();
    }

    public void clickCartButton(){
        cartButton.click();
    }

}
