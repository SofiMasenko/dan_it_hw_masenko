package aqa_hw3.Task2;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement searchCatalogBtn = driver.findElement(By.cssSelector("[class='header-catalog-button']"));
            searchCatalogBtn.click();

            WebElement searchSmartphone = driver.findElement(By.cssSelector("[data-id='14']"));
            searchSmartphone.click();

            String searchStuff = "Samsung";

            WebElement searchStr = driver.findElement(By.cssSelector("[type='text']"));
            searchStr.sendKeys(searchStuff);

            sleep(5000);

            WebElement searchSearchBtn = driver.findElement(By.cssSelector("[title='Пошук']"));
            searchSearchBtn.click();

            sleep(7000);

            WebElement titleTxt = driver.findElement(By.cssSelector("[class ='search__title']"));
            String pageTitleTxt = titleTxt.getText();

            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", pageTitleTxt, searchStuff), pageTitleTxt.contains(searchStuff));

        }catch (AssertionError ex){

            ex.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}
