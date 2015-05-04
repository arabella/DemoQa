package com.demoqa.framework;

public class LoginPage {

	public static void goTo() {
		Driver.goTo("tools-qa/");
	}

	public static LoginCommand loginAs(String userName) {
		return new LoginCommand(userName);
	}
	

}
