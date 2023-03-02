package com.example.samokatyandextest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SamokatTest extends Base {

    private final static String BASE_URL = "https://qa-scooter.praktikum-services.ru/";
    private final static String SCROLL_TO = "/html/body/div/div/div/div[5]/div[1]";
    private final static String Name_person = "Дамир";
    private final static String Second_name = "Исаков";
    private final static String Ardes = "Улица";
    private final static String Number = "+79872932123";
    @Test
    public void checkElements(){
        MainPAge mainPAge = new MainPAge(BASE_URL);
        mainPAge.move(SCROLL_TO);
        mainPAge.clickToElements();
    }
    @Test
    public void orderPage(){
        MainPAge mainPAge = new MainPAge(BASE_URL);
        mainPAge.clickToOrder();
        OrderPage orderPage = new OrderPage();
        orderPage.order(Name_person, Second_name, Ardes, Number);
        orderPage.click_to_next_button();
        SecondOrderPage secondOrderPage = new SecondOrderPage();
        secondOrderPage.order_second_form();
        secondOrderPage.form_order_button();
        secondOrderPage.last_order_accept();
        String testText = secondOrderPage.assert_order_status();
        Assert.assertTrue(testText.contains("заказ"));
    }
    @Test
    public void switchSite(){
        MainPAge mainPAge = new MainPAge(BASE_URL);
        mainPAge.clickToOrder();
        mainPAge.clickToLogoSamokat();
        String mainText = mainPAge.assertTextMain();
        Assert.assertTrue(mainText.contains("Привезём"));
        mainPAge.clickToYandexLogo();


    }



}
