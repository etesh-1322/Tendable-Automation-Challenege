package TestCases;

import Base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageFunctions.MarketingPageFunctions;

public class MarketingFormTest extends BaseClass {



    @Test(description = "This test will fill the form and verify the error message when user submit the form without adding message")
    public void verifyFillingTheMarketingForm() throws InterruptedException {

        String firstName = "Test_user";
        String Org_name = "Tendable";
        String Number = "7492013421";
        String email = "test@gmail.com";
        System.out.println("Driver: " + driver);

        MarketingPageFunctions MarketingPageForm = new MarketingPageFunctions(driver);
        Assert.assertTrue(MarketingPageForm.clickContactUSButton());
        Assert.assertTrue(MarketingPageForm.clickMarketingFormButton());
        Assert.assertTrue(MarketingPageForm.submitFormAndVerify(firstName,Org_name,Number,email));

    }





}
