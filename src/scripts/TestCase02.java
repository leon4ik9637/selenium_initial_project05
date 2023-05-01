package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.etsy.com/");

        WebElement giftsForMum = driver.findElement(By.cssSelector("span[class='wt-display-table-cell wt-text-left-xs']"));
        giftsForMum.click();
        Thread.sleep(4000);

        if(driver.getTitle().contains("Day Gifts")) System.out.println("User is on Gifts for Mum page");
        else throw new NotFoundException("User is not routed to Gifts for Mum");


        WebElement heading = driver.findElement(By.xpath("//h1"));

        if(heading.getText().equals("Mother’s Day Gifts 2023")) System.out.println("Heading validation PASSED");
        else throw new NotFoundException("Heading is not displayed as expected");

//        WebElement facebook = driver.findElement(By.xpath("//*[@id='collage-footer']/footer/div[3]/nav/div/div/div[4]/div/div/ul/li[2]/a"));
//        if(facebook.isDisplayed() && facebook.getAttribute("href").equals("https://www.facebook.com/EtsyCA"))
//            System.out.println("Facebook icon validation is PASSED");
//        else throw new NotFoundException("Facebook icon is not displayed as expected");
//
//        WebElement instagram = driver.findElement(By.xpath("//div[@class='wt-width-full']/div/ul/li[1]/a"));
//        if(instagram.getAttribute("href").equals("/ca/social-tracking?network=instagram"))
//            System.out.println("Instagram icon validation is PASSED");
//        else throw new NotFoundException("Instagram icon is not displayed as expected");

        Driver.quitDriver();

    }
}
