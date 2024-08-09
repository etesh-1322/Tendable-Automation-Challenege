package locators;

import org.openqa.selenium.By;

public class MarketingFormLocators {

    public static final By CONTACT_US = By.xpath("//a[contains(text(),'Contact Us')]");
    public static final By Marketing_FORM = By.xpath("//div[contains(text(),'Marketing')]/following-sibling::div/button");
    public static final By First_Name = By.xpath("//input[@id='form-input-fullName']");
    public static final By Org_name = By.xpath("(//input[@placeholder='Organisation Name ' and @id = 'form-input-organisationName'])[1]");
    public static final By Phone_Num = By.xpath("(//input[@placeholder='Phone Number' and @id = 'form-input-cellPhone'])[1]");
    public static final By Email = By.xpath("(//input[@placeholder='Email' and @id = 'form-input-email'])[1]");
    public static final By JobRole = By.xpath("(//select[@id='form-input-jobRole'])[1]");
    public static final By ErrorMessage = By.xpath("//ul[@class='ff-errors']");
    public static final By consentButton = By.xpath("(//input[@id='form-input-consentAgreed-0'])[1]");
    public static final By submitButton = By.xpath("(//button[contains(text(),'Submit')])[1]");

}
