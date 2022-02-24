package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;

import java.util.ArrayList;
import java.util.List;

public class ObservableStockImpl extends ObservableStock {

    //@TODO: Add any necessary fields
    private ArrayList<ObserverStockExchangeCenter> observers;

    public ObservableStockImpl(StockType name){
        super(name);
        //@TODO: Implememnt me
        observers = new ArrayList<ObserverStockExchangeCenter>();
    }

    public void notifyPriceChange(double price){
        //@TODO: Implememnt me
        for(ObserverStockExchangeCenter observer : observers) {
            observer.notifyChange(this.getName(), price);
        }
    }
    public void registerStockExchangeCenter(ObserverStockExchangeCenter oc){
        //@TODO: Implememnt me
        observers.add(oc);
    }

    //@TODO: Override any necessary methods
    @Override
    public void setPrice(double price) {
        super.setPrice(price);
        notifyPriceChange(price);
    }
}
