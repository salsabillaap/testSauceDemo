package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.saucedemo.com/checkout-step-two.html")
public class CheckoutOverviewPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]")
    WebElement overviewheader;

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement itemName;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[1]")
    WebElement quantity;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[2]")
    WebElement paymentinfo;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[4]")
    WebElement shippinginfo;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]")
    WebElement itemtotal;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")
    WebElement taxitem;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")
    WebElement totalprice;

    @FindBy(id = "finish")
    WebElement finishbutton;

    public String getpaymentheader(){
        return overviewheader.getText();
    }

    public String getitemname(){
        return itemName.getText();
    }

    public String getquantityitem(){
        return quantity.getText();
    }

    public String getpaymentinfo(){
        return paymentinfo.getText();
    }

    public String getshippinginfo(){
        return shippinginfo.getText();
    }

    public String getitemtotal(){
        return itemtotal.getText();
    }

    public String getitemtax(){
        return taxitem.getText();
    }

    public String getpricetotal(){
        return totalprice.getText();
    }

    public void clickfinishbutton(){
        finishbutton.click();
    }
}
