package musicshop;

public class Item implements ISell{

    private String description;
    private double priceBought;
    private double priceToSell;

    public Item(String description, double priceBought, double priceToSell) {
        this.description = description;
        this.priceBought = priceBought;
        this.priceToSell = priceToSell;
    }

    public String getDescription() {
        return description;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceToSell() {
        return priceToSell;
    }

    public double calculateMarkup() {
        return this.priceToSell - this.priceBought;
    }
}
