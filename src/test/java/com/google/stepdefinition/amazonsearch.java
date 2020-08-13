package com.google.stepdefinition;

import com.google.pages.amazonClick;
import com.google.pages.googleSearch;
import com.google.utilities.ConfigurationReader;
import com.google.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazonsearch {



    amazonClick amazonClick = new amazonClick();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
      String googleurl = ConfigurationReader.getProperty("googleurl");
        Driver.getDriver().get(googleurl);

    }

    @When("user write amazon on search box")
    public void user_write_amazon_on_search_box() {
        amazonClick.searchbox.sendKeys("Amazon"+ Keys.ENTER);

        amazonClick.amazonClick.click();

    }

    @Then("user should go to amazon page")
    public void user_should_go_to_amazon_page() {

        String actualtitle =   Driver.getDriver().getTitle();
        String expectedtitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(actualtitle,expectedtitle);
        System.out.println("amazon title onaylandi");




    }




}
