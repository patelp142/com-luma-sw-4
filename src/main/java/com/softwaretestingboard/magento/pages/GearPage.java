package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {

    //        * Mouse Hover on Gear Menu
    By GearMenu = By.xpath("//span[normalize-space()='Gear']");
    public void hoverOnGearMenu () {
        explicitWait();
        mouseHoverToElement(GearMenu);
    }

    //        * Click on Bags
    By Bags = By.xpath("//span[normalize-space()='Bags']");
    public void clickOnBags () {
        clickOnElement(Bags);
    }

    //        * Click on Product Name ‘Overnight Duffle’
    By ProductName = By.xpath("//a[normalize-space()='Overnight Duffle']");
    public void clickOnProductOvernightDuffle () {
        clickOnElement(ProductName);
    }

    //        * Verify the text ‘Overnight Duffle’
    By ProductNameText = By.xpath("//span[@class='base']");
    public void verifyProductNameOvernightDuffle () {
        verifyExpectedAndActual(ProductNameText, "Overnight Duffle");
    }

    //        * Change Qty 3
    By ProductQuantity = By.xpath("//input[@value='1']");
    public void changeProductQuantityTo3 () {
        clearText(ProductQuantity);
        sendTextToElement(ProductQuantity, "3");
    }

    //        * Click on ‘Add to Cart’ Button.
    By AddToCart = By.xpath("//span[normalize-space()='Add to Cart']");
    public void clickOnAddToCart () {
        clickOnElement(AddToCart);
    }

    //        * Verify the text ‘You added Overnight Duffle to your shopping cart.’
    By shoppingCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public void verifyTextOfShoppingCartAfterAddingProduct() {
        verifyExpectedAndActual(shoppingCartText,"You added Overnight Duffle to your shopping cart.");
    }

    //        * Click on ‘shopping cart’ Link into message
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    public void clickOnShoppingCartFromMessage () {
        clickOnElement(shoppingCart);
    }

    //        * Verify the product name ‘Overnight Duffle’
    By productNameText = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    public void verifyProductNameTextOvernightDuffle() {
        verifyExpectedAndActual(productNameText, "Overnight Duffle");
    }

    //        * Verify the Qty is ‘3’
    By NewProductQuantity = By.xpath("//input[@value='3']");
    public void verifyProductQuantityAs3 () {
        explicitWait();
        verifyExpectedAndActual(NewProductQuantity, "3");
    }

    //        * Verify the product price ‘$135.00’
    By ProductPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    public void verifyProductPrice () {
        verifyExpectedAndActual(ProductPrice,"$135.00");
    }

    //        * Change Qty to ‘5’
    By changeProductQuantity = By.xpath("//input[@value='3']");
    public void changeProductQuantityTo5() {

        clearText(changeProductQuantity);
        sendTextToElement(changeProductQuantity, "5");
    }

    //        * Click on ‘Update Shopping Cart’ button
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    public void clickOnUpdateShoppingCart () {
        clickOnElement(updateShoppingCart);
    }

    //        * Verify the product price ‘$225.00’
    By RevisedProductPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");
    public void verifyRevisedProductPrice () {
        verifyExpectedAndActual(RevisedProductPrice,"$225.00");
    }

}
