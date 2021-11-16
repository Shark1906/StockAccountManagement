package com.stock.account;

public class Stock {

	private String stockName;
	private int numOfShare;
	private int sharePrice;
	private int stockValue;
	
	public Stock(String stockName, int numOfShare, int sharePrice, int stockValue) {
		super();
		this.stockName = stockName;
		this.numOfShare = numOfShare;
		this.sharePrice = sharePrice;
		this.stockValue = stockValue;
	}
	
	

	@Override
	public String toString() {
		return "StockName=" + stockName + " NumOfShare=" + numOfShare + " SharePrice=" + sharePrice
				+ " StockValue=" + stockValue;
	}
}
