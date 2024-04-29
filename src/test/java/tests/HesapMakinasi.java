package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.Test;
import pages.HesapMakinasiPage;
import utilities.Driver;

import java.net.MalformedURLException;

public class HesapMakinasi {

    HesapMakinasiPage hesapMakinasiPage=new HesapMakinasiPage();
    @Test
    public void ilkHesapAppTest() throws MalformedURLException {

        Driver.getAndroidDriver();
        //Appium server'da path'ini sil "/wd/hub" sadece bastaki / kalsin

        //300*7
        hesapMakinasiPage.uc.click();
        hesapMakinasiPage.sifir.click();
        hesapMakinasiPage.sifir.click();
        hesapMakinasiPage.carpi.click();
        hesapMakinasiPage.yedi.click();

       // Driver.getAndroidDriver().findElement(By.xpath("esra"));//bu sekilde de locte alinabilir

        TouchAction action=new TouchAction<>(Driver.getAndroidDriver());
        action.press(PointOption.point(500,1000))
                .release()
                .perform();

    }
}
