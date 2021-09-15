package portfolio.testng.tests;

import framework.core.helpers.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import portfolio.testng.Initialize;

public class test_SkillsSection extends Initialize {

    @Test
    public static void skills_page_test(){
        try {
            WebElement element = Utility.getWebElement("portfolio.skillsButton");
            element.click();

            WebElement java_text = Utility.getWebElement("skills.row");
            for (int i=1; i <= java_text.getText().length(); i++){
                WebElement skill_image = Utility.getWebElement("//*[@id=\"skills\"]/div/div[2]/div/div/div[" + i + "]/i");
                Assert.assertNotNull(skill_image);

                WebElement skill_text = Utility.getWebElement("//*[@id=\"skills\"]/div/div[2]/div/div/div[" + i + "]/p");
                Assert.assertNotNull(skill_text.getText());
            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
