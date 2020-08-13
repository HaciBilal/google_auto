package com.google.stepdefinition;

import com.google.pages.googleSearch;
import com.google.utilities.ConfigurationReader;
import com.google.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

public class appleSearch {

    googleSearch googleSearch = new googleSearch();
    WebDriverWait wait =new WebDriverWait(Driver.getDriver(),10);

    @Given("User is on the search page")
    public void user_is_on_the_search_page() {
       // String googleurl = ConfigurationReader.getProperty("googleurl");
        //Driver.getDriver().get(googleurl);
        Driver.getDriver().get("http://www.google.com");
    }

    @When("user write apple on search box")
    public void user_write_apple_on_search_box() {
        googleSearch.searchbox.sendKeys("apple"+ Keys.ENTER);

        googleSearch.appleClick.click();

    }

    @Then("user should go to apple page")
    public void user_should_go_to_apple_page() {

       String actualtitle =   Driver.getDriver().getTitle();
       String expectedtitle = "Apple";
        Assert.assertEquals(actualtitle,expectedtitle);
        System.out.println("title onaylandi");
    }



}
