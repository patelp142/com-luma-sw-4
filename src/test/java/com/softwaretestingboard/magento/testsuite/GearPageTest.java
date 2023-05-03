package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearPageTest extends BaseTest {
    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        gearPage.hoverOnGearMenu();
        gearPage.clickOnBags();
        gearPage.clickOnProductOvernightDuffle();
        gearPage.verifyProductNameOvernightDuffle();
        gearPage.changeProductQuantityTo3();
        gearPage.clickOnAddToCart();
        gearPage.verifyTextOfShoppingCartAfterAddingProduct();
        gearPage.clickOnShoppingCartFromMessage();
        gearPage.verifyProductNameTextOvernightDuffle();
        gearPage.verifyProductQuantityAs3();
        gearPage.verifyProductPrice();
        gearPage.changeProductQuantityTo5();
        gearPage.clickOnUpdateShoppingCart();
        gearPage.verifyRevisedProductPrice();
    }

}
