package dnd.testng.tests;

import dnd.testng.Initialize;
import framework.core.helpers.Initializers;
import framework.core.helpers.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_HomePage extends Initialize {

    @Test
    public static void home_page_test(){

        Initializers.getDriver().findElement(By.xpath(Utility.getWebObject("portfolio.homeButton"))).click();


    }

    @Test
    public static void about_page_1st_test() {

        try {
            Initializers.getDriver().findElement(By.xpath(Utility.getWebObject("portfolio.aboutButton"))).click();

            String first_sentence = Initializers.getDriver().findElement(By.cssSelector(Utility.getWebObject("about.firstSentence"))).getText();

            Assert.assertNotNull(first_sentence);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public static void about_page_2nd_test() {

        try {
            Initializers.getDriver().findElement(By.xpath(Utility.getWebObject("portfolio.aboutButton"))).click();

            String second_sentence = Initializers.getDriver().findElement(By.cssSelector(Utility.getWebObject("about.secondSentence"))).getText();

            Assert.assertNotNull(second_sentence);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Test
    public static void about_page_3rd_test() {

        try {
            Initializers.getDriver().findElement(By.xpath(Utility.getWebObject("portfolio.aboutButton"))).click();

            String third_sentence = Initializers.getDriver().findElement(By.cssSelector(Utility.getWebObject("about.thirdSentence"))).getText();

            Assert.assertNotNull(third_sentence);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Test
    public static void skills_page_test(){

        Initializers.getDriver().findElement(By.xpath(Utility.getWebObject("portfolio.skillsButton"))).click();

    }

    @Test
    public static void projects_page_test(){

        Initializers.getDriver().findElement(By.xpath(Utility.getWebObject("portfolio.projectsButton"))).click();


    }

    @Test
    public static void contact_page_test(){

        Initializers.getDriver().findElement(By.xpath(Utility.getWebObject("portfolio.contactButton"))).click();


    }
}
