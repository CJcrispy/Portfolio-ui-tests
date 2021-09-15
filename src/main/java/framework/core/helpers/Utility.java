package framework.core.helpers;

import framework.core.helpers.Initializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility {

    public static String getApplicationURL() {
        String applicationURL = System.getenv().get("HOSTNAME");
        if(applicationURL == null || applicationURL.isEmpty()){
            applicationURL = Initializers.applicationprops.getProperty("application.url");
        }
        return applicationURL;
    }

    public static String getWebObject(String object_name){
        String web_object = Initializers.objectprops.getProperty(object_name);
        return web_object;
    }

    public static WebElement getWebElement(String object_name){
        return Initializers.getDriver().findElement(By.xpath(Utility.getWebObject(object_name)));
    }
}
