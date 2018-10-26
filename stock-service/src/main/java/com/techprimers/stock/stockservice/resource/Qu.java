package com.techprimers.stock.stockservice.resource;

import java.math.BigDecimal;

class Qu {
	private String quote;
	private BigDecimal price;
	
	public Qu(String quote, BigDecimal price) {
		this.setQuote(quote);
		this.setPrice(price);
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
 