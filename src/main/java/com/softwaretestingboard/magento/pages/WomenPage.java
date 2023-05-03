package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {
    //        * Mouse Hover on Women Menu and Tops
    By WomenMenu = (By.xpath("//span[normalize-space()='Women']"));
    By WomenTopMenu = By.xpath("//a[@id='ui-id-9']");

    public void mouseHoverToWomenMenuAndTop() {
        explicitWait();
        mouseHoverMultiple(WomenMenu,WomenTopMenu);
    }

    //        * Click on Jackets
    By WomenJackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    public void clickOnJackets() {
        clickOnElement(WomenJackets);
    }

    //        * Select Sort By filter “Product Name”
    By SortByProductName = By.id("sorter");

    public void filterProductName(String Filter) {
        selectByVisibleTextFromDropDown(SortByProductName, Filter);
    }

    //        * Verify the products name display in  alphabetical order
    By ProductList = By.xpath("//strong/a");

    public void originalProductList () {
        explicitWait();
        List<WebElement> list = driver.findElements(ProductList);
        ArrayList<String> originalProductNameList = new ArrayList<>();
        for (WebElement e : list) {
            originalProductNameList.add(e.getText());
        }
        //System.out.println(originalProductNameList);
        Collections.sort(originalProductNameList);
        //System.out.println(originalProductNameList);
        //return originalProductNameList;
    }
    By DropDown = By.xpath("//div[2]//div[3]//select[1]");
    public void sortedProductList (){
        selectByVisibleTextFromDropDown(DropDown, "Product Name");
        List<WebElement> sortedList = driver.findElements(ProductList);
        ArrayList<String> sortedProductNameList = new ArrayList<>();
        for (WebElement e1 : sortedList) {
            //sortedList.add(e1.getText())      // Error in this line which I cannot resolve for now. Will try later once the solution is available
        }
        System.out.println(sortedProductNameList);
    }



    public List originalPriceList(){

        explicitWait();
        List <WebElement> productPrice = driver.findElements(DropDown);
        ArrayList<String> afterSortByAToZProductsName = new ArrayList<>();
        for (WebElement e1 : productPrice) {
            explicitWait();
            afterSortByAToZProductsName.add(e1.getText());
            //System.out.println(afterSortByAToZProductsName);
        }
        return afterSortByAToZProductsName;

    }
}

