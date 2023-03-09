package Gun09;

import Utility.BaseDriver;
import com.beust.ah.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionsDoubleClickTest extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(element).doubleClick().build();
        aksiyon.perform();
        // aksiyonlar.moveToElement(element).doubleClick().build().perform();
        //aksiyonlar.doubleClick(element);
        BekleKapat();
    }
}
