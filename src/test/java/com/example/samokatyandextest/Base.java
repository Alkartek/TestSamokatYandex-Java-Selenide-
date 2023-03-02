package com.example.samokatyandextest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

public class Base {
    public void setUP(){
        WebDriverManager.firefoxdriver().setup();//выбираем и устанавливаем браузер
        Configuration.browser = "firefox"; //называем бразуер
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "3024x1964"; //Задаем размер экрана
        Configuration.headless = true; // делаем браузер невидимым(тесты проходят без открытия браузера

    }

    @Before
    public void init(){
        setUP();
    }

    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
