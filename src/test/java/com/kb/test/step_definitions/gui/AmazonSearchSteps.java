package com.kb.test.step_definitions.gui;


import com.kb.test.framework.helpers.UrlBuilder;
import com.kb.test.page_objects.gui.AmazonSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonSearchSteps {
    private AmazonSearchPage amazonSearchPage;

    public AmazonSearchSteps(AmazonSearchPage amazonSearchPage) {
        this.amazonSearchPage = amazonSearchPage;
    }

    @Given("User is at amazon website after launching the URL")
    public void userIsAtAmazonWebsiteAfterLaunchingTheURL() {
        UrlBuilder.startAtHomePage();

    }

    @Then("User search for the product in search result")
    public void userSearchForTheProductInSearchResult() {
        amazonSearchPage.searchProduct("Iphone-14");
    }

    @And("User clicks on the search button")
    public void userClicksOnTheSearchButton() {
        amazonSearchPage.clickSearchBtn();
    }
}
