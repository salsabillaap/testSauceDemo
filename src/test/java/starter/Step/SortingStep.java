package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.ProductSortZtoA;

import static org.junit.Assert.assertTrue;

public class SortingStep {

    ProductSortZtoA productsortZtoA;
    @Step
    public void LoginPage(){
        productsortZtoA.open();
        productsortZtoA.LoginPage();

    }
    public void SortingButton(){
        productsortZtoA.clickButtonSorting();
//        assertTrue(productsortZtoA.clickButtonSorting());


    }


}
