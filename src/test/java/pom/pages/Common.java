package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.utils.Driver;

import java.time.Duration;

public class Common {
    public static void setUpChrome() {
        Driver.setUpChromeDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void addText(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static void clickAndHoldElement(By locator) {
        WebDriver driver = Driver.getDriver();
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).perform();
    }

    public static void clickArea(int x, int y) {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveByOffset(x, y).clickAndHold().build().perform();
    }

    public static void scrollWindowByActionsPlus3500Y() {
        Actions actions = new Actions(Driver.getDriver());
        actions
                .moveByOffset(176, 0)
                .release()
                .perform();

    }
    public static void switchToFrame(By locator) {
        Driver.getDriver().switchTo().frame(getElement(locator));
    }

}
