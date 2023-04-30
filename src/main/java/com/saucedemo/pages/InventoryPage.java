package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage extends Utility {
    By productText = By.xpath("//span[contains(text(), 'Products')]");

    public String getProductText() {
        return getTextFromElement(productText);
    }

    public int getFindActualNumberOfProducts(){
        List<WebElement> productNo = driver.findElements(By.className("inventory_item"));
        return productNo.size();
    }


}
