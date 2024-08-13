package pageFunctions;

import com.beust.ah.A;

import locators.MarketingFormLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MarketingPageFunctions extends MarketingFormLocators {

    private final WebDriver driver;
    private WebDriverWait wait;
    JavascriptExecutor js;

    public MarketingPageFunctions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    public boolean clickContactUSButton()
    {
        boolean flag = false;
        WebElement el = driver.findElement(MarketingFormLocators.CONTACT_US);

        if(el.isDisplayed())
        {
            el.click();
            flag=true;
        }

        return flag;
    }

    public boolean clickMarketingFormButton() {
        boolean flag = false;
        WebElement el = driver.findElement(MarketingFormLocators.Marketing_FORM);

        if (el.isDisplayed()) {
            el.click();
            flag = true;
        }

        return flag;
    }

    public  void fillMarketingForm(String firstNames, String orgName, String Number, String email) throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(MarketingFormLocators.First_Name));
        Thread.sleep(2000);

        WebElement firstName = driver.findElement(MarketingFormLocators.First_Name);
        firstName.click();
        firstName.sendKeys(firstNames);
        System.out.println(firstName.getText());


        WebElement number  = driver.findElement(MarketingFormLocators.Phone_Num);
        number.click();
        number.sendKeys(Number);
        System.out.println(number.getText());

        WebElement OrgName = driver.findElement(MarketingFormLocators.Org_name);
        OrgName.click();
        OrgName.sendKeys(orgName);
        System.out.println(OrgName.getText());

        WebElement Email = driver.findElement(MarketingFormLocators.Email);
        Email.click();
        Email.sendKeys(email);
        System.out.println(Email.getText());

    }


    public boolean selectRole()
    {
        boolean flag = false;
        WebElement el = driver.findElement(MarketingFormLocators.JobRole);
        Select s = new Select(el);
        s.selectByValue("Executive Board Member");
        if(el.getText().equals("Executive Board Member"))
        {
            flag=true;
        }
        return flag;
    }

    public boolean selectConsentRadioButton()  {

        boolean flag =false;
        WebElement ele = driver.findElement(MarketingFormLocators.consentButton);
        ele.click();
        if(ele.isSelected())
        {
            flag = true;
        }
        return flag;

    }

    public boolean clickSubmitButton() {

        boolean flag =false;
        WebElement ele = driver.findElement(MarketingFormLocators.submitButton);

        if(ele.isDisplayed()) {
           ele.click();
            flag=true;
        }

        return flag;
    }

    public boolean submitFormAndVerify(String firstNames, String orgName, String Number, String email) throws InterruptedException {
        boolean flag=false;
        fillMarketingForm(firstNames, orgName, Number, email);
        if( selectConsentRadioButton()  && clickSubmitButton() && errorMessage())
        {
            flag=true;
        }
        return flag;
    }


    public boolean errorMessage()  {
        boolean flag=false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(MarketingFormLocators.ErrorMessage));
         WebElement error = driver.findElement(MarketingFormLocators.ErrorMessage);
        if(error.isDisplayed())
        {
            flag=true;
        }

        return flag;

    }

}
