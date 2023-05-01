package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Driver {


//    private Driver(){
//
//    }
//
//    public static WebDriver driver;
//    public static WebDriver getDriver(){
//        if(driver == null){
//            System.setProperty("web.chrome.driver", "/Users/leon.kuchman/IdeaProjects/selenium_initial_project_5/chromedriver");
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        }
//        return driver;
//    }
//
//    public static void quitDriver(){
//        if(driver != null){
//            driver.quit();
//            driver = null;
//        }
//    }

    private Driver(){

    }

    public static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver == null){
            System.setProperty("web.chrome.driver", "/Users/leon.kuchman/IdeaProjects/selenium_initial_project_5/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        /*
        Implicit wait applies to each line that locates web elements
        - findElement() or findElements() (in 30 seconds 60 times to
        locate element, if cannot -> NoSuchElementException)
        - 500 milliseconds
         */
        return driver;
    }

    public static void quitDriver(){
        if(driver != null){
            driver.manage().deleteAllCookies();
            driver.quit();
            driver = null;
        }
    }




}
