package com.kafka.stream.creditcard;

import org.apache.kafka.streams.processor.AbstractProcessor;

public class CreditCardAnonymizer extends AbstractProcessor<String, Purchase> {

	private static final String CC_NUMBER_REPLACEMENT="xxxx-xxxx-xxxx-";
	
	@Override
	public void process(String key, Purchase purchase) {
		String last4Digits = purchase.getCreditCardNumber().split("-")[3];
		Purchase processedPurchase = Purchase.builder(purchase).creditCardNumber(CC_NUMBER_REPLACEMENT+last4Digits).build();
		
		context().forward(key, processedPurchase);
		context().commit();
	}
	
}
