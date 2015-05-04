package com.demoqa.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import com.demoqa.framework.ProductPage;
import com.demoqa.framework.SearchForm;
import com.demoqa.framework.UserLoggedView;

public class OnlineStoreTests extends BaseTest {
	
	@Test
	public void user_can_login() {
		assertEquals("Login successful", "Profile", UserLoggedView.getTitle());
	}
	
	@Test
	public void user_can_logout() {
		UserLoggedView.openAccMenu().logout();

		assertEquals("Successful logout", "You are now logged out.", UserLoggedView.getMsg());
	}
	
	@Test
	public void user_can_search() {
		ProductPage.goTo();
		SearchForm.search();
		
		assertEquals("Product found", "Magic Mouse | Search Results | ONLINE STORE", ProductPage.getPageTitle());		
	}
	
	@Test
	public void addProductToCart() {
		ProductPage.goTo();
		ProductPage.storeItemsInCartCount();
		ProductPage.addProductToCart();
		
		assertEquals("Product added successfully", ProductPage.getPreviuosItemsInCartCount() + 1, ProductPage.getCurrentItemsInCartCount());
		
		ShoppingCart.removeProduct();
		
		assertEquals("Product added successfully", 0, ProductPage.getCurrentItemsInCartCount());
	}

}
