package com.demoqa.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginCommand {
	
	private String userName;
	private String password;
	
	public LoginCommand(String userName) {
		this.userName = userName;
	}

	public LoginCommand withPassword(String password) {
		this.password = password;
		return this;
	}

	public void login() {
		WebElement userNameInput = Driver.Instance.findElement(By.id("user_login"));
		userNameInput.sendKeys("adcash");
		
		WebElement passwordInput = Driver.Instance.findElement(By.id("user_pass"));
		passwordInput.sendKeys("WQT1WZfuJr4U");
		
		WebElement submitBtn = Driver.Instance.findElement(By.id("wp-submit"));
		submitBtn.click();
	}

}
