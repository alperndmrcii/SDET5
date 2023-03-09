package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        String mesajim="Hello Selenium";
        WebElement textBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        textBox.sendKeys(mesajim);
        WebElement button=driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        button.click();
        WebElement msg=driver.findElement(By.cssSelector("[id='display']"));
        if (msg.getText().equals(mesajim))
            System.out.println("test passed");
        else
            System.out.println("test fail");

        BekleKapat();


    }
}
