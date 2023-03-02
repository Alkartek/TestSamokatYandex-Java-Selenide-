package com.example.samokatyandextest;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class OrderPage {
    private final SelenideElement NAME = $x("//input[@placeholder=\"* Имя\"]");
    private final SelenideElement SECOND_NAME = $x("//input[@placeholder=\"* Фамилия\"]");
    private final SelenideElement ADRES = $x("//input[@placeholder=\"* Адрес: куда привезти заказ\"]");
    private final SelenideElement METRO = $x("//input[@placeholder=\"* Станция метро\"]");
    private final SelenideElement NUMBER = $x("//input[@placeholder=\"* Телефон: на него позвонит курьер\"]");
    private final SelenideElement NEXT_STEP = $x("//button[@class=\"Button_Button__ra12g Button_Middle__1CSJM\"]");
    private final SelenideElement STANTION = $x("//li[@data-index=\"1\"]");

    public void order(String Name, String Second_name, String Adres,String Number){
        NAME.sendKeys(Name);
        SECOND_NAME.sendKeys(Second_name);
        ADRES.sendKeys(Adres);
        METRO.click();
        STANTION.click();
        NUMBER.sendKeys(Number);
    }

    public void click_to_next_button(){
        NEXT_STEP.click();
    }
}
