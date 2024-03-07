package pom.tests.vinted;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.vinted.LoginPage;
import pom.tests.TestBase;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.vinted.lt/");
    }

    @Test
    public void testLogin() {
        String email = "desire2work4hostinger@gmail.com";
        String password = "Testas123";

        LoginPage.clickOnCookiesReject();
        LoginPage.clickOnLoginButton();
        LoginPage.clickOnLoginWithEmail();
        LoginPage.clickOnAutchWithEmail();
        LoginPage.inputEmail(email);
        LoginPage.inputPassword(password);
        LoginPage.clickButtonSubmit();
        String actualResult = "";
        String expectedResult = "";
        Assert.assertEquals(actualResult, expectedResult);
    }
}


