package portfolio.testng.tests;

import framework.core.helpers.Initializers;
import framework.core.helpers.Utility;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import portfolio.testng.Initialize;

public class test_ProjectsSection extends Initialize {

    @Test
    public static void validate_portfolioProjectCard(){
        try {
            String portfolio_github = "https://github.com/CJcrispy/Portfolio";
            WebElement project_section = Utility.getWebElement("portfolio.projectsButton");
            project_section.click();

            WebElement web_tab = Utility.getWebElement("projects.webTab");
            web_tab.click();

            WebElement project_pic = Utility.getWebElement("projects.portfolioImage");
            Assert.assertTrue(project_pic.isDisplayed(),"Portfolio project image is present");

            WebElement project_title = Utility.getWebElement("projects.portfolioTitle");
            Assert.assertNotNull(project_title, "Project title is present");
            Assert.assertEquals(project_title.getText(), "Portfolio", "Project title has the correct text");

            WebElement project_description = Utility.getWebElement("projects.portfolioDescription");
            Assert.assertNotNull(project_description, "Project description is present");

            WebElement portfolio_link = Utility.getWebElement("projects.portfolioLink");
            portfolio_link.click();

            Assert.assertEquals(Initializers.getDriver().getCurrentUrl(), portfolio_github);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public static void validate_socialMediaCoreProjectCard(){
        try {
            String socialMedia_github = "https://github.com/CJcrispy/Social-Media-API";
            WebElement project_section = Utility.getWebElement("portfolio.projectsButton");
            project_section.click();

            WebElement web_tab = Utility.getWebElement("projects.backEndTab");
            web_tab.click();

            WebElement project_pic = Utility.getWebElement("projects.socialMediaCoreImage");
            Assert.assertTrue(project_pic.isDisplayed(),"Social Media core project image is present");

            WebElement project_title = Utility.getWebElement("projects.socialMediaCoreTitle");
            Assert.assertNotNull(project_title, "Project title is present");
            Assert.assertEquals(project_title.getText(), "Social Media core", "Project title has the correct text");

            WebElement project_description = Utility.getWebElement("projects.socialMediaCoreDescription");
            Assert.assertNotNull(project_description, "Project description is present");

            WebElement portfolio_link = Utility.getWebElement("projects.socialMediaCoreLink");
            portfolio_link.click();

            Assert.assertEquals(Initializers.getDriver().getCurrentUrl(), socialMedia_github);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public static void validate_sudokuProjectCard(){
        try {
            String sudoku_github = "https://github.com/CJcrispy/Sudoku-game";
            WebElement project_section = Utility.getWebElement("portfolio.projectsButton");
            project_section.click();

            WebElement web_tab = Utility.getWebElement("projects.backEndTab");
            web_tab.click();

            WebElement project_pic = Utility.getWebElement("projects.sudokuImage");
            Assert.assertTrue(project_pic.isDisplayed(),"Portfolio project image is present");

            WebElement project_title = Utility.getWebElement("projects.sudokuTitle");
            Assert.assertNotNull(project_title, "Project title is present");
            Assert.assertEquals(project_title.getText(), "Sudoku", "Project title has the correct text");

            WebElement project_description = Utility.getWebElement("projects.sudokuDescription");
            Assert.assertNotNull(project_description, "Project description is present");

            WebElement portfolio_link = Utility.getWebElement("projects.sudokuLink");
            portfolio_link.click();

            Assert.assertEquals(Initializers.getDriver().getCurrentUrl(), sudoku_github);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public static void validate_testngRegressionProjectCard(){
        try {
            String portfolioTests_github = "https://github.com/CJcrispy/Portfolio-ui-testse";
            WebElement project_section = Utility.getWebElement("portfolio.projectsButton");
            project_section.click();

            WebElement web_tab = Utility.getWebElement("projects.testingTab");
            web_tab.click();

            WebElement project_pic = Utility.getWebElement("projects.testngImage");
            Assert.assertTrue(project_pic.isDisplayed(),"Portfolio project image is present");

            WebElement project_title = Utility.getWebElement("projects.testngTitle");
            Assert.assertNotNull(project_title, "Project title is present");
            Assert.assertEquals(project_title.getText(), "TestNG Regression", "Project title has the correct text");

            WebElement project_description = Utility.getWebElement("projects.testngDescription");
            Assert.assertNotNull(project_description, "Project description is present");

            WebElement portfolio_link = Utility.getWebElement("projects.testngLink");
            portfolio_link.click();

            Assert.assertEquals(Initializers.getDriver().getCurrentUrl(), portfolioTests_github);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
