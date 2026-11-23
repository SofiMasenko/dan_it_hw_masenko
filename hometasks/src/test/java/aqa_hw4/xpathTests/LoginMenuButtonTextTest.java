package aqa_hw4.xpathTests;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class LoginMenuButtonTextTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebElement userInfoButton = driver.findElement(By.xpath("//div[@class='user-info']"));
        userInfoButton.click();

        sleep(3000);

        WebElement loginMenuButton = driver.findElement(By.xpath("//a[@href='/ua/login/']"));

        String actualText = loginMenuButton.getText().trim();

        sleep(3000);

        Assert.assertEquals("Invalid login button text.", "Увійти", actualText);

        sleep(3000);

        driver.quit();


    }
}
