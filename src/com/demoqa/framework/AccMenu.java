package com.demoqa.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccMenu {

	public void logout() {
		WebElement logoutLink = Driver.Instance.findElement(By.linkText("Log Out"));
		logoutLink.click();		
	}

}
