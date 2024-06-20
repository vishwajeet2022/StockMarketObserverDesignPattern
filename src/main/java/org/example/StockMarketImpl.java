package org.example;
import java.util.*;

public class StockMarketImpl implements StockInterface{
    Map<String, Double> stockPriceMap;
    List<Observer> observerList;

    StockMarketImpl(){
        this.stockPriceMap=new HashMap<>();
        this.observerList=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
    public void setStockPrice(String stockSymbol,double stockPrice){
        stockPriceMap.put(stockSymbol,stockPrice);
        notifyALl(stockSymbol,stockPrice);
    }

    @Override
    public void notifyALl(String stockSymbol, double stockPrice) {
        for(Observer observer: observerList){
            observer.update(stockSymbol,stockPrice);
        }
    }
}
