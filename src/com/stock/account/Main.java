package com.stock.account;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		StockPortfolio portfolio = new StockPortfolio();
		portfolio.readFile();
		portfolio.generateReport();

	}

}
