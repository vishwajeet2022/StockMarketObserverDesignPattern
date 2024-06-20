package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StockMarketImpl stockMarket=new StockMarketImpl();
        Observer mobileObserver=new MobileObserver(stockMarket);

        stockMarket.registerObserver(mobileObserver);
        stockMarket.setStockPrice("TATA-Motors",955);
    }
}