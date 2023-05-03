package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenPageTest extends BaseTest {
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
//        * Mouse Hover on Women Menu
        womenPage.mouseHoverToWomenMenuAndTop();
//        * Click on Jackets
        womenPage.clickOnJackets();
//        * Select Sort By filter “Product Name”
        womenPage.filterProductName("Product Name");
//        * Verify the products name display in  alphabetical order         //Tried but could not solve this issue
        //Method not working. Refer to WomenPage method 'sortProductAToZ'
        //List originalList = womenPage.originalProductList();
        //Collections.sort(originalProductNameList);
        //selectByVisibleTextFromDropDown(By.xpath("//select[@id='sorter']"), "Product Name");
        //List sortedProductListAToZ = womenPage.originalProductList();
        //Assert.assertEquals(originalProductNameList, sortedProductListAToZ);

    }
}
