package com.demoqa.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	public static WebDriver Instance;
	
	public static void initialize() {
		Instance = new FirefoxDriver();
		Instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void close() {
		Driver.Instance.close();		
	}
}
