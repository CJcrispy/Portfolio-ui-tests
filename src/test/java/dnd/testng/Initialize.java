package dnd.testng;

import framework.core.helpers.Initializers;
import framework.core.helpers.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class Initialize {

    public static String downloadpath = null;
    public static String filePath = null;


    @BeforeSuite
    public static void initialize() throws SQLException{

        Initializers.loadApplicationProperties();
        Initializers.loadObjectProperties();
    }

    @BeforeMethod
    public static void loadApplication(Method m){
        Initializers.setDriver(m.getName());
        try{
            Initializers.getDriver().get(Utility.getApplicationURL());
            Initializers.getDriver().manage().window().maximize();
            Initializers.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public static void Quit(){
        Initializers.getDriver().close();
        Initializers.getDriver().quit();
    }

}
