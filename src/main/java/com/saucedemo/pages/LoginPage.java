package com.saucedemo.pages;


import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

By usernameField = By.id("user-name");
By passwordField = By.id("password");
    By loginButton = By.xpath("//input[@id='login-button']");

    public void enterUserName(String name){ //put any username
       sendTextToElement(usernameField, name);

    }
    public void enterPassword(String password){
        sendTextToElement(passwordField, password);

    }
    public void clickOnLoginButton(){ //specific to that button
        clickOnElement(loginButton);

    }


}
