package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElemaninStatusu extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println("sali.isDisplayed() = " + sali.isDisplayed());
        System.out.println("sali.isEnabled() = " + sali.isEnabled());
        System.out.println("sali.isSelected() = " + sali.isSelected());
        sali.click();
        MyFunc.Bekle(5);
        System.out.println("sali.isSelected() = " + sali.isSelected());


    }
}
