package framework.core.helpers;

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
}
