package com.demoqa.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ProductPage {
	
	private static int lastCount;
	public static int previuosItemsInCartCount;
	public static int currentItemsInCartCount;
	
	public static int getPreviuosItemsInCartCount() {
		return lastCount;
	}
	
	public static int getCurrentItemsInCartCount() {
		return getItemsInCartCount();
	}

	public static void goTo() {
		Driver.Instance.navigate().to("http://store.demoqa.com");
	}
	
	public static String getPageTitle()
	{
		String pageTitle = Driver.Instance.getTitle();
		return pageTitle;
	}

	public static void storeItemsInCartCount() {
		lastCount = getItemsInCartCount();		
	}

	private static int getItemsInCartCount() {
		WebElement itemsCount = Driver.Instance.findElement(By.xpath("//em[@class='count']"));
		return Integer.parseInt(itemsCount.getText());
	}
	
	public static ProductCategoryMenu toggleDropdown() {
		WebElement dropdown = Driver.Instance.findElement(By.id("menu-item-33"));
		Actions action = new Actions(Driver.Instance);
		action.moveToElement(dropdown).build().perform();
		return new ProductCategoryMenu();
	}

	public static void addProductToCart() {
		toggleDropdown();
		ProductCategoryMenu.chooseCategory();
		WebElement product = Driver.Instance.findElement(By.partialLinkText("Apple iPod touch 32GB"));
		product.click();
		WebElement buyBtn = Driver.Instance.findElement(By.xpath("//input[@type='submit' and @name='Buy']"));
		buyBtn.click();
		
		WebElement goToCheckoutBtn = Driver.Instance.findElement(By.linkText("Go to Checkout"));
		goToCheckoutBtn.click();
	}
}
