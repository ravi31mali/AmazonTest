package com.epam.AmazonTest.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaBrowser implements BaseBrowser {

    public WebDriver initDriver() {
        System.setProperty("webdriver.opera.driver", "D:\\AmazonTest\\src\\test\\resources\\operadriver.exe");
        return new OperaDriver ();
    }
}