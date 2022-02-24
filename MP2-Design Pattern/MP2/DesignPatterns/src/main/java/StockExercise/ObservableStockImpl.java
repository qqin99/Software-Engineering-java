package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ObservableStockImpl extends ObservableStock {

    //@TODO: Add any necessary fields
    //private double price;
    //private StockType name;
    private List<ObserverStockExchangeCenter> observers;

    public ObservableStockImpl(StockType name){
        super(name);
        //@TODO: Implememnt me
        this.observers=new ArrayList<ObserverStockExchangeCenter>() ;
    }

    @Override
    public void setPrice(double price) {
        super.setPrice (price);
        this.notifyPriceChange(price);
    }

    @Override
    public void notifyPriceChange(double price){
        //@TODO: Implememnt me
        //super.setPrice(price);
        for (ObserverStockExchangeCenter ct:this.observers){
            ct.notifyChange(this.getName(),price);
        }
    }

    @Override
    public void registerStockExchangeCenter(ObserverStockExchangeCenter oc){
        //@TODO: Implememnt me
        this.observers.add(oc);
    }

    //@TODO: Override any necessary methods
}
