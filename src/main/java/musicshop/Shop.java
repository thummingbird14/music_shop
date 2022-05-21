package musicshop;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell newitem){
        stock.add(newitem);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }

    public double calculateProfit(){
        double profit = 0;
        for (ISell object:stock){
            profit += object.calculateMarkup();}
        return profit;
        }

}


