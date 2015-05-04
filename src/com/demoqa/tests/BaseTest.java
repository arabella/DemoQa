package com.demoqa.tests;

import org.junit.After;
import org.junit.Before;

import com.demoqa.framework.Driver;
import com.demoqa.framework.LoginPage;

public class BaseTest {
	
	@Before
	public void init()
	{
		Driver.initialize();
		LoginPage.goTo();
		LoginPage.loginAs("admin").withPassword("password").login();
	}

	@After
	public void clear() {
		Driver.close();
	}

}
