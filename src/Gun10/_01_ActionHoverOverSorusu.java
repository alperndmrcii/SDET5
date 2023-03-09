package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionHoverOverSorusu extends BaseDriver {
    @Test
    public void Test1() {

//     https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.

        driver.get("https://www.etsy.com/");
        WebElement jewellery=driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']"));
        WebElement neckless=driver.findElement(By.xpath("//span[@id='side-nav-category-link-10873']"));
        WebElement bibnecklace=driver.findElement(By.xpath("//a[@id='catnav-l3-10881']"));

        Actions aksiyonlar=new Actions(driver);

        aksiyonlar.moveToElement(jewellery).build().perform();
        MyFunc.Bekle(2);
        aksiyonlar.moveToElement(neckless).build().perform();
        MyFunc.Bekle(2);
        aksiyonlar.moveToElement(bibnecklace).click().build().perform();


        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        Assert.assertTrue("Url de bib kolye var mı",driver.getCurrentUrl().contains("bib-necklaces"));

        BekleKapat();



    }
}
