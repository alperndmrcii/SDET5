package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionsClickTest extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Actions aksiyonlar = new Actions(driver); // web sayfası aksiyonlara açıldı
        Action aksiyon = aksiyonlar.moveToElement(element).click().build(); // elementin üzerine git click için hazırla
        aksiyon.perform(); // tek bir adımda bunu buildin sonuna da koyabilirsin

        BekleKapat();
    }
}
