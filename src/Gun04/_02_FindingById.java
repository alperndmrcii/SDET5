package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); // went to website
        WebElement isimKutusu=driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("ismet");
        WebElement soyisimKutusu=driver.findElement(By.id("last_8"));
        MyFunc.Bekle(2);
        soyisimKutusu.sendKeys("Temur");
        MyFunc.Bekle(2);

        // Chrome ctrl+f ye basıldığında inspect bölümündee arama kutusu açar
        // first_8 yazarsak bütün kelimelrle arar
        // #first_8 yazarsak bütün id parametreleri içinde arar
        WebElement labelFirstName=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText = " + labelFirstName.getText());


        WebElement labelLastName=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());

        WebElement submitButton=driver.findElement(By.id("input_2"));
        submitButton.click();
        MyFunc.Bekle(5);
        driver.quit();

    }
}
