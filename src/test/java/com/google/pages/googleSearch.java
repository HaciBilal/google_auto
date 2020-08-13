package com.google.pages;

import com.google.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class googleSearch {

    public googleSearch(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "q")
    public WebElement searchbox;

    @FindBy(xpath = "//*[@id='rso']/div[1]/div/div/div[1]/a/h3")
    public WebElement appleClick;



}