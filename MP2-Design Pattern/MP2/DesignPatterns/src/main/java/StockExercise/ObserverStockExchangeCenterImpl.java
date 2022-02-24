package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;

public class ObserverStockExchangeCenterImpl extends ObserverStockExchangeCenter {
    public ObserverStockExchangeCenterImpl() {
        super();
    }

    @Override
    public void buyStock(ObservableStock s){
        super.buyStock(s);
        this.observe(s);
    }

    @Override
    public void notifyChange(StockType type, double price){
        //@TODO: Implement me
        this.ownedStock.put(type,price);
    }

    //@TODO: Override any necessary methods

    public void observe(ObservableStock o){
        //@TODO: Implement me
        //ObserverStockExchangeCenter oc = new ObserverStockExchangeCenterImpl();
        //oc.buyStock(o);
        o.registerStockExchangeCenter(this);

    }
}
