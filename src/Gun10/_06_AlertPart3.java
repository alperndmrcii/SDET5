package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        WebElement clickme2 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        MyFunc.Bekle(2);
        clickme2.click();
        MyFunc.Bekle(2);

        driver.switchTo().alert().sendKeys("Alperen");
        driver.switchTo().alert().accept();

        WebElement txtActual=driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue("Beklenen Yazı Gözüktü Mü ?",txtActual.getText().contains("Alperen"));

        BekleKapat();


    }
}
