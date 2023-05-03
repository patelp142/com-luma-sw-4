package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

    //        * Mouse Hover on Men Menu and * Mouse Hover on Bottoms
    By MenMenu = By.xpath("//span[normalize-space()='Men']");
    By MenBottoms = By.xpath("//a[@id='ui-id-18']");
    public void mouseHoverToMenMenuAndBottoms(){
        explicitWait();
        mouseHoverMultiple(MenMenu, MenBottoms);
    }

    //        * Click on Pants
    By MenPants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    public void clickOnPants(){
        clickOnElement(MenPants);
    }

    //        * Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
    By hoverAndClickOnPantSize = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    public void hoverOnPantAndClickOnSize() {
        mouseHoverToElementAndClick(hoverAndClickOnPantSize);
    }

    //        * Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.

    By hoverAndClickOnPantColour = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    public void hoverOnPantAndClickOnColour () {
        mouseHoverToElementAndClick(hoverAndClickOnPantColour);
    }

    //        * Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
    By addToCart = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
    public void hoverOnPantAndAddToCart() {
        clickOnElement(addToCart);
    }

    //        * Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    By shoppingCartMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public void verifyShoppingCartMessage() {
    verifyExpectedAndActual(shoppingCartMessage,
                "You added Cronus Yoga Pant to your shopping cart.");
    }

    //        * Click on ‘shopping cart’ Link into message
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    public void clickOnShoppingCartFromMessage() {
        clickOnElement(shoppingCart);
    }

    //        * Verify the text ‘Shopping Cart’
    By shoppingCartText = By.xpath("//span[@class='base']");
    public void verifyShoppingCartTest () {
        verifyExpectedAndActual(shoppingCartText, "Shopping Cart");
    }

    //        * Verify the product name ‘Cronus Yoga Pant’
    By productNameText = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    public void verifyProductName () {
        verifyExpectedAndActual(productNameText, "Cronus Yoga Pant");
    }
    //        * Verify the product size ‘32’
    By productSizeText = By.xpath("//dd[contains(text(),'32')]");
    public void verifyProductSize(){
        verifyExpectedAndActual(productSizeText, "32");
    }
    //        * Verify the product colour ‘Black’
    By productColourText = By.xpath("//dd[contains(text(),'Black')]");
    public void verifyProductColourText () {
        verifyExpectedAndActual(productColourText, "Black");
    }
}
