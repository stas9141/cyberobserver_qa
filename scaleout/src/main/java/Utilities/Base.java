package Utilities;

import PageObjects.CyberObserver.MasterLeftMenuPage;
import PageObjects.CyberObserver.MasterLeftSubMenuPage;
import PageObjects.CyberObserver.MasterRemoteMachinesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;

    public static PageObjects.CyberObserver.MasterLoginPage masterLogin;
    public static PageObjects.CyberObserver.MasterHomePage masterHome;
    public static PageObjects.CyberObserver.Slave124LoginPage slave124Login;
    public static PageObjects.CyberObserver.Slave124HomePage slave124Home;
    public static PageObjects.CyberObserver.Slave124AddNewUserPage slave124AddNewUser;
    public static PageObjects.CyberObserver.MasterLeftMenuPage masterLeftMenu;
    public static PageObjects.CyberObserver.MasterLeftSubMenuPage masterLeftSubMenu;
    public static PageObjects.CyberObserver.MasterRemoteMachinesPage masterRemoteMachines;


    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;


}
