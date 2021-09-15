package portfolio.testng.tests;

import framework.core.helpers.Initializers;
import framework.core.helpers.Utility;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import portfolio.testng.Initialize;

public class test_ContactSection extends Initialize {

    @Test
    public static void validate_githubLink(){
        try{
            String text = "Github";
            WebElement link_text = Utility.getWebElement("contact.githubText");
            Assert.assertEquals(link_text, text);

            String github_link = "https://github.com/CJcrispy";
            WebElement element = Utility.getWebElement("contact.githubLink");
            element.click();

            Thread.sleep(1000);
            Assert.assertEquals(Initializers.getDriver().getCurrentUrl(), github_link);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void validate_linkedInLink(){
        try{
            String text = "LinkedIn";
            WebElement link_text = Utility.getWebElement("contact.linkedInText");
            Assert.assertEquals(link_text, text);

            String linkedIn_link = "https://www.linkedin.com/in/christopher-copeland-3aa599180/";
            WebElement element = Utility.getWebElement("contact.linkedInLink");
            element.click();

            Thread.sleep(1000);
            Assert.assertEquals(Initializers.getDriver().getCurrentUrl(), linkedIn_link);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void validate_twitterLink(){
        try{
            String text = "Twitter";
            WebElement link_text = Utility.getWebElement("contact.twitterText");
            Assert.assertEquals(link_text, text);

            String linkedIn_link = "https://twitter.com/CJcrispy_";
            WebElement element = Utility.getWebElement("contact.twitterLink");
            element.click();

            Thread.sleep(1000);
            Assert.assertEquals(Initializers.getDriver().getCurrentUrl(), linkedIn_link);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void validate_email(){
        try{
            String text = "cjcopeland20@gmail.com";
            WebElement link_text = Utility.getWebElement("contact.emailAddress");
            Assert.assertEquals(link_text, text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void validate_contactForm(){
        try {
            WebElement name_field = Utility.getWebElement("contact.nameField");
            name_field.sendKeys("John Doe");

            WebElement email_field = Utility.getWebElement("contact.emailField");
            email_field.sendKeys("jonh.doe@testemail.com");

            WebElement subject_field = Utility.getWebElement("contact.subjectField");
            subject_field.sendKeys("TestNG test");

            WebElement message_field = Utility.getWebElement("contact.messageField");
            message_field.sendKeys("This is a test");

            WebElement send_email = Utility.getWebElement("contact.sendEmailButton");
            send_email.submit();

            Assert.assertEquals(Initializers.getDriver().getCurrentUrl(), "https://formsubmit.co/CJCopeland20@gmail.com");
            WebElement captcha_text = Utility.getWebElement("formsubmit.captchaText");
            Assert.assertNotNull(captcha_text);

            WebElement captcha_desc = Utility.getWebElement("formsubmit.captchaDescription");
            Assert.assertNotNull(captcha_desc);

            WebElement checkbox = Utility.getWebElement("formsubmit.checkbox");
            checkbox.click();
            Assert.assertEquals(Initializers.getDriver().getCurrentUrl(), "https://formsubmit.co/form/submission");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
