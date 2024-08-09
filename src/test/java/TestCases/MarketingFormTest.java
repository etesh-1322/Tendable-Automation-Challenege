package TestCases;

import Base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageFunctions.MarketingPageFunctions;

public class MarketingFormTest extends BaseClass {



    @Test(description = "This test will fill the form and verify the error message when user submit the form without adding message")
    public void verifyMarketingForm() throws InterruptedException {
        System.out.println("Driver: " + driver);
        MarketingPageFunctions MarketingPageForm = new MarketingPageFunctions(driver);
        Assert.assertTrue(MarketingPageForm.clickContactUSButton());
        Assert.assertTrue(MarketingPageForm.clickMarketingFormButton());
        Assert.assertTrue(MarketingPageForm.EnterfirstName());
        Assert.assertTrue(MarketingPageForm.EnterOrganizationName());
        Assert.assertTrue(MarketingPageForm.EnterPhoneNumber());
        Assert.assertTrue(MarketingPageForm.EnterEmail());
        Assert.assertTrue(MarketingPageForm.selectConsentRadioButton());
        Assert.assertTrue(MarketingPageForm.clickSubmitButton());
        Assert.assertTrue(MarketingPageForm.errorMessage()); // Here we will verify the error message when message is not added while submiting the form






    }





}
