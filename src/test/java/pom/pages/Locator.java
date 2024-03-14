package pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Vinted {

        public class LoginPage {
            public static By inputEmailBox = By.xpath("//input[@name='username']");
            public static By buttonLogIn = By.xpath("//a[@data-testid='header--login-button']");
            public static By elementCookiesReject = By.xpath("//button[@id='onetrust-reject-all-handler']");
            public static By emailAuth = By.xpath("//span[contains(@class, 'web_ui__Text__text') and contains(@class, 'web_ui__Text__body') and contains(@class, 'web_ui__Text__left') and contains(@class, 'web_ui__Text__primary') and text()='el. paštu']");
            public static By loginWithEmail = By.xpath("//span[@class='web_ui__Text__text web_ui__Text__body web_ui__Text__left web_ui__Text__primary' and text()='Prisijungti']");

            public static By passwordBox = By.xpath("//input[@type='password']");
            public static By buttonSubmit = By.xpath("//button[@type='submit']");
            public static By slider = By.xpath("//i[@class='sliderIcon']");
            public static By iFrameSwitch = By.xpath("//iframe[@src]");
        }
    }
}
