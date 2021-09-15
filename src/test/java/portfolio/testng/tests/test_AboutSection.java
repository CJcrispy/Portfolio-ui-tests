package portfolio.testng.tests;

import framework.core.helpers.Utility;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import portfolio.testng.Initialize;

public class test_AboutSection extends Initialize {

    @Test
    public static void validate_paragraph1() {
        try {
            WebElement element = Utility.getWebElement("portfolio.aboutButton");
            element.click();

            WebElement paragraph = Utility.getWebElement("about.firstParagraph");
            Assert.assertNotNull(paragraph.getText());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public static void validate_paragraph2() {
        try {
            WebElement element = Utility.getWebElement("portfolio.aboutButton");
            element.click();

            WebElement paragraph = Utility.getWebElement("about.secondParagraph");
            Assert.assertNotNull(paragraph.getText());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public static void validate_paragraph3() {
        try {
            WebElement element = Utility.getWebElement("portfolio.aboutButton");
            element.click();

            WebElement paragraph = Utility.getWebElement("about.thirdParagraph");
            Assert.assertNotNull(paragraph.getText());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public static void validate_aboutPageImage(){
        try{
            WebElement element = Utility.getWebElement("portfolio.aboutButton");
            element.click();

            WebElement about_image = Utility.getWebElement("about.image");
            Assert.assertTrue(about_image.isDisplayed(),"Image in About section is present");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
