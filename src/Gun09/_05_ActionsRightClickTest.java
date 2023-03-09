package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionsRightClickTest extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
        Actions aksiyonlar=new Actions(driver);
       Action aksiyon=aksiyonlar.moveToElement(element).contextClick().build();
       aksiyon.perform();

       //new Actions(driver).contextClick(element).build().perform();
       // aksiyonlar.moveToElement(element).contextClick().build().perform();


    }
}
