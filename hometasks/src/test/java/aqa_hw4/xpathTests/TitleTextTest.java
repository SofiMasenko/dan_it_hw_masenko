package aqa_hw4.xpathTests;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class TitleTextTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebElement headerCatalogButton = driver.findElement(By.xpath("//div[@class='header-catalog-button']"));
        headerCatalogButton.click();

        sleep(2000);

        WebElement carAndButton = driver.findElement(By.xpath("//a[@data-id='898']"));
        carAndButton.click();

        sleep(2000);

        WebElement titleText = driver.findElement(By.xpath("//h1[@class='title-page flex middle-xs section-title']"));

        String actualTitle = titleText.getText().trim();
        Assert.assertTrue("The title does not contain the word 'Auto'. Actual text: " + actualTitle, actualTitle.contains("Авто"));

        sleep(3000);

        driver.quit();

    }
}
