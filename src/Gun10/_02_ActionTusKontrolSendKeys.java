package Gun10;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {
    @Test public void Test1(){

        driver.get("https://demoqa.com/auto-complete");
        WebElement element=driver.findElement(By.id("autoCompleteSingleInput"));
        // element.sendKeys("Black");
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("b").keyUp(Keys.SHIFT).sendKeys("lack").build();
        aksiyon.perform();
    }
}
