package com.saucedemo.pages;


import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
By loginButton = By.xpath("//input[@id='login-button']");

public void clickOnLoginButton(){
    clickOnElement(loginButton);


    }



}
