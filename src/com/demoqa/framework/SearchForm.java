package com.demoqa.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchForm {
	
	public static String query;
	
	public SearchForm(String query) {
		SearchForm.query = query;
	}

	public static void search() {
		WebElement searchInput = Driver.Instance.findElement(By.xpath("//input[@type='text'and @name='s']"));
		searchInput.sendKeys("Magic Mouse");
		searchInput.sendKeys(Keys.RETURN);
	}

}
