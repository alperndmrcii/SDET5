package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseDriver {

    @Test public void Test1(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        // Alertleri nasıl kullanırsın ?
        //

        WebElement clickme1= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        clickme1.click();
        MyFunc.Bekle(2);

        driver.switchTo().alert().accept();


        BekleKapat();






    }
}
