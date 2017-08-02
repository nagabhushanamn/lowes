package com.shop;

import java.util.Arrays;
import java.util.List;

import om.shop.bill.Billing;
import om.shop.bill.BillingImpl;
import om.shop.pm.PriceMatrix;
import om.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// init
		PriceMatrix priceMatrix = new PriceMatrixImpl_v2();
		Billing billingComp = new BillingImpl(priceMatrix);

		// use
		List<String> cart = Arrays.asList("123456", "654321");
		double totalPrice = billingComp.getTotalPrice(cart);
		System.out.println(totalPrice);

		// destroy
		// ...

	}

}
