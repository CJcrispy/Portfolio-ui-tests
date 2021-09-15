package portfolio.testng.tests;

import org.openqa.selenium.WebElement;
import portfolio.testng.Initialize;
import framework.core.helpers.Initializers;
import framework.core.helpers.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_HomeSection extends Initialize {

    @Test
    public static void validate_Title(){
        try{
            String portfolio_title = "Christoper Copeland || Developer";
            Assert.assertEquals(Initializers.getDriver().getTitle(), portfolio_title);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public static void validate_githubButton(){
        try{
            String github_link = "https://github.com/CJcrispy";
            WebElement element = Utility.getWebElement("home.githubLink");
            element.click();
            Assert.assertEquals(Initializers.getDriver().getCurrentUrl(), github_link);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void validate_linkedInButton(){
        try{
            String linkedIn_link = "https://www.linkedin.com/in/christopher-copeland-3aa599180/";
            WebElement element = Utility.getWebElement("home.linkedInLink");
            element.click();
            Thread.sleep(1000);
            Assert.assertEquals(Initializers.getDriver().getCurrentUrl(), linkedIn_link);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void validate_profilePic(){
        try{
            WebElement element = Utility.getWebElement("home.profilePic");
            Assert.assertTrue(element.isDisplayed(),"Profile Picture is present");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void validate_navbarButtons() {
        try {
            String default_link = "https://chriscopeland.tech/#";
            String home_link = "https://chriscopeland.tech/#home";
            String about_link = "https://chriscopeland.tech/#about";
            String skills_link = "https://chriscopeland.tech/#skills";
            String project_link = "https://chriscopeland.tech/#project";
            String contact_link = "https://chriscopeland.tech/#contact";

            WebElement home_button = Utility.getWebElement("portfolio.homeButton");
            home_button.click();
            Assert.assertEquals (Initializers.getDriver().getCurrentUrl(), home_link);

            WebElement about_button = Utility.getWebElement("portfolio.aboutButton");
            about_button.click();
            Assert.assertEquals (Initializers.getDriver().getCurrentUrl(), about_link);

            WebElement skill_button = Utility.getWebElement("portfolio.skillsButton");
            skill_button.click();
            Assert.assertEquals (Initializers.getDriver().getCurrentUrl(), skills_link);

            WebElement project_button = Utility.getWebElement("portfolio.projectsButton");
            project_button.click();
            Assert.assertEquals (Initializers.getDriver().getCurrentUrl(), project_link);

            WebElement contact_button = Utility.getWebElement("portfolio.contactButton");
            contact_button.click();
            Assert.assertEquals (Initializers.getDriver().getCurrentUrl(), contact_link);

            WebElement brand_button = Utility.getWebElement("portfolio.brand");
            brand_button.click();
            Assert.assertEquals (Initializers.getDriver().getCurrentUrl(), default_link);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
