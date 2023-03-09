package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionYonTuslari extends BaseDriver {
    @Test public void Test1(){
        driver.get("https://demoqa.com/auto-complete");
        WebElement txtBox=driver.findElement(By.id("autoCompleteSingleInput"));
        Actions aksiyonlar=new Actions(driver);

        Action aksiyon=aksiyonlar.moveToElement(txtBox).click().sendKeys("b").build();
        aksiyon.perform();
        MyFunc.Bekle(2);

        Action aksiyon2=aksiyonlar.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        aksiyon2.perform();

        BekleKapat();


    }
}
