package pageFunctions;

import com.beust.ah.A;
import locators.MarketingFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MarketingPageFunctions extends MarketingFormLocators {

    private WebDriver driver;

    public MarketingPageFunctions(WebDriver driver) {
        this.driver = driver;
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
        else flag=false;

        return flag;
    }

    public boolean clickMarketingFormButton() {
        boolean flag = false;
        WebElement el = driver.findElement(MarketingFormLocators.Marketing_FORM);

        if (el.isDisplayed()) {
            el.click();
            flag = true;
        } else flag = false;

        return flag;
    }

    public boolean EnterfirstName() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean flag = false;

       

        WebElement ele = driver.findElement(By.xpath("(//input[@placeholder='Full Name' and @id = 'form-input-fullName'])[1]"));

        Thread.sleep(4000);
        if (ele.isDisplayed()) {
            ele.click();
            ele.sendKeys("Test User");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            flag=true;

        } else flag = false;

        return flag;
    }

    public boolean EnterOrganizationName()
    {
        boolean flag = false;
        WebElement ele = driver.findElement(MarketingFormLocators.Org_name);
        if (ele.isDisplayed()) {
            ele.click();
            ele.sendKeys("tendable");

            flag = true;

        } else flag = false;

        return flag;
    }
    public boolean EnterPhoneNumber()
    {
        boolean flag = false;
        WebElement ele = driver.findElement(MarketingFormLocators.Phone_Num);
        if (ele.isDisplayed()) {
            ele.click();
            ele.sendKeys("8950321832");

            flag = true;

        } else flag = false;

        return flag;
    }

    public boolean EnterEmail()
    {
        boolean flag = false;
       WebElement ele = driver.findElement(MarketingFormLocators.Email);
        if (ele.isDisplayed()) {
            ele.click();
            ele.sendKeys("test@gmail.com");

            flag = true;

        } else flag = false;

        return flag;
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

        else flag=false;
        return flag;
    }

    public boolean selectConsentRadioButton()
    {
        boolean flag =false;
        WebElement ele = driver.findElement(MarketingFormLocators.consentButton);
        ele.click();
        if(ele.isSelected())
        {
            flag = true;

        }

        else flag=false;

        return flag;

    }

    public boolean clickSubmitButton()
    {
        boolean flag =false;
        WebElement ele = driver.findElement(MarketingFormLocators.submitButton);

        if(ele.isDisplayed()) {
            ele.click();
            flag=true;
        }
        else flag=false;

        return flag;

    }

    public boolean errorMessage() throws InterruptedException {
        Thread.sleep(5000);
        boolean flag=false;
        WebElement el = driver.findElement(MarketingFormLocators.ErrorMessage);
        if(el.isDisplayed())
        {
            flag=true;

        }
        else flag=false;

        return flag;


    }













}
