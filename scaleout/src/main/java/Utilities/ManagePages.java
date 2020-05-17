package Utilities;

import PageObjects.CyberObserver.MasterLeftMenuPage;
import PageObjects.CyberObserver.MasterLeftSubMenuPage;
import PageObjects.CyberObserver.MasterRemoteMachinesPage;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base
{
    public static void init()
    {
        masterLogin = PageFactory.initElements(driver, PageObjects.CyberObserver.MasterLoginPage.class);
        masterHome = PageFactory.initElements(driver, PageObjects.CyberObserver.MasterHomePage.class);
        slave124Login = PageFactory.initElements(driver, PageObjects.CyberObserver.Slave124LoginPage.class);
        slave124Home = PageFactory.initElements(driver, PageObjects.CyberObserver.Slave124HomePage.class);
        slave124AddNewUser = PageFactory.initElements(driver, PageObjects.CyberObserver.Slave124AddNewUserPage.class);
        masterLeftMenu = PageFactory.initElements(driver, PageObjects.CyberObserver.MasterLeftMenuPage.class);
        masterLeftSubMenu = PageFactory.initElements(driver, PageObjects.CyberObserver.MasterLeftSubMenuPage.class);
        masterRemoteMachines = PageFactory.initElements(driver, PageObjects.CyberObserver.MasterRemoteMachinesPage.class);

    }
}