package framework.core.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.util.Properties;

public class Initializers {

    public static Properties applicationprops;
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
    public static String downloadPath = System.getProperty("user.home")+"/Downloads";

    public static void loadApplicationProperties() {
        String propertiesFilesLocation = null;
        propertiesFilesLocation = System.getProperty("user.dir")
                + "//src/main//resources//application//application.properties";
        try {
            applicationprops = new Properties();
            FileInputStream propfile = new FileInputStream(
                    propertiesFilesLocation
            );
            applicationprops.load(propfile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setDriver(String m){
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "//src//main//resources//commons//chromedriver.exe");
        String browser =  System.getenv().get("BROWSER");
        if(browser == null || browser.isEmpty() || browser.contentEquals("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-extensions");
            driver = new ChromeDriver(options);
        }
//        else if(browser.isEmpty()){
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--disable-popup-blocking");
//            options.addArguments("--disable-extensions");
//        } else if(browser.contentEquals("Chrome")){
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--disable-popup-blocking");
//            options.addArguments("--disable-extensions");
//        }

        webDriver.set(driver);
    }

    public static WebDriver getDriver() { return webDriver.get(); }
}
