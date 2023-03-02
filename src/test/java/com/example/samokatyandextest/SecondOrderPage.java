package com.example.samokatyandextest;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SecondOrderPage {
    private final SelenideElement CALENDAR = $x("//input[@placeholder=\"* Когда привезти самокат\"]");
    private final SelenideElement TIME_ORDER = $x("//div[@class=\"Dropdown-placeholder\"]");
    private final SelenideElement COLOR = $x("//input[@id=\"black\"]");
    private final SelenideElement COMENT = $x("//input[@placeholder=\"Комментарий для курьера\"]");
    private final SelenideElement ORDER_BUTTON = $x("//button[@class=\"Button_Button__ra12g Button_Middle__1CSJM\"]");
    private final SelenideElement ASSERT_ORDER = $x("//div[@class=\"Order_ModalHeader__3FDaJ\"]");
    private final SelenideElement ASSERT_YES = $x("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");
    private final SelenideElement RESULT_ORDER = $x("//div[@class=\"Order_ModalHeader__3FDaJ\"]");
    private final SelenideElement CHOOSE_DATE = $x("//div[@aria-label=\"Choose среда, 8-е марта 2023 г.\"]");
    private final SelenideElement CHIISE_TIME = $x("//div[contains(text(),'четверо')]");
    private final SelenideElement WAIT= $x("//div[@class=\"Order_Header__BZXOb\"]");
    private final SelenideElement COMPLITE = $x("//button[contains(text(),\"Посмотреть статус\")]");
    private final SelenideElement ASSERT_ORDER_STATUS = $x("//button[@class=\"Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i\"]");

    public void order_second_form(){
        CALENDAR.click();
        CHOOSE_DATE.click();
        TIME_ORDER.click();
        CHIISE_TIME.click();
        COLOR.click();
        COMENT.sendKeys("-");

    }

    public void form_order_button(){
        ORDER_BUTTON.click();
        ASSERT_YES.click();
    }

    public void last_order_accept(){
        COMPLITE.click();
    }

    public String assert_order_status(){
        return ASSERT_ORDER_STATUS.getText();


    }
}
