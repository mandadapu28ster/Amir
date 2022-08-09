package BrowserFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BrowserFacade {
    private static WebDriver driver;
    public static WebDriver getDriver() throws Exception {
        return OpenBrowser();
    }


    public static WebDriver OpenBrowser() throws Exception {
        String browserType = System.getenv("browser".toLowerCase());
        if (browserType == "fireFox") {
            System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\Amir\\eclipse-workspace\\SainsburryExample\\src\\test\\resources\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserType == "ie") {
            System.setProperty("webdriver.ie.driver",
                "C:\\Users\\Amir\\eclipse-workspace\\SainsburryExample\\src\\test\\resources\\Drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Amir\\eclipse-workspace\\SainsburryExample\\src\\test\\resources\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void closeBrowser() {
        driver.close();
    }



    @SuppressWarnings("deprecation")
    public void implicitWait(int time) {

        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
    public String getPropertyValue(String key) throws Exception

    {
        // FileInputStream inputStream = new FileInputStream("C:\\Users\\user\\IdeaProjects\\RegAutomationFramework\\src\\main\\resources\\testData\\config.properties");
        FileInputStream inputStream = new FileInputStream ("C:/Users/Amir/RegAutomationFramework/RegAutomationFramework/src/main/resources/testData/config.properties");
        Properties properties = new Properties();

        properties.load(inputStream);

        String value = properties.getProperty(key);

        return value;
    }
    //public void explicitWait(int time, WebDriver dirver,  String locatorValue) {

       // WebDriverWait Wait = new WebDriverWait(driver, time);
       // Wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(locatorValue)));

    //}

   }

