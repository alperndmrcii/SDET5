package Gun06;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_CssSelector extends BaseDriver {
    @Test
    public  void Test1() {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        String mesajim = "Hello Selenium";
        WebElement textBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        textBox.sendKeys(mesajim);
        WebElement button = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        button.click();
        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue("Aranılan Mesaj Bulunamadi",msg.getText().equals(mesajim));

        BekleKapat();

    }
}
