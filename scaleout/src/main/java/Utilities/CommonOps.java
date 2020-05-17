package Utilities;

import WorkFlows.WebFlows;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base
{
    public static String getData(String nodeName)
    {
        File fXmlFile;
        DocumentBuilderFactory dbFactory;
        DocumentBuilder dBuilder;
        Document doc = null;
        try
        {

            fXmlFile = new File("./Configuration/DataConfig.xml");
            dbFactory = DocumentBuilderFactory.newInstance();
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

        } catch (Exception e)
        {
            System.out.println("Error Reading XML file: " + e);
        } finally
        {
            return doc.getElementsByTagName(nodeName).item(0).getTextContent();
        }
    }

    public static void initBrowser(String browserType)
    {
        if (browserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if (browserType.equalsIgnoreCase("firefox"))
            driver = initFFDriver();
        else if (browserType.equalsIgnoreCase("ie"))
            driver = initIEDriver();
        else
            throw new RuntimeException("Invalid browser");
        driver.manage().window().maximize();
        driver.get(getData("url_master"));
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getData("TimeOut")));
        action = new Actions(driver);

    }

    public static WebDriver initChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFFDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver initIEDriver()
    {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }




    public static int getUserCount() {
        return slave124Home.users.size();
    }


    @BeforeClass
    public void startSession()
    {

        if (getData("PlatformName").equalsIgnoreCase("web"))
            initBrowser(getData("BrowserName"));
//       else if (getData("PlatforName").equalsIgnoreCase("mobile"))
//            initMobile();
        else
            throw new RuntimeException("Invalid platform name");
        ManagePages.init();

        WebFlows.login(getData("user"),getData("password"));

    }


    @AfterMethod
    public void afterMethod()
    {
        driver.get(getData("url_master"));
    }

    @AfterClass
    public void closeSession()
    {
        driver.quit();
    }
}
