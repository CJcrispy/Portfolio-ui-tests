package framework.core.helpers;

public class Utility {

    public static String getApplicationURL() {
        String applicationURL = System.getenv().get("HOSTNAME");
        if(applicationURL == null || applicationURL.isEmpty()){
            applicationURL = Initializers.applicationprops.getProperty("application.url");
        }
        return applicationURL;
    }
}
