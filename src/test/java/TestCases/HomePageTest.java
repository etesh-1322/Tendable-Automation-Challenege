package pageFunctions;

import locators.HomePageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageFunctions extends HomePageLocators {
   private final WebDriver driver;

    public HomePageFunctions(WebDriver driver) {
        this.driver = driver;
    }


    public boolean verifyHomePageButton() {
        boolean flag = false;
        WebElement el = driver.findElement(HomePageLocators.HOME_PAGE);
        flag = el.isDisplayed();

        return flag;

    }

    public boolean verifyOurStoryButton() {
        boolean flag = false;
        WebElement el = driver.findElement(HomePageLocators.OUR_STORY);
        flag = el.isDisplayed();

        return flag;
    }

    public boolean clickOurStoryButton()
    {
        boolean flag = false;
        WebElement el = driver.findElement(HomePageLocators.OUR_STORY);
        if(el.isDisplayed())
        {
            el.click();
            flag=true;
        }
        return flag;

    }

    public boolean verifyOurSolutionButton() {
        boolean flag = false;
        WebElement el = driver.findElement(HomePageLocators.OUR_SOLUTION);
        flag = el.isDisplayed();

        return flag;

    }
    public boolean clickOurSolutionButton() {
        boolean flag = false;
        WebElement el = driver.findElement(HomePageLocators.OUR_SOLUTION);
        if(el.isDisplayed())
        {
            el.click();
            flag = true;
        }

        return flag;
    }

    public boolean verifyWhyTendableButton() {
        boolean flag = false;
        WebElement el = driver.findElement(HomePageLocators.WHY_TENDABLE);
        flag = el.isDisplayed();

        return flag;

    }
    public boolean clickWhyTendableButton()
    {
        boolean flag = false;
        WebElement el = driver.findElement(HomePageLocators.WHY_TENDABLE);
        if(el.isDisplayed())
        {
            el.click();
            flag=true;
        }

        return flag;
    }

    public boolean verifyRequestDemoButton() {
        boolean flag = false;
        WebElement el = driver.findElement(HomePageLocators.REQUEST_DEMO);
        flag = el.isDisplayed();

        return flag;

    }


}
