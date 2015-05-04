package com.demoqa.framework;

public class LoginPage {

	public static void goTo() {
		Driver.Instance.navigate().to("http://store.demoqa.com/tools-qa/");
	}

	public static LoginCommand loginAs(String userName) {
		return new LoginCommand(userName);
	}
	

}
