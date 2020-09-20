import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class TestOfForm {

    @Test
    public void testSubmit()
    {
        WebDriver  browser;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rashe\\Downloads\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://forms.office.com/Pages/ResponsePage.aspx?id=DQSIkWdsW0yxEjajBLZtrQAAAAAAAAAAAAN__tQlYTdURExDM0ZZQVBZQzIyRjQzMjNMTFk3RTYzMy4u");

        WebElement SubmitBtn = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[3]/div[1]/button/div"));
        SubmitBtn.click();

        //WebElement nextBtn = browser.findElement(By.xpath(""));
        //nextBtn.click();

        WebElement ThankYouMessage = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/span"));
        Assertions.assertTrue(ThankYouMessage.getText().contains("Your response was submitted."));
        // browser.close();

    }


    @Test
    public void CheckBoxes() {
        WebDriver browser;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashe\\Downloads\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://forms.office.com/Pages/ResponsePage.aspx?id=DQSIkWdsW0yxEjajBLZtrQAAAAAAAAAAAAN__tQlYTdURExDM0ZZQVBZQzIyRjQzMjNMTFk3RTYzMy4u");

        WebElement CheckBoxes = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div/label/input"));
        CheckBoxes.click();


    }

    @Test
    public void RatingCheck() {
        WebDriver browser;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashe\\Downloads\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://forms.office.com/Pages/ResponsePage.aspx?id=DQSIkWdsW0yxEjajBLZtrQAAAAAAAAAAAAN__tQlYTdURExDM0ZZQVBZQzIyRjQzMjNMTFk3RTYzMy4u");

        WebElement RatingCheckBoxes = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[5]/div/div[2]/div/div/div[1]/span"));
        RatingCheckBoxes.click();
    }



}
