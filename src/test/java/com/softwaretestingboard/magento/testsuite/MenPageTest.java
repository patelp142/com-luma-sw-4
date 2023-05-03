package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenPageTest extends BaseTest {
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        menPage.mouseHoverToMenMenuAndBottoms();
        menPage.clickOnPants();
        menPage.hoverOnPantAndClickOnSize();
        menPage.hoverOnPantAndClickOnColour();
        menPage.hoverOnPantAndAddToCart();
        menPage.verifyShoppingCartMessage();
        menPage.clickOnShoppingCartFromMessage();
        menPage.verifyShoppingCartTest();
        menPage.verifyProductName();
        menPage.verifyProductSize();
        menPage.verifyProductColourText();
    }
}
