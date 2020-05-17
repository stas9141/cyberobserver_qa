package Extensions;

import PageObjects.CyberObserver.Slave124HomePage;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

//import static WorkFlows.WebFlows.getUserCount;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Verifications extends CommonOps {
    public static void partOfTextInElement(WebElement elem, String expectedValue) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.getText().contains(expectedValue));
    }

    public static void textInElement(WebElement elem, String expectedValue) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expectedValue);
    }

    public static void numberOfElementsAfterAdding(List<WebElement> elems, int expectedValue)
    {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        assertEquals(elems.size(), expectedValue);


    }

//    public static void numberOfElementsAfterAdding() {
//
//        int before = getUserCount();
//        int after = getUserCount();
//        assertEquals(after, before + 1);
//    }


}



