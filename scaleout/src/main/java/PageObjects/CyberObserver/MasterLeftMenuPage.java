package PageObjects.CyberObserver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MasterLeftMenuPage
{
    @FindBy(how = How.XPATH, using = "//a[@href='#/tools']")   //div[@class='main_container']/h4")
    public WebElement link_tools;
    @FindBy(how = How.XPATH, using = "//a[@href='#/coverage']")   //div[@class='main_container']/h4")
    public WebElement link_coverage;
    @FindBy(how = How.XPATH, using = "//a[@href='#/systemReports']")   //div[@class='main_container']/h4")
    public WebElement link_systemReports;

    @FindBy(how = How.XPATH, using = "//a[@ng-repeat='menu in menus'][@href='#/system/tools']")
    public WebElement link_system;
}
