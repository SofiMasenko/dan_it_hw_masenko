package aqa_hw4.cssSelectorTests;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMenuLogoTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
       try {
           driver.get("https://hotline.ua/");
           driver.manage().window().maximize();

           WebElement mainMenuLogo = driver.findElement(By.cssSelector("[src='/frontend/_nuxt/img/logo-smart-uk.d959e9b.svg']"));

           Assert.assertEquals("The hotline logo is not displayed.", true, mainMenuLogo.isDisplayed());
       } finally {
           driver.quit();
       }

    }
}
