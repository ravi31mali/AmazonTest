package com.epam.AmazonTest.driver;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	private static final Logger logger = Logger.getLogger(DriverFactory.class);

	private DriverFactory() {
	}

	public static WebDriver getDriver(String browserName) {
		WebDriver driver;
		switch (browserName) {

			case "firefox":
				logger.info("firefox driver instance created");
				driver = new FirefoxBrowser().initDriver();
				break;

			case "opera":
				logger.info("opera driver instance created");
				driver = new OperaBrowser ().initDriver();
				break;

			case "headless":
				logger.info("headless driver instance created");
				driver = new HeadlessBrowser().initDriver();
				break;

			default:
				logger.info("chrome driver instance created");
				driver = new ChromeBrowser().initDriver();

		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void closeDriver(WebDriver driver) {
		driver.quit();
	}

}
