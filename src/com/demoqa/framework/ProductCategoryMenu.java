package com.demoqa.framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductCategoryMenu {
	//public static List <String> categories;
	
	public static void chooseCategory() 
	{
		WebElement catName = Driver.Instance.findElement(By.linkText("iPods"));
		catName.click();
	}
}
