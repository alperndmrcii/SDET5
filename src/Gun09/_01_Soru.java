package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class _01_Soru extends BaseDriver {
    //        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.

    @Test
    public void Test1() {

        driver.get("https://www.facebook.com/");


        List<WebElement> cookiesAccept = driver.findElements(By.xpath("//button[text()='Allow essential and optional cookies']"));

        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();
        MyFunc.Bekle(2);

        WebElement hesapolustur = driver.findElement(By.linkText("Create new account"));
        hesapolustur.click();
        MyFunc.Bekle(1);

        WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
        firstname.sendKeys("Alperen");
        MyFunc.Bekle(1);

        WebElement lastname = driver.findElement(By.xpath("//*[@name='lastname']"));
        lastname.sendKeys("Demirci");
        MyFunc.Bekle(1);

        WebElement ReEmail = driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(ReEmail.isDisplayed());
        System.out.println("ReEmail.isDisplayed() = " + ReEmail.isDisplayed());
        MyFunc.Bekle(1);

        WebElement email = driver.findElement(By.xpath("//*[@name='reg_email__']"));
        email.sendKeys("alperndmrcii@gmail.com");
        MyFunc.Bekle(1);

        Assert.assertTrue(ReEmail.isDisplayed());
        System.out.println("ReEmail.isDisplayed() = " + ReEmail.isDisplayed());

        WebElement webDay=driver.findElement(By.id("day"));
        Select day=new Select(webDay);
        day.selectByVisibleText("25");

        WebElement webMonth=driver.findElement(By.id("month"));
        Select month=new Select(webMonth);
        month.selectByValue("3");

        WebElement webYear=driver.findElement(By.id("year"));
        Select year=new Select(webYear);
        year.selectByVisibleText("1983");




        BekleKapat();
    }
}
