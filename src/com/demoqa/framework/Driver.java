package com.demoqa.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	public static WebDriver Instance;
	private static String baseUrl = "http://store.demoqa.com/";
	
	public static void initialize() {
		Instance = new FirefoxDriver();
		Instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void goTo(String url) {
		Driver.Instance.navigate().to(baseUrl + url);
	}

	public static void close() {
		Driver.Instance.close();		
	}
}
