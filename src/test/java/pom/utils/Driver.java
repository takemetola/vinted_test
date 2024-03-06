package pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setUpChromeDriver() {

        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeOptions option = new ChromeOptions();

        //Does not run headless. Site checks for real human input.
        //option.addArguments("--headless=new");
        option.addArguments("--start-maximized");

        driver.set(new ChromeDriver(option));
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        //driver.get().quit();
        //driver.remove();
    }
}
