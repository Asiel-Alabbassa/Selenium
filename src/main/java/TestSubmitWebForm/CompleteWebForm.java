package TestSubmitWebForm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PagesSubmitWebForm.ConfirmationPage;
import PagesSubmitWebForm.FormPage;
import org.junit.Assert;

public class CompleteWebForm {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        FormPage formPageObj= new FormPage();
        formPageObj.submitForm(driver);

        ConfirmationPage confirmationPageObj = new ConfirmationPage();
        confirmationPageObj.waitForAlertBanner(driver);

       //

        Assert.assertEquals("The form was successfully submitted!",confirmationPageObj.getAlertMessage(driver));
        driver.quit();
    }


}
