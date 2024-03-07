package pom.pages.vinted;

import pom.pages.Common;
import pom.pages.Locator;

public class LoginPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void inputEmail(String email) {
        Common.addText(Locator.Vinted.LoginPage.inputEmailBox, email);
    }

    public static void clickOnLoginButton() {
        Common.waitForElementToBeVisible(Locator.Vinted.LoginPage.buttonLogIn);
        Common.clickOnElement(Locator.Vinted.LoginPage.buttonLogIn);
    }

    public static void clickOnCookiesReject() {
        Common.waitForElementToBeVisible(Locator.Vinted.LoginPage.elementCookiesReject);
        Common.clickOnElement(Locator.Vinted.LoginPage.elementCookiesReject);
    }

    public static void clickOnAutchWithEmail() {
        Common.waitForElementToBeVisible(Locator.Vinted.LoginPage.emailAuth);
        Common.clickOnElement(Locator.Vinted.LoginPage.emailAuth);
    }

    public static void clickOnLoginWithEmail() {
        Common.waitForElementToBeVisible(Locator.Vinted.LoginPage.loginWithEmail);
        Common.clickOnElement(Locator.Vinted.LoginPage.loginWithEmail);
    }

    public static void inputPassword(String password) {
        Common.addText(Locator.Vinted.LoginPage.passwordBox, password);
    }

    public static void clickButtonSubmit() {
        Common.clickOnElement(Locator.Vinted.LoginPage.buttonSubmit);
    }
}
