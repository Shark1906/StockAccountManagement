package com.stock.account;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {
	
	private List<Stock> stockList; 
	
	public StockPortfolio() {
		stockList = new ArrayList<>();
	}
	
	public void readFile() throws IOException {
		
		String stockName;
		int numOfShare;
		int sharePrice;
		int shareValue;
		
		String filePath = "D:\\project\\training\\bridgelabz_rpf\\StockAccountManagement\\src\\com\\stock\\account\\stockinfo";
		List<String> inputs = new ArrayList<String>();
		Path path = Paths.get(filePath);
		inputs = Files.readAllLines(path);
		System.out.println(inputs);
		
		for(String input :inputs) {
			String[] param = input.split(" ");
			stockName = param[0];
			numOfShare = Integer.valueOf(param[1]);
			sharePrice = Integer.valueOf(param[2]);
			shareValue = numOfShare * sharePrice;
		
		Stock stock = new Stock(stockName, numOfShare, sharePrice, shareValue);
		stockList.add(stock);
		}
	}
	
	public void generateReport() throws IOException {
		String filePath = "D:\\project\\training\\bridgelabz_rpf\\StockAccountManagement\\src\\com\\stock\\account\\stockReport";
		BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
		for(Stock stock:stockList) {
			writer.write(stock+System.lineSeparator());
		}
	writer.close();
	}
}
