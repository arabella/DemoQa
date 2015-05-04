package com.demoqa.framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class UserLoggedView {

	//public static boolean at;
	public static String getTitle() {
		List <WebElement> h2s = Driver.Instance.findElements(By.tagName("h2"));
		return h2s.get(0).getText();
	}

	public static AccMenu openAccMenu() {
		WebElement menu = Driver.Instance.findElement(By.partialLinkText("Howdy"));
		Actions action = new Actions(Driver.Instance);
		action.moveToElement(menu).build().perform();
		return new AccMenu();
	}
	
	public static String getMsg() {
		WebElement msg = Driver.Instance.findElement(By.className("message"));
		return msg.getText();		
	}
	
	
	/*public static boolean isAt() {
		List <WebElement> h2s = Driver.Instance.findElements(By.tagName("h2"));
		if(h2s.size() > 0)
		return h2s.get(0).getText() == "Profile";
		else return false;
	}*/


}
