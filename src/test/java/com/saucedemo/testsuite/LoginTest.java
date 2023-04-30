package com.saucedemo.testsuite;

import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    String baseUrl = "https://www.saucedemo.com/";
    LoginPage loginPage = new LoginPage();

   InventoryPage inventoryPage = new InventoryPage();
   private InventoryPage inventoryPage1;

@Test
public void userShouldLoginSuccessfullyWithValidCredentials() {

loginPage.enterUserName("standard_user");
loginPage.enterPassword("secret_sauce");
loginPage.clickOnLoginButton();
String actualMessage = inventoryPage.getProductText();
Assert.assertEquals(actualMessage, "Products", "error");

}

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        //inventoryPage1.getFindActualNumberOfProducts();
        int expected = 6;
        int actualMessage = inventoryPage.getFindActualNumberOfProducts();

        Assert.assertEquals(actualMessage, expected, "error");
    }
}

