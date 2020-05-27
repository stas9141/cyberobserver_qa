package Extensions;

import Utilities.CommonOps;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;


public class UiActions extends CommonOps {
    public static void click(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        //action.moveToElement(elem).click().build().perform();
        elem.click();
    }

    public static void updateText(WebElement elem, String value) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        if (value != null) {
            elem.sendKeys(value);
        }
    }

    public static void updateDropDown(WebElement elem, String value) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value); //selectByIndex(1);
    }

    public static void mouseHoverElements(WebElement elem1, WebElement elem2) {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

    public static void copyTokenToClipboard(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        //String x = Keys.CONTROL + "v"
    }


    public static void pastText(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(Keys.CONTROL + "v");
    }

    public String getElementText(WebElement elem){
        return elem.getText();
    }

    public void enterTextIntoField(String value, WebElement elem){
        elem.sendKeys(value);
    }
}
