package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramelerGecis extends BaseDriver {
    @Test public void Test1(){

        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);
        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Türkiye");
        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);
        WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
        Select avatar=new Select(animals);
        avatar.selectByVisibleText("Avatar");
        ////select[@id='animals']


    }
}
