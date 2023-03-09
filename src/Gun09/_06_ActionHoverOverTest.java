package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionHoverOverTest extends BaseDriver {
    @Test public void Test1(){
        driver.get("https://www.hepsiburada.com/");

        WebElement element=driver.findElement(By.xpath("//span[text()='Moda']"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).build();
        aksiyon.perform();

        BekleKapat();
    }
}
