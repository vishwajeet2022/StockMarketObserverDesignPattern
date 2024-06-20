package org.example;

public interface StockInterface {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyALl(String stockSymbol,double stockPrice);
}
