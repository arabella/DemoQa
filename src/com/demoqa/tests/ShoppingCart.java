package com.demoqa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demoqa.framework.Driver;

public class ShoppingCart {

	public static void removeProduct() {
		WebElement removeBtn = Driver.Instance.findElement(By.xpath("//input[@type='submit' and @value='Remove']"));
		removeBtn.click();
	}

}
