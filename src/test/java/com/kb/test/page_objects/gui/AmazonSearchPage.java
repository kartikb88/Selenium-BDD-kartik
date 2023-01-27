package com.kb.test.page_objects.gui;

import com.kb.test.framework.PageObject;
import org.openqa.selenium.By;

public class AmazonSearchPage  extends PageObject {
    private By SearchBtn = By.id("nav-search-submit-button");
    private By searchBar = By.id("twotabsearchtextbox");

    public void clickSearchBtn() {

        waitForExpectedElement(SearchBtn).click();
    }

    public void searchProduct(String value) {
        waitForExpectedElement(searchBar).sendKeys(value);

    }
}
