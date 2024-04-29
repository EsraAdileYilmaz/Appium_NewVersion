package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HesapMakinasiPage {
public void HesapMakinasi(){

    PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);
    }
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    public WebElement uc;

    @AndroidFindBy(accessibility = "0")
    public WebElement sifir;

    @AndroidFindBy(accessibility = "multiply")
    public WebElement carpi;

    @AndroidFindBy(accessibility = "7")
    public WebElement yedi;

 }
