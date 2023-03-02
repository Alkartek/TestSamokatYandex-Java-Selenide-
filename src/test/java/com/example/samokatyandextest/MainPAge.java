package com.example.samokatyandextest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPAge {
    private final SelenideElement oneQBZ = $x("//*[@id=\"accordion__heading-0\"]");
    private final SelenideElement twoQBZ = $x("//*[@id=\"accordion__heading-1\"]");
    private final SelenideElement threeQBZ = $x("//*[@id=\"accordion__heading-2\"]");
    private final SelenideElement fourQBZ = $x("//*[@id=\"accordion__heading-3\"]");
    private final SelenideElement fiveQBZ = $x("//*[@id=\"accordion__heading-4\"]");
    private final SelenideElement sixQBZ = $x("//*[@id=\"accordion__heading-5\"]");
    private final SelenideElement sevenQBZ = $x("//*[@id=\"accordion__heading-6\"]");
    private final SelenideElement eightQBZ = $x("//*[@id=\"accordion__heading-7\"]");

    private final SelenideElement scrollToTest = $x("/html/body/div/div/div/div[5]/div[1]");

    private final SelenideElement buttonOreder = $x("//button[@class=\"Button_Button__ra12g\"]");
    private final SelenideElement buttenOrderSecond = $x("//button[@class=\"Button_Button__ra12g Button_Middle__1CSJM\"]");
    private final SelenideElement samokatLogo = $x("//a[@class=\"Header_LogoScooter__3lsAR\"]");
    private final SelenideElement yandexLogo = $x("//a[@class=\"Header_LogoYandex__3TSOI\"]");
    private final SelenideElement assertTest = $x("//div[@class=\"Home_SubHeader__zwi_E\"]");
    private final SelenideElement assertYandex = $x("//button[@class=\"arrow__button\"]");



    public MainPAge(String URL){
        Selenide.open(URL);
    }

    public void move(String Locator){
        $x(Locator).scrollTo();
    }

    public void clickToElements(){

        oneQBZ.click();
        twoQBZ.click();
        threeQBZ.click();
        fourQBZ.click();
        fiveQBZ.click();
        sixQBZ.click();
        sevenQBZ.click();
        eightQBZ.click();
    }

    public void clickToOrder(){
        buttonOreder.click();
    }

    public void clickToOrderSecond(){
        buttenOrderSecond.click();
    }

    public void clickToLogoSamokat(){
        samokatLogo.click();
    }

    public void clickToYandexLogo(){
        yandexLogo.click();
    }

    public String assertTextMain(){
        return assertTest.getText();
    }

}
