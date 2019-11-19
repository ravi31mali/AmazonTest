package com.epam.AmazonTest.tests;

import com.epam.AmazonTest.pages.HomePage;

import com.epam.AmazonTest.pages.ProductPage;
import com.epam.AmazonTest.pages.SearchResultPage;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SearchProductTest extends TestBase {

	@Test
	public void searchProduct() {
		HomePage homePage = new HomePage(driver).openPage();
		SearchResultPage searchResultPage = homePage.searchForProduct("camera").openPage();
		ProductPage productPage = searchResultPage.selectProduct(1).openPage();
		assertTrue(productPage.checkAvailability());
		productPage.addToCart();
		assertTrue(productPage.getCartStatus());
	}

}
