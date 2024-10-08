package TestCases;

import Base.BaseClass;
import pageFunctions.HomePageFunctions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    @Test (description = "This test case verifies all the header like our story, why tendable, home page and our solution are present or not")
    public void VerifyHomePageHeaders() {

        System.out.println("Driver: " + driver);
        HomePageFunctions homePage = new HomePageFunctions(driver);
        Assert.assertTrue(homePage.verifyHomePageButton());
        Assert.assertTrue(homePage.verifyOurStoryButton());
        Assert.assertTrue(homePage.verifyOurSolutionButton());
        Assert.assertTrue(homePage.verifyWhyTendableButton());

    }

    @Test(description = "This test verifies request demo button visibility and also verifies when a user clicks on Our Story, Our Solution, WhyTendable the request demo button is present")
    public void VerifyRequestDemoButtonOnHomePage()
    {
        System.out.println("Driver: " + driver);
        HomePageFunctions homePage = new HomePageFunctions(driver);
        Assert.assertTrue(homePage.verifyRequestDemoButton());

    }

    @Test(description = "This test verifies request demo button visibility of request demo button on our story page")
    public void VerifyRequestDemoButtonOnOurStoryPage()
    {

        System.out.println("Driver: " + driver);
        HomePageFunctions homePage = new HomePageFunctions(driver);
        Assert.assertTrue(homePage.clickOurStoryButton());
        Assert.assertTrue(homePage.verifyRequestDemoButton());
    }

    @Test(description = "This test verifies request demo button visibility of request demo button on our solution page")

    public void VerifyRequestDemoButtonOnOurSolutionPage()
    {
        System.out.println("Driver: " + driver);
        HomePageFunctions homePage = new HomePageFunctions(driver);
        Assert.assertTrue(homePage.clickOurStoryButton());
        Assert.assertTrue(homePage.verifyRequestDemoButton());
    }

    @Test(description = "This test verifies request demo button visibility of request demo button on why tendable page")

    public void VerifyRequestDemoButtonOnWhyTendablePage()
    {
        System.out.println("Driver: " + driver);
        HomePageFunctions homePage = new HomePageFunctions(driver);
        Assert.assertTrue(homePage.clickWhyTendableButton());
        Assert.assertTrue(homePage.verifyRequestDemoButton());
    }


}
